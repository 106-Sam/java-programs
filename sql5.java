import java.sql.*;
class Sql5{
	public static void main(String args[])throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/manoj","root","root");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("Select * from Emp");
		while(rs.next()){
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
		}
		System.out.println("data retrived succesfully.....");
	}
}

