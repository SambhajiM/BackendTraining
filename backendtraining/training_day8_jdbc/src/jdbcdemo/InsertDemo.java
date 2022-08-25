package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDemo {
	
	public static void main(String[] args) throws Exception{
		//1. Collection DB information
		String driverClassName  = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/empdb";
		String username = "root";
		String password = "root";
		
		//2. Register the driver
		Class c = Class.forName(driverClassName);
		System.out.println(c);
		
		//3. Getting the Connection object
		Connection con = DriverManager.getConnection(url, username, password);
		System.out.println(con);
		
		//4. Create Statement object and execute query
		String sql = "insert into employees(name,contact) values('manvi','2345435436')";
		Statement stmt = con.createStatement();
		stmt.execute(sql);
		System.out.println("Sucess! Record added");
		
		//5. Release Resources
		stmt.close();
		con.close();
	}
}
