package siviotti.ops.example.cc;

public class BissextoSemReturn2 {

	public boolean isBissexto(int ano){
		boolean result = false;
		if (ano % 400 == 0) {
			result = true; // +1
		}
		if (ano % 4 == 0 && ano % 100 != 0) {
			result = true; // +2
		}
		return result;
	}

}
