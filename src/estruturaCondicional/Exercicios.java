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
		 * Com base na tabela abaixo, escreva um programa que leia o código
		 * e um item e a quantidade deste item. A seguir, calcule
		 * e mostre o valor da conta a pagar.
		 */
		
		System.out.println("Exercicio 05");
		int cod, qtd;
		double total=0;
		
		cod = sc.nextInt();
		qtd = sc.nextInt();
		
		if (cod==1) 
		{
			total = 4.00 * qtd;
		}
		else if (cod == 2)
		{
			total = 4.50 * qtd;
		}
		else if (cod == 3)
		{
			total = 5.00 * qtd;
		}
		else if (cod == 4 )
		{
			total = 2.00 * qtd;
		}
		else if (cod == 5)
		{
			total = 1.50 * qtd;
		}
		else
		{
			System.out.println("Cod inválido");
		}
		
		System.out.printf("Total R$ %.2f", total);
		
		sc.close();
	}

}
