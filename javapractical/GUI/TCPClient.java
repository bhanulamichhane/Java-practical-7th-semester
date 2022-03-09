import java.io.*;
import java.net.*;

class TCPClient{
	public static void main(String args[]){
		String sentence;
		String modifiedSentence;
		BufferedReader inFromUser = new BufferedReader(new BufferedReader(new InputStreamReader				(System.in));
		InputStreamReader(System.in));
		Socket clientSocket = new Socket(,,hostname, 6789);
		DataOutputStream outToServer = new DataOutputStream(clientsocket.getOutputStream());
		BufferedReader inFromServer=new BufferedReader(new InputjStreamReader	()));
		Sentence = inFromUser.readline();
		outToServer.writeBytes(sentence+, \n');
		modifiedSentence = inFromServerreadLine();
		System.out.println(,,FROM SERVER:"+ modifiedSentence);
		ClientSocket.close();
}
}