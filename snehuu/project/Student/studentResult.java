package Student;

public class studentResult
{
	public float calculatePercentage(int m1,int m2,int m3)
	{
		return (m1+m2+m3)/3.0f;
	}
	public void displayResult(float percentage)
	{
		System.out.println("Percentage:"+percentage+"%");
	}
}

