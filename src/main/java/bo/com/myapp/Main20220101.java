package bo.com.myapp;

import java.util.Scanner;

public class Main20220101 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		
		int sum = 0; 
		
		for (int i = 1; i <= c; i ++) {
			sum += i;
		}
		
		System.out.println(sum);
		
		sc.close();
		
	}

}
