
package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author LucasMarcon
 */
public class ConnectionPostgresql {

    private static Connection connection = null;
    
    public static Connection getConnection() {
        
        if (connection != null) return connection;
        else try {
            
                String driver   = "org.postgresql.Driver";
                String url      = "jdbc:postgresql://localhost:5432/Ecommerce";
                String user     = "postgres";
                String password = "root";
                
                Class.forName(driver);
                connection = DriverManager.getConnection(url, user, password);
            } catch (ClassNotFoundException | SQLException e) {e.printStackTrace();}
        return connection;
    }
}
