/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package celilcavus.yemekHaneApp.Repository;

import celilcavus.yemekHaneApp.Context.DbContext;
import celilcavus.yemekHaneApp.Interfaces.IRepository;
import celilcavus.yemekHaneApp.Models.Customer;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Celil
 */
public class CustomerRepository extends DbContext implements IRepository<Customer> {

    @Override
    public void Add(Customer item) {

        try {
            preparedStatement = connection.prepareCall("INSERT INTO customer (FirstName,LastName,Email,Phone) VALUES (?,?,?,?)");
            preparedStatement.setString(1, item.getFirstName());
            preparedStatement.setString(2, item.getLastName());
            preparedStatement.setString(3, item.getEmail());
            preparedStatement.setString(4, item.getPhone());
            int i = preparedStatement.executeUpdate();
            if (i >= 1) {
                System.out.println("Custome Başariyla Eklendi");
            } else {
                System.out.println("Ekleme Başarısız");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void Update(Customer item) {
        try {
            preparedStatement = connection.prepareCall("UPDATE customer SET FirstName = ?,LastName = ?,Email = ?,Phone = ? WHERE id = ?");
            preparedStatement.setInt(1, item.getId());
            preparedStatement.setString(2, item.getFirstName());
            preparedStatement.setString(3, item.getLastName());
            preparedStatement.setString(4, item.getEmail());
            preparedStatement.setString(5, item.getPhone());
            int i = preparedStatement.executeUpdate();
            if (i >= 1) {
                System.out.println("Custome Başariyla Güncellendi");
            } else {
                System.out.println("Başarısız");
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void Delete(Customer item) {
        try {
            preparedStatement = connection.prepareCall("DELETE FROM customer WHERE id = ?");
            preparedStatement.setInt(1, item.getId());
            int i = preparedStatement.executeUpdate();
            if (i >= 1) {
                System.out.println("Custome Başariyla Silindi");
            } else {
                System.out.println("Başarısız");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public List<Customer> GetAll() {
        List<Customer> list = new ArrayList<>();
        try {
            resultSet = this.statement.executeQuery("SELECT * FROM yemekhane.customer");
            if (resultSet != null) {
                while (resultSet.next()) {
                    Customer custom = new Customer();
                    custom.setId(resultSet.getInt("id"));
                    custom.setFirstName(resultSet.getString("FirtName"));
                    custom.setLastName(resultSet.getString("LastName"));
                    custom.setEmail(resultSet.getString("Email"));
                    custom.setPhone(resultSet.getString("Phone"));
                    list.add(custom);
                }
                return list;
            }
            else
            {
                resultSet.close();
            }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

    @Override
    public Customer GetById(int id) {
        Customer customer = new Customer();
        try {
            var custom = connection.prepareCall("SELECT * FROM customer WHERE id = ?");
            preparedStatement.setInt(1, id);
            resultSet = (ResultSet) custom;
            while (resultSet.next()) {

                customer.setId(resultSet.getInt("id"));
                customer.setFirstName(resultSet.getString("FirtName"));
                customer.setLastName(resultSet.getString("LastName"));
                customer.setEmail(resultSet.getString("Email"));
                customer.setPhone(resultSet.getString("Phone"));
            }
            return customer;

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }
}
