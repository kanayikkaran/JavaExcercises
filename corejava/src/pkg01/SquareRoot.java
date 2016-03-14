package pkg01;

public class SquareRoot {

	public static void main(String[] args) {

		
		
		//System.out.println(sqrt(0));
		
		System.out.println("starting");
		for(int i = 1; i< 20; i++)
		{
			System.out.println("i= "+i);
			if((sqrt(i)-(double)i )== 0)
			{
				System.out.println("inside if i "+i);
			}
			
		}
		
		
		
	}

	public static double sqrt(int num)
	{
		double temp; 
		
		double result = num/2;
		do{
			temp = result;
			result = (temp + (num/temp)) / 2; 
		}
		while((temp-result)!=0);
		return result;
	}
	
}
