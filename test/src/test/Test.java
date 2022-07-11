package test;

import java.sql.Connection;
import java.sql.DriverManager;
//ukyffiuggf76f67g
public class Test {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ma","root","root");
		String customerinsert="insert into customer_deatails values(111,'ramu','ramu@gmail.com','987654768','hyd')";
		
		}catch(	 Exception ex) {
			System.out.println(ex);
		}
		
	}
	

}
