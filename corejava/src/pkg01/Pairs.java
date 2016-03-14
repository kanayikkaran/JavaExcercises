package pkg01;

import java.util.Arrays;
import java.util.Scanner;

public class Pairs {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String a = in.nextLine();
		int N = Integer.parseInt(a.split(" ")[0]);
		int K = Integer.parseInt(a.split(" ")[1]);
		a = in.nextLine();
		String[] str = a.split(" ");
		int[] nums = new int[N];
		for(int i=0; i<N; i++) 
			nums[i] = Integer.parseInt(str[i]) ;
		Arrays.sort(nums);
		
		int count=0;	
		for(int i=0; i<N; i++)
		{
			for(int j=i+1; j<N; j++)
			if(nums[j]-nums[i] == K) 
			{
			count++;
			break;
			}
		}
		
		System.out.println(count);
		in.close();	

	}

}
