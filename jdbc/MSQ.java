import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
public class MSQ
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
        int rsCount=0;
        Connection con = connect();
        Statement stmt = con.createStatement();
        String sql = "select * from student where id>1; select * from student where scity ='LA';";
        boolean results = stmt.execute(sql);
        do
        {
            ResultSet rs = stmt.getResultSet();
            rsCount++;
            System.out.println("Result Set #:" + rsCount);
            
            while(rs.next())
            {
               System.out.print("ID:" + rs.getInt(1) );
               System.out.print(", Name:" + rs.getString(2) );
               System.out.print(", Phone:" + rs.getString("sphone") );
               System.out.print("Phone:" + rs.getString("scity") +"\n" );
            }
            rs.close();
            results = stmt.getMoreResults();
        }while(results);
    }

    public static void main(String args[])   throws Exception 
    {
         test();
    }


}