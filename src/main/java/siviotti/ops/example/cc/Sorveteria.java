package siviotti.ops.example.cc;

public class Sorveteria {
	
	public int precoSorvete(boolean premium, boolean casquinha, int coberturas) {
		int preco = 0;
		if (premium) {
			preco = 20;
		} else {
			preco = 15;
		}
		if (casquinha) {
			preco = preco + 2;
		} else {
			preco = preco + 1;
		}
		if (coberturas > 1){
			preco = preco + 2;
		} else {
			preco = preco + 1;
		}
		return preco;
	}


}
