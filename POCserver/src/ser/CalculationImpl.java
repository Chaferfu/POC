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
	public Out compute(int x) {

		return new Out(2*x, id);
	}

}
