import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.LocateRegistry;
import java.rmi.NotBoundException;
import java.rmi.AlreadyBoundException;
import java.util.Scanner;


public class RunClient
{
	public static void main(String args[]) throws RemoteException, NotBoundException
	{
		ClientImpl client = new ClientImpl();
		client.startClient();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string :");
		String s = scan.next();
		client.toUpper(s);
	}
} 