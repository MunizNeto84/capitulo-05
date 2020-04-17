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
		 * Fazer um programa para ler um número inteiro 
		 * e dizer se este número é par ou ímpar.
		 */
		
		System.out.println("Exercicio 02");
		int a;
		
		a = sc.nextInt();
		
		if (a % 2 == 0) 
		{
			System.out.println("par");
		}
		else
		{
			System.out.println("impar");
		}
		
		sc.close();
	}

}
