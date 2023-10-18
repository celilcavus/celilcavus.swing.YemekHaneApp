package celilcavus.yemekHaneApp.Context;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbContext {
    protected Connection connection = null;
    protected Statement statement = null;
    protected ResultSet resultSet = null;
    protected PreparedStatement preparedStatement;
    protected CallableStatement callableStatement;
    public DbContext() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/yemekhane";
            this.connection = DriverManager.getConnection(url, "root", "celil123");
            System.out.println("Bağlantı Başarili");
        } catch (Exception ex) {
            System.out.println("Bağlantı Başarısız");
            System.out.println(ex.getMessage());
        }

    }

}
