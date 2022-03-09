import java.util.Scanner;
 class Movie
 {
	String genre;
	int id;
	String title;
	
	public Movie(String g, int idd, String titlee)
	{
		genre=g;
		id=idd;
		title=titlee;
	}
public void display()

	{
System.out.println("Id:"+id+"\nGenre:"+genre +"\n Title:" +title);
	}
 }

 class Actor
 {
	String name;
	int id;
	Movie movieList[];
	public Actor(String name, int idd, Movie list[])
	{
		this.name=name;
		this.id=idd;
		movieList=list;
	}
 }
 public class MovieDriver
 { 
   public static void main(String[] args)
   {
    
      int i;
     Movie m[] = new Movie[3];
     for(i=0;i<3;i++)
{
Scanner obj = new Scanner(System.in);
     Scanner obj1 = new Scanner(System.in);
   System.out.println("Enter the genre:"); String genre = obj.nextLine();
   System.out.println("\nThe genre is:" + genre);
   System.out.println("Enter the id:"); int id = obj.nextInt();
   System.out.println("\nThe id is: "+id); 
   System.out.println("\nEnter the title:"); 
   String title = obj1.nextLine();
   System.out.println("\nThe title is: " + title); 
m[i]= new Movie(genre,id,title);
//m[i].setdata();
   System.out.println("\n*******************");
   }
Scanner obj2 = new Scanner(System.in);
    Actor ac = new Actor(name,id,m);
   System.out.println("\nEnter the actor name:"); String name = obj2.nextLine();
   System.out.println("\nThe name is: "+ac.name); 
   System.out.println("\nEnter the id:"); int id = obj2.nextInt();
   System.out.println("\nThe id is: "+ac.id); 
  //  ac.setdata();
    System.out.println("\n*******************");
    System.out.println("\nList of movies:");
	m[0].display();
	m[1].display();
	m[2].display();
	
   }
 }