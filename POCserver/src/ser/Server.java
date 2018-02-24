package ser;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server 
{
	public static void main(String[] args) 
	{
		try 
		{
			if (System.getSecurityManager() == null) 
			{
				System.setSecurityManager(new SecurityManager());
			}
			CalculationImpl c = new CalculationImpl();
			Calculation stub = (Calculation)UnicastRemoteObject.exportObject(c, 1099);
			
			Registry registry = LocateRegistry.getRegistry(1099);
			registry.rebind("catalogue",stub);	

			System.out.println("Serveur OK");
			
		} catch (RemoteException e) 
		{

			e.printStackTrace();
		}
	}
}
