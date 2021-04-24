package bo.com.myapp;

import java.util.Scanner;

public class Main20210422 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		int alarmH = H;
		int alarmM = M-45;
		System.out.println("11:"+alarmM);
		
		if (alarmM < 0) {
			alarmM += 60;
			alarmH --;
			System.out.println(alarmM);
			System.out.println(alarmH);
			if (alarmH < 0) {
				alarmH += 24;
				System.out.println(alarmH);
				
			}
		}
		
		System.out.println(alarmH + " " + alarmM);
		
		sc.close();
		
		
	}

}
