import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.LocateRegistry;
import java.rmi.NotBoundException;
import java.rmi.AlreadyBoundException;

public class ClientImpl
{
	private UpperCaseServer aServer;
	public void startClient() throws RemoteException, NotBoundException
	{
		Registry registry = LocateRegistry.getRegistry("10.32.16.120", 1099);
		aServer = (UpperCaseServer)registry.lookup("aServer"); 
	}
	public void toUpper(String s)throws RemoteException 
	{
		String res =aServer.toUpper(s);
		System.out.println("Response from Server :" + res);
	}
}