import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.LocateRegistry;
import java.rmi.NotBoundException;
import java.rmi.AlreadyBoundException;

public interface UpperCaseServer extends Remote
{
	public String toUpper(String str) throws RemoteException;
};





