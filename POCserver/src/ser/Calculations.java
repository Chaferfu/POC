package ser;

import java.rmi.Remote;

public interface Calculations extends Remote {
		
	int compute(int x);
}
