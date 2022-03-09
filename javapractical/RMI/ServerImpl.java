import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.LocateRegistry;
import java.rmi.NotBoundException;
import java.rmi.AlreadyBoundException;

public class ServerImpl implements UpperCaseServer 
{
	public String toUpper(String s) throws RemoteException
	{
		String str = s.toUpperCase();
		return str;
	}
	public ServerImpl() throws RemoteException
	{
		UnicastRemoteObject.exportObject(this,0);
	}
}