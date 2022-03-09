import java.io.*;
import java.net.*;

class TCPServer{
	public static void main(String args[]) throws Exception
		{
		String clientSentence;
		String capitalizedSentence;
		ServerSocket welcomSocket=new ServerSocket(6789);
		while(true){
		Socket connectionSocket = welcomSocket.accept();
		BufferedReader inFromClient = new BufferedReader(new InputStreamReader									(connectionSocket.getInputStream()));
		
		DataOutputStream outToClient = new DataOutputStream(connectionSocket.getOutputStream());
		clientSentence = inFromClient.readLine();
		
		capitalizedSentence= clientSentence.toUpperCase()+ '\n';
		outToClient.writeBytes(capitalizedSentence);
	}
}
}