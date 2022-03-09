import java.sql.*;
public class StoredProcedureTest
{

    public static void main(String args[])
    {
       try
       {
                String url="jdbc:mysql://localhost:3306/bsccsit";
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(url, "root","root");

                CallableStatement stmt = con.prepareCall("{call liststudents(?)}");
                stmt.setInt(1,1);
                
                boolean isResultSet = stmt.execute();
                while(isResultSet){
                   ResultSet rs = stmt.getResultSet();
                   while(rs.next()){
                         System.out.println(rs.getInt("id"));
                         System.out.println(rs.getString("sname"));
                         System.out.println(rs.getString("sphone"));
                         System.out.println(rs.getString("scity"));
                   }
                   isResultSet = stmt.getMoreResults();
                }                
       }catch(Exception e){System.out.println(e);}

    }

}