package exercicio01;
import java.util.Scanner;

// INDICATES WHICH IS THE ANTECESSOR AND SUCCESSOR OF THE NUMBER INDICATED.
// INDICA QUAL � O ANTECESSOR E O SUCESSOR DO N�MERO INDICADO.

public class Ex01 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um numero: " );
		int num = input.nextInt();
		int antecessor = num -1;
		int sucessor = num + 1;
		
		System.out.println("O antecessor de " + num + " � " + antecessor);
		System.out.println("O sucessor de " + num + " � " + sucessor);
		

		  
		
	}
	
}
	