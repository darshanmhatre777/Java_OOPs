package day12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BasicQueries {
	public static void main(String args[]) throws ClassNotFoundException{
		Connection con=null;
		String url = "jdbc:mysql://localhost:3306/mycollege";
		String createtable="create table students (\r\n"
				+ "rollno int not null,\r\n"
				+ "firstname varchar(20) not null,\r\n"
				+ "lastname varchar(20) not null,\r\n"
				+ "deptid int not null,\r\n"
				+ "marks int,\r\n"
				+ "primary key(rollno));\r\n"
				+ "";
		Class.forName("com.mysql.cj.jdbc.Driver");
		try {
			con = DriverManager.getConnection(url,"root","root");
			Statement st=con.createStatement();
			int count=st.executeUpdate(createtable);
			System.out.println(count+"row(s) affected");
		}
		catch(SQLException e) {
			System.out.println(e);
		}
	}
}
