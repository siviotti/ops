package siviotti.ops.example.cc;

public abstract class Simple { // cc = 4

	public String upper(String s) { // cc = 3
		if (s == null || s.isEmpty()) {
			return null;
		}
		return s.toUpperCase();
	}

	public int sum(int a, int b) { // cc = 1
		return a + b;
	}
}
