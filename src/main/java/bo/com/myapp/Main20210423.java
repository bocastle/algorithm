package bo.com.myapp;

import java.util.Scanner;

public class Main20210423 {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 1; i <= 9; i++) {
			System.out.println(N+" "+"*"+" "+i+" "+"="+" "+N*i);
			
		}
	
	}

}
