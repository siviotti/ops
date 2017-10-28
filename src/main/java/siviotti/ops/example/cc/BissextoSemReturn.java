package siviotti.ops.example.cc;

public class BissextoSemReturn {

	public boolean isBissexto(int ano){
		boolean result = false;
		if (ano % 400 == 0) {
			result = true; // +1
		} else if (ano % 4 == 0 && ano % 100 != 0) {
			result = true; // +2
		}
		return result;
	}

}
