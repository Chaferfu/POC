package cli;

import java.rmi.server.RMIClassLoader;

public class Bootstrap {
	
	public static void main(String[] args)
	{
		try 
		{
			// SecurityManager
			if (System.getSecurityManager() == null) 
			{
				System.setSecurityManager(new SecurityManager());
			}
			// téléchargement de la classe du client
			Class<?> c = RMIClassLoader.loadClass("C:\\Users\\Mathias\\git\\POC\\POCserver\\src","ser.Client");
			// instanciation du client
			Runnable r = (Runnable)c.newInstance();
			// lancement du ’véritable’ client
			r.run();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}


}
