import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.CallableStatement;
public class CallableStatement1{
    public static void main(String args [])
   { 
       try{
          Connection con;
          ResultSet rs;
          CallableStatement stmt;
          Class.forName("com.mysql.jdbc.Driver");
          con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bsccsit", "root", "root");
          stmt=con.prepareCall("{call Countstudentsfrompokhara(?)}");
          stmt.registerOutParameter(1,java.sql.Types.INTEGER);
          stmt.execute();
          System.out.println("Total students from Pokhara"+stmt.getInt(1));
          
          
      con.close();
      stmt.close();
         }
   catch(Exception e)
     {
        System.out.println(e);
     }
  }
}
           
