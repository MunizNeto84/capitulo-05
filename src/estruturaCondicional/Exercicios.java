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
		 * Leia a hora inicial e a hora final de um jogo. 
		 * A seguir calcule a duração do jogo, sabendo que o mesmo pode 
		 * começar em um dia e terminar em outro, tendo uma duração 
		 * mínima de 1 hora e máxima de 24 horas.
		 */
		
		System.out.println("Exercicio 04");
		int a, b, dura;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a<b) 
		{
			dura = b-a;
		}
		else
		{
			dura = 24 -a + b;
		}
		
		System.out.println("o jogo durou: "+ dura +" hora(s)");
		
		sc.close();
	}

}
