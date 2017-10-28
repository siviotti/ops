package siviotti.ops.example.cc;

public class BissextoInLine {

	public boolean isBissexto(int ano) { 
		return ano % 400 == 0 ? true: (ano % 4 == 0 && ano % 100 != 0)? true:false ;
	}

}
