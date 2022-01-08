package chap05;

import java.util.Random;

public class Lotto { 
	int[] numbers = new int[6];
	
	void diverseLotto()
	{
		Random random = new Random();
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
	}
	void sort() {
		int save = 0;
		for (int j = 0; j < 5; ++j) {
			for (int i =0; i<5; ++i){
				if (numbers[i] > numbers[i+1]) {
					save = numbers[i];
					numbers[i] = numbers[i+1];
					numbers[i+1] = save; 
			}
		}
		}
	}
	void printLotto() {
		System.out.print("로또 번호 : ");
		for (int i=0; i<6;++i)
			System.out.print(numbers[i] + " ");
	}
}


