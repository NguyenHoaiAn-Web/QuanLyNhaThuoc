package ConnectDB;

import java.sql.Connection;
import java.sql.SQLException;

public class TestConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConnectDB connectDB = ConnectDB.getInstance();
        
        // Connect to the database
        connectDB.connect();
        
        // Get the connection object
        Connection connection = ConnectDB.getConnection();
        
 
        System.out.println(connection);
        
	}

}
