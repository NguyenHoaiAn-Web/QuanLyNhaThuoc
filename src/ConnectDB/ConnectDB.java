package ConnectDB;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

public class ConnectDB{
	  
	 public  static Connection con = null;
	 private static ConnectDB instance = new ConnectDB();
	 public static ConnectDB getInstance() {
			return instance;
		}
	public void connect() {
		String url = "jdbc:sqlserver://localhost:1433;databasename=QuanLyNhaThuoc;encrypt=false";
		String user = "sa";
		String password = "12345";
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void disconnect() {
		if(con != null)
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	
	public static Connection getConnection() {
		return con;
	}
	
}

