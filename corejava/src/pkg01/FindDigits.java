package pkg01;

import java.util.Scanner;

public class FindDigits {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int T = in.nextInt();
		
		int[] N = new int[T];
		for(int i=0; i<T; i++)
		{
			N[i] = in.nextInt();
		}	

		for(int k=0; k<T; k++)
		{
			int temp = N[k];
			int[] a = new int[10]; 
			int i=0;		
			int result = 0;
			
		while(temp>0)
		{
			a[i]=temp%10;
			temp = temp / 10;
			i++;
		}
		
		for(int j = 0; j<i; j++)
		{
			if(a[j]!=0 && N[k]%a[j]==0) 
				result++;
		}
		
		System.out.println(result);
		}	
		
		in.close();
	}

}
