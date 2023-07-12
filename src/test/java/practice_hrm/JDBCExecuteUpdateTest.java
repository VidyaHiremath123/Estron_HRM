package practice_hrm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class JDBCExecuteUpdateTest {

	public static void main(String[] args) throws Throwable {
		Connection con=null;
		try {
			 Driver driverRef = new Driver();

			    DriverManager.registerDriver(driverRef);
			    
			

			    // Step 2: get the connection with database // give db name
			  con = DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects", "root@%", "root");
			
			    Statement state = con.createStatement();
			
			    // Step 4: Execute a query // give table name
			
			    String query = "insert into project values('TY_PROJ_1240','smith','29/06/2023','tyss','completed',5);";
			
			    int result = state.executeUpdate(query);
			
			    System.out.println(result);
			
			    if(result==1)
			
			    {
		             System.out.println("data is added");
			
			    }
			
			    else
			
			    {
			
			      System.out.println("data not added");
			
			    }
			
			
			
			
			
			
		} finally {
			con.close();
			
		    System.out.println("db closed");

			// TODO: handle finally clause
		}

	    
	    
	    
	
	    


	


	

}




	}


