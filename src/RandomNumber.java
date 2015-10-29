import java.util.Random;

public class RandomNumber
{
	
	/*public int GetANumber()
	{
		Random rand = new Random();
		return rand.nextInt(10) + 1;
	}
	
	public int GetANumber(int high)
	{
		Random rand = new Random();
		return rand.nextInt(high + 1);
	}
	
	public int GetANumber(int lo, int hi)
	{
		Random rand = new Random();
		return rand.nextInt(hi - lo + 1) + lo;
	}*/
	
	private int iLo, iHi;
	
	public void SetLowNumber(int low)
	{
		iLo = low;
	}
	
	public void SetHighNumber (int high)
	{
		iHi = high;
	}
	
	public int GetANumber()
	{
		Random rand = new Random();
		return rand.nextInt(iHi - iLo + 1) + iLo;
	}
	
}