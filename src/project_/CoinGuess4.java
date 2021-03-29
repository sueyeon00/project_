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
		System.out.println(Rand);                  //제대로 실행되는지 확인하기 위함
		System.out.println("H or T ? :");
		Scanner input = new Scanner(System.in);
		String Guess = input.next();
		
		if( Rand.equals(Guess) ) {              // == 대신 .equals 써야함
			System.out.println("Correct!");
		}
		else {
			System.out.println("Incorrect!");
		}

	}

}
