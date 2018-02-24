package ser;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.security.Principal;
import java.util.Scanner;

public class Client implements Runnable
{
	
	boolean connected = false;
	
	@Override
	public void run() 
	{
		try 
		{
			if (System.getSecurityManager() == null) 
			{
				System.setSecurityManager(new SecurityManager());
			}
			Registry registry = LocateRegistry.getRegistry("localhost",1099);
			Calculation stub = (Calculation) registry.lookup("catalogue");		 			
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	public void informer(String info) throws RemoteException{
		System.out.println(info);
	}

	
}
