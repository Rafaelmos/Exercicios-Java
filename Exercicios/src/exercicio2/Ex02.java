package exercicio2;
import java.util.*;

//CHECK IF THE YEAR IS BISEXT OR NOT.
//VERIFICA SE O ANO � BISSEXTO OU N�O �.

public class Ex02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o ano: ");
		int ano = input.nextInt();
		
		if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)){
		
			System.out.println("O Ano " + ano + " � bissexto");

}
		else {
			System.out.println("O Ano n�o � bissexto");

		}

}}
