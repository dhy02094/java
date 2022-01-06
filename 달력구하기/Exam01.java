package re;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String result = "평년";
		System.out.print("년도를 입력하세요 : ");
		int year = sc.nextInt();
		sc.close();
		
		if (year%4==0 && year%100!=0 || year%400==0) {
			 result = "윤년";
		}
		System.out.printf("%d 년은 %s 입니다.", year, result);
	}

}
