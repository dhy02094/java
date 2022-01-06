package re;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int total_days = 0;
		int [] last_days = new int[]{-1,31,28,31,30,31,30,31,31,30,31,30,31};
		String [] weekdays = new String[] {"일", "월", "화", "수", "목","금", "토"};
		
		System.out.print("년도를 입력하세요 : ");
		int year = sc.nextInt();
		System.out.print("월을 입력하세요 : ");
		int month = sc.nextInt();
		System.out.print("일을 입력하세요 : ");
		int day = sc.nextInt();
		
		sc.close();
		
		for (int i = 1; i < year; i++) {
			if(i%4 ==0 && i%100 != 0 || i%400==0) {
				total_days += 366;
			}
			else {
				total_days += 365;
			}
		}
		
		if (year%4==0 && year%100 !=0 || year%400 ==0) {
			last_days[2] = 29;	
		}
		
		for (int i = 1; i < month ; i++) {
			total_days += last_days[i];
		}
		
		total_days += day;
		int seven = total_days % 7;
		
		System.out.printf("%d년 %d월 %d일은 %s입니다.", year,month,day,weekdays[seven]);
				
		
		

	}

}
