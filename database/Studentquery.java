import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class Studentquery
{
     static Connection con;
     public Studentquery()
     {
       try
       {
          con = JDBCConnect.connect();
          
       }catch(Exception e)
       {
          System.out.println(e);
       }

     }
      public void insertStudent(Student s)
        {
           try
             {
               String query = "insert into student(sname, sphone, scity) values(?,?,?)";
               PreparedStatement stmt = con.prepareStatement(query);
               stmt.setString(1,s.getName());
               stmt.setString(2,s.getPhone());
               stmt.setString(3,s.getCity());
               stmt.executeUpdate();
              }
          catch(Exception e)
              {
             System.out.println(e);
               }
}
     public void listAllStudents()
     {
        String phone, name, city;
        int id;
        try
        {
            Statement stmt = con.createStatement();
            String query = "select * from student";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next())
            {
               id = rs.getInt("id"); 
               name = rs.getString("sname"); 
               phone = rs.getString("sphone");
               city = rs.getString("scity");

               Student s = new Student(id, name, phone, city);
               System.out.println(s);
            }
        }
              catch(Exception e)
        {
           System.out.println(e);
        }
     }public void searchStudent(String stdname)
     {
        String phone, name, city;
        int id;
        try
        {
            Statement stmt = con.createStatement();
            String query = "select * from student";
        
         
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next())
             {
                 name= rs.getString("sname");
                if(stdname.equals(name))
                {
                  id = rs.getInt("id");
                  phone=rs.getString("sphone");
                  city=rs.getString("scity");

                Student s = new Student(id, name, phone, city);
               System.out.println("success "+stdname+" found");
              System.out.println(s);
              return;
            }
}
               System.out.println(stdname +  "not found");
      }catch(Exception e)
        {
           System.out.println(e);
        }
}
}