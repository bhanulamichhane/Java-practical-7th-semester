import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.LocateRegistry;
import java.rmi.NotBoundException;
import java.rmi.AlreadyBoundException;


public class RunServer
{
	public static void main(String args[]) throws RemoteException,AlreadyBoundException
	{
		UpperCaseServer remoteobj = new ServerImpl();
		Registry registry = LocateRegistry.createRegistry(1099);
		registry.bind("aServer", remoteobj);
	}
}