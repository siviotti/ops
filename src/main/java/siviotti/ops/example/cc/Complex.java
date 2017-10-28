package siviotti.ops.example.cc;

public class Complex extends Simple{

	public void testComplex(int ano) { // cc = 15
		if (ano ==0 
				|| ano ==1 
				|| ano == 2 
				|| ano == 3 
				|| ano == 4 
				|| ano == 5 
				|| ano ==6 
				|| ano ==7 
				|| ano ==8 
				|| ano == 9
				|| ano ==10){
			return ;
		}
		if (ano % 400 == 0) {
			return ; // +1
		}
		if (ano % 4 == 0 && ano % 100 != 0) {
			return ; // +2
		}
		System.out.println("fim do metodo");
	}

	
	
}
