package br.ucsal.GCM.IntegratedTest;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import br.ucsal.GCM.CalculoFatorial;

public class CalculoFatorialTestIntegrado
{
	@Test
	public void TestCalculoFatorial()
	{
		//Fatorial 0
		assertEquals(1, CalculoFatorial.Fatorial(0));
		
		//Fatorial 1
		assertEquals(1, CalculoFatorial.Fatorial(1));
		
		//Fatorial 2
		assertEquals(2, CalculoFatorial.Fatorial(2));
		
		//Fatorial 4
		assertEquals(24, CalculoFatorial.Fatorial(4));
	}
}
