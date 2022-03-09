import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.CallableStatement;
public class CallableStatementTest
{
    public static void main(String args [])
   { 
       try{
          Connection con;
          ResultSet rs;
          CallableStatement stmt;
          Class.forName("com.mysql.jdbc.Driver");
          con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bsccsit", "root", "root");
          stmt=con.prepareCall("{call showstudent(?)}");
          stmt.setInt(1,2);
          rs=stmt.executeQuery();
          while(rs.next()){
          System.out.println("ID:"+rs.getInt("id"));
          System.out.println("Name:"+rs.getString("sname"));
  }
      con.close();
      stmt.close();
         }
   catch(Exception e)
     {
        System.out.println(e);
     }
  }
}
           
