package jdbcjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	
	//MySQL database Connection
    public final Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/jobportal";
        String name = "root";
        String password = "System@12345";
        Connection con = DriverManager.getConnection(url, name, password);
        return con;
    }

}