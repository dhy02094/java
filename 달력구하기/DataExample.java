package re;

import java.util.Scanner;
public class DataExample {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Date obj = new Date();
		
		System.out.print("년도를 입력하세요: ");
		obj.year = sc.nextInt();
		
		System.out.print("월를 입력하세요: ");
		obj.month = sc.nextInt();
		
		System.out.print("일를 입력하세요: ");
		obj.day = sc.nextInt();
		sc.close();
		
		System.out.printf("%d년 %d월 %d일 %s요일", obj.year,obj.month,obj.day, obj.getWeekday()); 

	}

}
