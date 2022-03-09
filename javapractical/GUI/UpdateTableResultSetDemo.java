import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class UpdateTableResultSetDemo
{
     static Connection con;
     public static Connection connect()
     {
       try
       {
         if(con!=null)
             return con;
         Class.forName("com.mysql.jdbc.Driver");
         String user = "root";
         String password = "root";
         String url = "jdbc:mysql://localhost:3306/bsccsit?allowMultiQueries=true"; 
         con = DriverManager.getConnection(url, user, password);
         return con;
       }catch(Exception e)
       {
          System.out.println(e);
          return null;
       }
     }

    public static void test() throws Exception
    {
        
        Connection con = connect();
        Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        String sql = "select * from student";
        boolean results = stmt.execute(sql);
       
            ResultSet rs = stmt.getResultSet(); 
	System.out.println("RESULT Before UPDATE");
            while(rs.next())
            {
               System.out.print("ID:" + rs.getInt(1) );
               System.out.print(", Name:" + rs.getString(2) );
               System.out.print(", Phone:" + rs.getString("sphone") );
               System.out.print("Phone:" + rs.getString("scity") +"\n" );
            }
 	rs.moveToInsertRow();
	rs.updateString(2, "x");
	rs.updateString(3, "111");
	rs.updateString(4, "y");
	rs.insertRow();

	System.out.println("RESULT AFTER UPDATE");	
	 while(rs.previous())
            {
               System.out.print("ID:" + rs.getInt(1) );
               System.out.print(", Name:" + rs.getString(2) );
               System.out.print(", Phone:" + rs.getString("sphone") );
               System.out.print("Phone:" + rs.getString("scity") +"\n" );
            }
   }

    public static void main(String args[])   throws Exception 
    {
         test();
    }


}