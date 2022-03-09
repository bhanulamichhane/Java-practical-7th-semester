import java.io.*;

public class InputTest2
{
public static void main(String args []) throws IOException
{
     InputStreamReader ins = new InputStreamReader(System.in);
	 BufferedReader areader = new BufferedReader(ins);
	 System.out.println("Enter Integer:"); int n = Integer.parseInt(areader.readLine());
	 System.out.println("Enter Float:"); float p = Float.parseFloat(areader.readLine());
	 System.out.println("Enter a string:"); String s = areader.readLine();
	 }
	 }