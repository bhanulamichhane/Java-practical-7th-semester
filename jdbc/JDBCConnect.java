import java.sql.Connection;
import java.sql.DriverManager;
public class JDBCConnect
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
         String url = "jdbc:mysql://localhost:3306/bsccsit"; 
         con = DriverManager.getConnection(url, user, password);
         return con;
       }catch(Exception e)
       {
          System.out.println(e);
          return null;
       }
     }
}