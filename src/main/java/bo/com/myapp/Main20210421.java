package bo.com.myapp;

import java.util.Scanner;
//기초 총 6문제
public class Main20210421 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if( A > 0) {
			if( B > 0) {
				System.out.println("1");
			}else {
				System.out.println("4");
			}
			
		}else {
			if(B > 0) {
				System.out.println("2");
			}else {
				System.out.println("3");
			}
		}
		
	}

}
