import java.sql.*;
class  sql3{
	public static void main(String args[])throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/manoj","root","root");
		Statement st = con.createStatement();
		st.executeUpdate("delete from Emp where name='baji'");
		System.out.println("row deleted succesfully.../");
	}
}


