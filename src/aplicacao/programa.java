package aplicacao;

import java.util.Locale;
import java.util.Scanner;

public class programa {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char sexo;
		int cervejas,refrigerante,espetos;
		
		System.out.print("Sexo: ");
		sexo = sc.next().charAt(0);
		System.out.print("Quantidade de cervejas: ");
		cervejas = sc.nextInt();
		System.out.print("Quantidade de rerigerantes: ");
		refrigerante = sc.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		espetos = sc.nextInt();
		
		
		sc.close();
		
		

	}

}
