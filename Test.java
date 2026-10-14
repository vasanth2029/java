import java.sql.*;
public class Test
{
	public static void main(String args[])trows Exception
	{
	Connection con;
	PreparedStatement ps;

	class.forName("com.mysql.jdbc.Driver");

	con=DriverManager.getConnection("jdbc:mysql://localhost:3307/Karthi","root","");
	ps=con.prepareStatement("insert into students values(101,'karthi,'BE(cse)',7.25)");
	ps.executeUpdate();
	ps.close();
	System.out.println("Student Record Inserted");
	}
}
