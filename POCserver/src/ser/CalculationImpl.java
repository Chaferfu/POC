package ser;

public class CalculationImpl implements Calculation {

	private static int nbCalculateurs = 0;
	private String id;
	
	
	public CalculationImpl()
	{
		id = Integer.toString(nbCalculateurs);
		nbCalculateurs++;
	}
	
	
	@Override
	public int compute(int x) {

		System.out.println("Salut, je suis n° :" + id);
		return 2*x;
	}

}
