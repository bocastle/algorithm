package bo.com.myapp;

import java.util.Scanner;
 
public class Main20220112 {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 
		int N = in.nextInt();
		in.close();
        
		int cnt = 0;
		int copy = N;
        
		while (true) {
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			cnt++;
 
			if (copy == N) {
				break;
			}
		}
		System.out.println(cnt);
	}
}