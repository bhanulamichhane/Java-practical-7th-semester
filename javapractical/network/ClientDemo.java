import java.net..*;
impor java.io.*;
class ClientDemo
{
	public static void main(Strings args[])throws Excepion
	{
		try
		{
		Socket sk = new Socket("localhost",2665);
		PrintWriter pw = new PrintWriter(sk.getOutputStream()), true);
		pw.println("Client : Hello Server!!!");
		pw.close();
		//Client is Reading from its InputStream
		InputStreamReader sr = new InputStreamReader(sk.getInputStream(());
		BufferedReader br = new BufferedReader(sr);
		String s1 = br.readLine();
		System.out.println("Message is "+s1);
		String s = br.readLine();
		}
		catch(Exception e)
		{}
}
}