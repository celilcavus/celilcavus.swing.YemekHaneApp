/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package celilcavus.yemekHaneApp.Repository;

import celilcavus.yemekHaneApp.Context.DbContext;
import celilcavus.yemekHaneApp.Interfaces.IRepository;
import celilcavus.yemekHaneApp.Models.Customer;
import celilcavus.yemekHaneApp.Models.Product;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Celil
 */
public class ProductRepository extends DbContext implements IRepository<Product> {

    @Override
    public void Add(Product item) {
        try {
            this.preparedStatement  = this.connection.prepareCall("INSERT INTO product (ProductName,Price) VALUES (?,?)");
            this.preparedStatement.setString(1, item.getProductName());
            this.preparedStatement.setFloat(2, item.getPrice());
            int i = this.preparedStatement.executeUpdate();
            if (i >= 1) {
                System.out.println("Başarili");
            } else {
                System.out.println("Başarisiz");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    @Override
    public void Update(Product item) {
       try {
            this.connection.prepareCall("UPDATE product SET ProductName = ?,Price = ? WHERE id = ?");
            this.preparedStatement.setInt(1, item.getId());
            this.preparedStatement.setString(2, item.getProductName());
            this.preparedStatement.setFloat(3, item.getPrice());
            int i = this.preparedStatement.executeUpdate();
            if (i >= 1) {
                System.out.println("Başarili");
            } else {
                System.out.println("Başarisiz");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void Delete(Product item) {
        try {
            this.connection.prepareCall("DELETE FROM product WHERE id = ?");
            this.preparedStatement.setInt(1, item.getId());
            int i = this.preparedStatement.executeUpdate();
            if (i >= 1) {
                System.out.println("Başarili");
            } else {
                System.out.println("Başarisiz");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public List<Product> GetAll() {
          List<Product> list = new ArrayList<>();
        try {
            resultSet = this.statement.executeQuery("SELECT * FROM yemekhane.product");
            if (resultSet != null) {
                while (resultSet.next()) {
                    Product product = new Product();
                    product.setId(resultSet.getInt("id"));
                    product.setProductName(resultSet.getString("ProductName"));
                    product.setPrice(resultSet.getFloat("Price"));
                  
                    list.add(product);
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
    public Product GetById(int id) {
         Product product = new Product();
        try {
            var custom = connection.prepareCall("SELECT * FROM product WHERE id = ?");
            preparedStatement.setInt(1, id);
            resultSet = (ResultSet) custom;
            while (resultSet.next()) {

                product.setId(resultSet.getInt("id"));
                product.setProductName(resultSet.getString("ProductName"));
                product.setPrice(resultSet.getFloat("Price"));
               
            }
            return product;

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

}
