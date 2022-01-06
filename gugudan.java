package chap03;

public class gugudan {

	public static void main(String[] args) {
		
		System.out.println("\n\t 중첩 for 문을 사용하여 다음의 수평 구구단을 출력하세요.");
		System.out.println("\t 단, 외부와 내부 각 하나씩의 for문을 사용해야 합니다. \n");
		
	
		for(int num = 0 ; num < 10 ; num++) {
			for(int dan = 2; dan<10 ; dan++) {
				if(num == 0) {
					System.out.printf(" [ %d 단 ] \t", dan);
					
				}
				else {
					System.out.printf("%d * %d = %2d \t", dan, num, dan*num);
				}
				
			}
				System.out.println("\n");
		
		}
	}

}
