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
		 * Em um país imaginário denominado Lisar,
		 * todos os habitantes ficam felizes em pagar seus impostos, pois sabem
		 * que nele não existem políticos corruptos e os recursos arrecadados
		 * são utilizados em benefício da população, sem
		 * qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
		 * Leia um valor com duas casas decimais, equivalente ao salário de 
		 * uma pessoa de Lisarb. Em seguida, calcule e
		 * mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
		 * Lembre que, se o salário for R$ 3002.00, a taxa que incide é 
		 * de 8% apenas sobre R$ 1000.00, pois a faixa de
		 * salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda.
		 * No exemplo fornecido (abaixo), a taxa é
		 * de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que 
		 * resulta em R$ 80.36 no total. O valor deve ser impresso com
		 * duas casas decimais.
		 * “Eixo X” ou “Eixo Y”, conforme for asituação.
		 */
		
		System.out.println("Exercicio 08");
		double sal, tax;
		
		sal = sc.nextDouble();

		if ((sal>2000.00) && (sal<=3000.00)) 
		{
			tax = (sal-2000.00) * 0.08;
		}
		else if ((sal>3000.00) && (sal<=4500.00)) 
		{
			tax = (sal-3000.00) * 0.18 + 1000.00 * 0.08;
		}
		else if (sal>4500.00) 
		{
			tax = (sal-4500.00)* 0.28 + 1500.00 * 0.18 + 1000.00 * 0.08;
		}
		else
		{
			System.out.println("Insento");
			tax=0;
		}
		System.out.printf("Taxa %.2f", tax);
		
		sc.close();
	}

}
