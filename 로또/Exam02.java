package chap05;

import java.util.Random;

public class Exam02 {

	public static void main(String[] args) {
		
		Random random = new Random(); 
		int[] numbers = new int[6];
		int save = 0;
		random.setSeed(System.currentTimeMillis());

		for(int i =0 ; i<6 ; ++i) {
			numbers[i] = random.nextInt(45) + 1;
			for (int j = 0; j < i; ++j)
			{
				if (numbers[j] == numbers[i])
				{
					i--;
					break;
				}
			}}
		
	for (int j = 0; j < 5; ++j) {
		for (int i =0; i<5; ++i){
			if (numbers[i] > numbers[i+1]) {
				save = numbers[i];
				numbers[i] = numbers[i+1];
				numbers[i+1] = save; 
		}
	}
	}
	System.out.print("로또 번호 : ");
	for (int i=0; i<6;++i)
		System.out.print(numbers[i] + " ");

	}

}
