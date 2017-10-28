package siviotti.ops.example.cc;

public class Sorveteria2 {

	public int precoSorvete(boolean premium, boolean casquinha, int coberturas) {
		int preco = 15;
		if (premium) {
			preco = preco + 5;
		} 
		preco = preco + 1; // pote
		if (casquinha) {
			preco = preco + 1;
		} 
		preco = preco + 1; // cobertura
		if (coberturas > 1){
			preco = preco + 1;
		}
		return preco;
	}

}
