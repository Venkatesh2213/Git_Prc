package edu.db.conn;

import java.sql.DriverManager;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSetImpl;
import com.mysql.jdbc.Statement;

public class DbCon {
	public static void main(String[] args) {
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=  (Connection) DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/lakshay","root","root");  
		
				//here sonoo is database name, root is username and password  
		
				Statement stmt=(Statement) con.createStatement();  
				ResultSetImpl rs=(ResultSetImpl) stmt.executeQuery("select * from employe");  
				//while(rs.next())  
				//System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
				con.close();  
				
	}catch(Exception e){ System.out.println(e);}  
	}
}
