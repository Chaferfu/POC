package ser;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class Server 
{
	
	private ArrayList<Calculation> petitsCalculateurs = new ArrayList<Calculation>();
	
	public static void main(String[] args) 
	{
		try 
		{
			if (System.getSecurityManager() == null) 
			{
				System.setSecurityManager(new SecurityManager());
			}
			CalculationImpl c = new CalculationImpl();
			Calculation stub = (Calculation)UnicastRemoteObject.exportObject(c, 1500);
			
			Registry registry = LocateRegistry.getRegistry(1500);
			registry.rebind("cal",stub);	

			System.out.println("Serveur OK");
			
		} catch (RemoteException e) 
		{
			e.printStackTrace();
		}
	}
}
