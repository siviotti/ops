package siviotti.ops.smell;

public class Matematica {

	public int quadrado(int a){
		return a * a;
	}
	
	// REFUSED BEQUEST (Legado recusado)
	public int raiz (int a){
		return (int) Math.sqrt(a);
	}
}

class NotaFiscal extends Matematica{
	
	public double calculaimposto(){
		// qualquer cálculo que usa o quadrado
		return quadrado(2);
	}
}
