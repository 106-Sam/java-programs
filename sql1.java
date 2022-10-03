import java.sql.*;
class Sql1{
	public static void main(String args[])throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306manoj","root","root");
		Statement st = con.createStatement();
		st.executeUpdate("create table Emp(id varchar(20),name varchar(25),salary varchar(25),age varchar(30))");
		System.out.println("table and rows are created....;.");
		con.close();
	}
}

