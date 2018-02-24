package ser;

import java.rmi.Remote;

public interface Calculation extends Remote {
		
	int compute(int x);
}
