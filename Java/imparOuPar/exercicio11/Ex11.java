package exercicio11;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		int determinar = input.nextInt();
		
		if (determinar % 2 == 0) {
			System.out.println("O n�mero digitado � par");
		}
		else {
			System.out.println("O n�mero digitado � impar");
		}
	}
}
