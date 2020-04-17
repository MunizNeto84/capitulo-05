package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicios 
{

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Exercicio 01");
		int a;
		
		a = sc.nextInt();
		
		if (a >= 0) 
		{
			System.out.println("Não Negativo");
		}
		else
		{
			System.out.println("Negativo");
		}
		
		sc.close();
	}

}
