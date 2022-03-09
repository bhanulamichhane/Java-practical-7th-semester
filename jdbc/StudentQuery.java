import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class StudentQuery
{
     static Connection con;
     public StudentQuery()
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
         String query = "insert into student(sname,sphone,scity) values(?,?,?)";
         PreparedStatement stmt = con.prepareStatement(query);
         stmt.setString(1,s.getName());
         stmt.setString(2,s.getPhone());
         stmt.setString(3,s.getCity());
         stmt.executeUpdate();
       }catch(Exception e)
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
        }catch(Exception e)
        {
           System.out.println(e);
        }
     }


     public void searchStudent(String stdname)
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
               name = rs.getString("sname");
               if( stdname.equals(name))
               {
                    id = rs.getInt("id"); 
                    phone = rs.getString("sphone");
                    city = rs.getString("scity");
 
                    Student s = new Student(id, name, phone, city);
                    System.out.println("Success! "+ stdname + " found");
                    System.out.println(s);
                    return;
               } 

            }

             System.out.println(stdname + "not found");

        }catch(Exception e)
        {
           System.out.println(e);
        }
     }


     public boolean searchStudentById(int id)
     {
        int aid;
        try
        {
            Statement stmt = con.createStatement();
            String query = "select * from student";
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next())
            {
               aid= rs.getInt("id");
               if(aid==id)
               {
                    return true;
               } 

            }

            return false;

        }catch(Exception e)
        {
           System.out.println(e);
           return false;
        }
     }


     public void updateCity(int idd)
     {
        try
        {
            boolean flag = this.searchStudentById(idd);
            if(flag == false)
            {
                System.out.println("Student with ID:" + idd + " does not exist!");
                return;
            }
            String query = "update student set scity=? where id=?";
            PreparedStatement stmt = con.prepareStatement(query);
            System.out.println("Enter new city name for student ID: " + idd);
            Scanner scan = new Scanner(System.in);
            String ncity = scan.next();
            stmt.setString(1, ncity);
            stmt.setInt(2, idd);
            stmt.executeUpdate();
            System.out.println("Student with ID "+ idd +  " updated successfully!");

        }catch(Exception e)
        {
           System.out.println(e);
        }
     }

     public void deleteStudent(int idd)
     {
       
        try
        {
            boolean flag = this.searchStudentById(idd);
            if(flag == false)
            {
                System.out.println("Student with ID:" + idd + " does not exist!");
                return;
            }
            String query = "delete from student where id=?";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setInt(1, idd);
            stmt.executeUpdate();
            System.out.println("Student with ID "+ idd +  " deleted successfully!");

        }catch(Exception e)
        {
           System.out.println(e);
        }
     }
}