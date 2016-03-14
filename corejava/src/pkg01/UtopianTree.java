package pkg01;

import java.util.Scanner;

public class UtopianTree {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		int[] N = new int[T];
		for(int i=0; i<T; i++)
		{
			N[i] = in.nextInt();
		}	

		for(int i=0; i<T; i++)
		{
			int result=1;
			
			for(int j=1; j<=N[i]; j++)
			{
				if(j%2==0)
				{
					result = result + 1;
				}
				else
				{
					result = result * 2;
				}
				
			}
			
			System.out.println(result);
		}
		
		
		in.close();
	}

		
}

