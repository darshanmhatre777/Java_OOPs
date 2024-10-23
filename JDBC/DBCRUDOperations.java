package day12;
import java.sql.*;
public class DBCRUDOperations {
	public static void main(String[] args) throws ClassNotFoundException{
		Connection con=null;
		String url="jdbc:mysql://localhost:3306/mycollege";
		Class.forName("com.mysql.cj.jdbc.Driver");
		String insertrecord="insert into students values (?,?,?,?,?);";
		String Selectrecords="select * from students";
		String updaterecord = "update students set marks=? where rollNo =?;";
		String deleterecord = "delete students ;";
		try {
			con=DriverManager.getConnection(url,"root","root");
			PreparedStatement pst = con.prepareStatement(insertrecord);
			pst.setInt(1,15);
			pst.setString(2,"Anand");
			pst.setString(3,"x");
			pst.setInt(4,2);
			pst.setInt(5,83);
			int count=pst.executeUpdate();
			System.out.println(count+"row(s) affected");
		}
		catch(SQLException e) {
			System.out.println(e);
		}
		try {
			con= DriverManager.getConnection(url,"root","root");
			Statement st = con.createStatement();
			ResultSet records = st.executeQuery(Selectrecords);
			while(records.next()) {
				System.out.println(records.getInt(1) +", "+ records.getString(2) + ", "+ records.getString(3)+", "+records.getInt(4)+", "+records.getInt(5)); 
			}
		}catch(SQLException e) {
			System.out.println(e);
		}
	}
}
