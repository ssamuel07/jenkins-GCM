package br.ucsal.GCM;

public class CalculoFatorial
{
	public static int Fatorial(int numero)
	{
		if(numero <= 1)
			return 1;
		else
			return Fatorial(numero - 1)*numero;
			
	}
}
