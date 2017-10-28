package siviotti.ops.example.cc;

public class BissextoComum {

	public boolean isBissexto(int ano){
		if (ano % 400 == 0) {
			return true; // +1
		}
		if (ano % 4 == 0 && ano % 100 != 0) {
			return true; // +2
		}
		return false;
	}
}
