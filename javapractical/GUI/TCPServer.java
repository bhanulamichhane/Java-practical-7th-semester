import java.io.*;
import java.net.*;

class TCPServer{
	public static void main(String args[]){
		String clientSentence;
		String capitalizeSentence;
		ServerSocket welcomSocket=new ServerSocket(6789);
		while(true){
		Socket connectionSocket = welcomeSocket.accept();
		BufferedReader inFromClient = new BufferedReader(new InputStreamReader					(connectionSocket.getInputStream()));
		InputStreamReader(System.in));
		DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
		clientSentence = inFromClient.readline();
		
		capitalizeSentence = clientSentence.toUpperCase()+ ,\n';
		outToClient.writeBytes(capitalizedSentence);
	}
}
}