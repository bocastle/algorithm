package bo.com.myapp;

import java.util.Scanner;

public class Main20210424 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c = sc.nextInt();
		
		int arr[] = new int[c];
		
		for (int i = 0; i < c; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[i] = a+b;
			System.out.println(arr[i]);
		}
		
		sc.close();
		
	}

}
