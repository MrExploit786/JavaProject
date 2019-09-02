package CoreJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
	
	private String db_url="jdbc:mysql://127.0.0.1:3306/student";

	private String db_driver="com.mysql.jdbc.Driver";

	private String db_id="root";

	private String db_password="root";
	
	
	// we have setted all 4  string parameter 
	
	// now we will make method of Connection 
	
	public Connection getConnection (){
		
		// now we will make the object of connection 
		
		Connection con = null; 
		

		
		try {
			Class.forName(db_driver); 		// now we ll register the driver 
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			con = DriverManager.getConnection(db_url, db_id, db_password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Connection Sucssess");
		
		return con;
		
		
		
	}
	
	public static void main(String[] args) {
		
		JDBCConnection jc = new JDBCConnection();
		
		Connection conn = 	jc.getConnection();
		
		
		
	}

}
