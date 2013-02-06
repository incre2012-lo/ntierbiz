import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Demo{
	
    
	public static void main(String args[]){
	    Connection connection = null;
	    try {
	        // Load the JDBC driver
	        String driverName = "oracle.jdbc.driver.OracleDriver";
	        Class.forName(driverName);

	        // Create a connection to the database
	        String serverName = "127.0.0.1";
	        String portNumber = "1521";
	        String sid = "XE";
	        String url = "jdbc:oracle:thin:@" + serverName + ":" + portNumber + ":" + sid;
	        String username = "zoomshop";
	        String password = "intershop";
	        connection = DriverManager.getConnection(url, username, password);
	       System.out.println(connection.isValid(0));
	       
	    } catch (ClassNotFoundException e) {
	        // Could not find the database driver
	    } catch (SQLException e) {
	        // Could not connect to the database
	    }


	}
	
	
	
}