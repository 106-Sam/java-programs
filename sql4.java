import java.sql.*;
class  sql4{
	public static void main(String args[])throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/manoj","root","root");
		Statement st = con.createStatement();
		st.executeUpdate("Update Emp set salary=60000 where id=6201");
		st.executeUpdate("Update Emp set salary=70000 where id=6202");
		st.executeUpdate("Update Emp set salary=65000 where id=6203");
		System.out.println("table updated successfully......./");
	}
}

