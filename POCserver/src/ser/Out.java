package ser;

import java.io.Serializable;

public class Out implements Serializable {
	
	private int soluce;
	private String idCalculaeur;
	
	public Out(int soluce, String idCalculaeur) {
		super();
		this.soluce = soluce;
		this.idCalculaeur = idCalculaeur;
	}

	public int getSoluce() {
		return soluce;
	}

	public String getIdCalculaeur() {
		return idCalculaeur;
	}

	@Override
	public String toString() {
		return "Out [soluce=" + soluce + ", idCalculaeur=" + idCalculaeur + "]";
	}
	
	
}
