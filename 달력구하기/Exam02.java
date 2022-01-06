package re;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년도를 입력하세요 : ");
		int year = sc.nextInt();
		System.out.print("월을 입력하세요 : ");
		int month = sc.nextInt();
		
		sc.close();
		
		int[] date = {-1,31,28,31,30,31,30,31,31,30,31,30,31};
	
		if (year%4 == 0 && year % 100 != 0 || year % 400 ==0) {
			date[2] = 29;
			}
		System.out.printf("%d년 %d월의 마지막 일자: %d", year, month, date[month]);		
		
			
	}

}
