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
		
		Socket clientSocket = new Socket("DESKTOP-EMI388F", 6457);
		DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
		BufferedReader inFromServer=new BufferedReader(new InputStreamReader(clientSocket.getInputStream( )));
		
		System.out.println("Enter the keyword :");
		
		Sentence = inFromUser.readLine();
		outToServer.writeBytes(Sentence+ '\n');
		modifiedSentence = inFromServer.readLine();
		System.out.println("FROM SERVER:"+ modifiedSentence);
		
      	 	}
		clientSocket.close();
	}
}