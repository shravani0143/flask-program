package student;
public class studentresult{
		public float calculatePercentage(int m1,int m2,int m3){
			float total=m1+m2+m3;
			return total/3;
		}
	public void displayresult(float percentage)
	{
		System.out.println("Percentage:\t"+percentage+"%");
		if(percentage>=75)
		{
			System.out.println("Class:distinction");
		}
		else if(percentage>=60)
		{
			System.out.println("Class:First class");
		}
		else if(percentage>=50)
		 {       
                        System.out.println("Class:Second class");
                }
		else if(percentage>=40)
                 {
                        System.out.println("pass");
                }
		else{
			System.out.println("fail");
		}
	}
}



