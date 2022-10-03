import java.sql.*;
class Sql2{
	public static void main(String args[])throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/manoj","root","root");
		Statement st = con.createStatement();
		st.executeUpdate("insert into Emp values(6201,'Maxx',50000,25)");
		st.executeUpdate("insert into Emp values(6202,'Julie',45000,23)");
		st.executeUpdate("insert into Emp values(6203,'Darken',30000,22)");
		st.executeUpdate("insert into Emp values(6204,'Mickey',60000,30)");
		st.executeUpdate("insert into Emp values(6205,'Baji',40000,27)");
		System.out.println("table and rows are created....;.");
		con.close();
	}
}

