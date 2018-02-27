package ser;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculation extends Remote {
		
	Out compute(int x) throws RemoteException;
}
