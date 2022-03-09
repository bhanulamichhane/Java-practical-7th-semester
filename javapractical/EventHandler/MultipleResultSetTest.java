import java.sql.*;
public class MultipleResultSetTest
{
	public static void main(String args[]) throws Exception
	{
		Connection cin;
		ResultSet rs;
		Statement stmt;
		int rsCount=0;
		String query;
		Class.forName("com.mysql.jdbc.Driver");
		String url = ("jdbc:mysql://localhost:3306/bsccsit?allowMultiQueries=true");
		cin=DriverManager.getConnection(url,"root","root");
		stmt=cin.createStatement();
		query="Select * from student where id>1; Select * from student where scity='pokhara';";
		boolean results = stmt.execute(query);
		do
			{
				if (results)
					{
						rs=stmt.getResultSet();
						rsCount++;
						System.out.println("ResultSet #" + rsCount);
						while(rs.next())
						{
							int id = rs.getInt("id");
							String city = rs.getString("scity");
							String phone = rs.getString("sphone");
							String name = rs.getString("sname");
							System.out.println("Id"+id);
							System.out.println("Name"+name);
							System.out.println("Phone"+phone);
							System.out.println("City"+city);
						}
					rs.close();
					results=stmt.getMoreResults();
					
					}
			
			}
				while(results);
			
	}
}