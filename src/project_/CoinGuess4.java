package project_;

import java.util.Scanner;

public class CoinGuess4 {

	public static void main(String[] args) { 
		String Rand;      
		int randomNum = (int)(Math.random() * 2);   // 0 = H , 1 = T
		if( randomNum == 0) {
			Rand = "H";
		}
		else {
			Rand = "T";
		}
		System.out.println(Rand);                  //����� ����Ǵ��� Ȯ���ϱ� ����
		System.out.println("H or T ? :");
		Scanner input = new Scanner(System.in);
		String Guess = input.next();
		
		if( Rand.equals(Guess) ) {              // == ��� .equals �����
			System.out.println("Correct!");
		}
		else {
			System.out.println("Incorrect!");
		}

	}

}
