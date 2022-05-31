import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectJDBC {
    String hostname="localhost:8083";
    String dbName="libraryy";
    String username="root";
    String password="123";

    String url="jdbc:mysql://"+hostname+"/"+dbName;
    public Connection connect(){
        //tao doi tuong connection
        Connection conn=null;

        try {
            conn= DriverManager.getConnection(url,username,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
