package pkg01;

import java.util.Scanner;

public class AngryProfessor {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String a = in.nextLine();
		int T = Integer.parseInt(a);
		
		for(int i = 0; i<T; i++)
		{
			a = in.nextLine();
			int answer = 0;
			int N = Integer.parseInt(a.split(" ")[0]);
			int K = Integer.parseInt(a.split(" ")[1]);
			a = in.nextLine();
			String[] str = a.split(" ");
			int[] nums = new int[N];
			
			for(int k=0; k<N; k++)
				nums[k] = Integer.parseInt(str[k]);
			
			for(int j = 0; j<N; j++)
			{
				if(nums[j]<=0) answer++;
			}
			if(answer<K) System.out.println("YES");
			else System.out.println("NO");
			
		}
		
		in.close();
	}

}
