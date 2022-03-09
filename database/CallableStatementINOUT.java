import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.CallableStatement;
public class CallableStatementINOUT{
    public static void main(String args [])
   { 
       try{
          Connection con;
          ResultSet rs;
          CallableStatement stmt;
          Class.forName("com.mysql.jdbc.Driver");
          con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bsccsit", "root", "root");
          stmt=con.prepareCall("{call addtional(?)}");
          stmt.setInt(1,5);
          stmt.registerOutParameter(1,java.sql.Types.INTEGER);
          stmt.execute();
          System.out.println("Out Parameter updated value :"+stmt.getInt(1));
          
          
      con.close();
      stmt.close();
         }
   catch(Exception e)
     {
        System.out.println(e);
     }
  }
}
           
