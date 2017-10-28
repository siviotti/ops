package siviotti.ops.example.cc;

public class Sorveteria3 {
	
	public int precoSorvete(boolean premium, boolean casquinha, int coberturas) {
		int preco = 0;
		if (premium) {
			preco = 20;
			if (casquinha) {
				preco = preco + 2;
				if (coberturas > 1){
					preco = preco + 2;
				} else {
					preco = preco + 1;
				}
			} else {
				preco = preco + 1;
			}
		} else {
			preco = 15 + 1 + 1; // copo + 1 cob
		}
		return preco;
	}


}
