import java.net..*;
impor java.io.*;
class ServerDemo
{
	public static void main(Strings args[])throws Excepion
	{
		try
		{
		ServerSocket ss = new ServerSocket("2665);
		System.out.println("Server is waiting for the client !!);
		Socket sk = ss.accept();
		System.out.println("Connection established");
		InputStreamReader sr = new InputStreamReader		(sk.getInputStream(());
		BufferedReader br = new BufferedReader(sr);
		String s = br.readLine();
		System.out.println("Message is "+s);
		PrintWriter pw = new PrintWriter(sk.getOutputStream()), true);
		pw.println("Server : Hello Client!!!");
		pw.close();
		}
		catch(Exception e)
		{}
}
}