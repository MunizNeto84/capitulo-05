package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios 
{

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*
		 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem 
		 * "Sao Multiplos" ou "Nao sao Multiplos",
		 *  indicando se os valores lidos são múltiplos entre si. Atenção: 
		 *  os números devem poder ser digitados emordem crescente ou decrescente.
		 */
		
		System.out.println("Exercicio 03");
		int a,b;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a % b == 0 || b % a ==0) 
		{
			System.out.println("são multiplos");
		}
		else
		{
			System.out.println("não são multiplos");
		}
		
		sc.close();
	}

}
