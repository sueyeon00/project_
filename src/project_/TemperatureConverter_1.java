package project_;

import java.util.Scanner;

public class TemperatureConverter_1 {

	public static void main(String[] args) {
		System.out.println("Input the F-Temperature:");
		Scanner input = new Scanner(System.in);
		int F = input.nextInt();
		int C = (F-32)*5/9;
		System.out.printf("C-Temperature : %d", C);

	}

}
