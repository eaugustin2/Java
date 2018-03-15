import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class DatabaseConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		
		 Connection connect = null;
	        PreparedStatement preparedStatement = null;
	        ResultSet rs;

	    	
			try {
			      // This will load the MySQL driver, each DB has its own driver
			      Class.forName("com.mysql.jdbc.Driver");
			      
			      // Setup the connection with the DB
			    // connect = DriverManager
		    		//        .getConnection("jdbc:mysql://149.4.223.xxx/studentdb?"+ "user=whatever&password=whatever");
			      
			      
			      //connect = DriverManager
	    		    //      .getConnection("jdbc:mysql://127.0.0.1:3306/studentdb"+ "user=root&password=Nanoune12!");
			      
			      //URl to connect to correct database with username and password
			      connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Wedding", "newuser","Nanoune12!");
			      
			
		
		
		
		
		
		
		
		 //Selecting from a table 
	      try{
	    	  //Step 1 get a connection if not any
	    	  
	    	  //Step 2 Prepare the Prepared Statement for mysql commands for a specific column or for all the data 
	      PreparedStatement statement = connect.prepareStatement("SELECT * FROM Guest");
	      
	      	//Step3 Make a Result Set to read back the data from the DB/ Almost like an iterator 
	      	ResultSet result = statement.executeQuery();
	      	
	      	//Step 4 Output data through iteration
	      	while(result.next()){
	      		
	      		System.out.print(result.getString("First"));
	      		System.out.print(" ");
	      		System.out.println(result.getString("Last"));
	      		
	      	}
	      	System.out.println();
	      	System.out.println("Selection complete");
	      		      	
	      
	      }catch(Exception e){System.out.println(e);}
	      //return null;
			
			}
			
			finally{System.out.println("Process Complete.");
	
		}


	}
}
		
	


