package practice_hrm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class JDBCSelectQueryTest {

	public static void main(String[] args) throws Throwable {
		Connection con=null;
		try {
			Driver driverRef=new Driver();
			DriverManager.registerDriver(driverRef);
			//step2:get connection with database
			 con=DriverManager.getConnection("jdbc:mysql://rmgtestingserver:3333/projects","root@%","root");
			//step3:Issue create statement
			Statement state=con.createStatement();
			//step4:execute query
			ResultSet result=state.executeQuery("select * from project");
			while(result.next())
			{
				System.out.println(result.getString(1)+"-"+result.getString(2)+"-"+result.getString(3)+result.getString(4)+"-"+result.getString(5));
			}
			
			
			
			
		} finally {
			con.close();
			
		    System.out.println("db closed");

	
		}

	    

	}

}
