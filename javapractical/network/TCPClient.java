import java.io.*;
import java.net.*;

class TCPClient{
	public static void main(String args[]) throws Exception
		{
			while(true)
			{
		String Sentence;
		String modifiedSentence;
		BufferedReader inFromUser = new BufferedReader(new InputStreamReader						(System.in));
		
		Socket clientSocket = new Socket("localhost", 6789);
		DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
		BufferedReader inFromServer=new BufferedReader(new InputStreamReader(clientSocket.getInputStream( )));
		
		System.out.println("Enter the keyword :");
		
		Sentence = inFromUser.readLine();
		if(Sentence =="Bye")
		{
		clientSocket.close();
		}
		else
		{

		outToServer.writeBytes(Sentence+ '\n');
		modifiedSentence = inFromServer.readLine();
		System.out.println("FROM SERVER:"+ modifiedSentence);
		
      	 	}
		}
	}
}