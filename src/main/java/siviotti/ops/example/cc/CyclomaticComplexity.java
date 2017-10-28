package siviotti.ops.example.cc;

import static java.lang.reflect.Modifier.isFinal;
import static java.lang.reflect.Modifier.isStatic;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * http://www.lizard.ws/
 * 
 * @author Douglas Siviotti
 *
 */
public class CyclomaticComplexity {


	public int sum(int a, int b) { // cc=1
		int result = a + b;
		System.out.println(result);
		return a + b;
	}

	public int sumIfNotEquals(int a, int b) { // cc=2
		int result = 0;
		if (a != b) { // +1
			result = a + b;
		}
		System.out.println(result);
		return result;
	}

	public int sumIfNotZero(int a, int b) { // cc=3
		if (a == 0) { // +1
			return 0;
		}
		if (b == 0) { // +1
			return 0;
		}
		return a + b;
	}

	public int sumIfNotZeroOr(int a, int b) { // cc=3
		if (a == 0 || b == 0) { // +2
			return 0;
		}
		return a + b;
	}

	public int sumFatorial(int a, int b) { // cc = 3
		int aFatorial = 1;
		for (int i = 1; i <= a; i++) { // +1
			aFatorial = aFatorial * i;
		}
		int bFatorial = 1;
		for (int i = 1; i <= b; i++) { // +1
			bFatorial = bFatorial * i;
		}
		return aFatorial + bFatorial;
	}

	public int sumFatorialNotZero(int a, int b) { // cc = 5
		if (a == 0 || b == 0) { // +2
			return 0;
		}
		int aFatorial = 1;
		for (int i = 1; i <= a; i++) { // +1
			aFatorial = aFatorial * i;
		}
		int bFatorial = 1;
		for (int i = 1; i <= b; i++) { // +1
			bFatorial = bFatorial * i;
		}
		return aFatorial + bFatorial;
	}

	public boolean isBissextoOld(int ano) { // cc = 4
		if (ano == 0 || ano == 1 || ano == 2 || ano == 3 || ano == 4 || ano == 5 || ano == 6 || ano == 7 || ano == 8) {
			return false;
		}
		if (ano % 400 == 0) {
			return true; // +1
		}
		if (ano % 4 == 0 && ano % 100 != 0) {
			return true; // +2
		}
		return false;
	}

	public void testComplex(int ano) { // cc = 4
		if (ano == 0 || ano == 1 || ano == 2 || ano == 3 || ano == 4 || ano == 5 || ano == 6 || ano == 7 || ano == 8
				|| ano == 9 || ano == 10) {
			return;
		}
		if (ano % 400 == 0) {
			return; // +1
		}
		if (ano % 4 == 0 && ano % 100 != 0) {
			return; // +2
		}
		System.out.println("fim do metodo");
	}

	public boolean isBissexto(int ano) { // cc = 4
		return ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0);
	}

	public boolean isFinalField(Field field) { // 1
		return isStatic(field.getModifiers()) && isFinal(field.getModifiers()); // +1
		// CC = 2
	}

	public String nomeMes(Month mes) {
		String nome = null;
		switch (mes) {
		case JANUARY:
			nome = "Janeiro";
			break;
		case FEBRUARY:
			nome = "Fevereiro";
			break;
		case MARCH:
			nome = "Março";
			break;
		case APRIL:
			nome = "Abril";
			break;
		case MAY:
			nome = "Maio";
			break;
		case JUNE:
			nome = "Junho";
			break;
		case JULY:
			nome = "Julho";
			break;
		case AUGUST:
			nome = "Agosto";
			break;
		case SEPTEMBER:
			nome = "Setembro";
			break;
		case OCTOBER:
			nome = "Outubro";
			break;
		case NOVEMBER:
			nome = "Novembro";
			break;
		case DECEMBER:
			nome = "Dezembro";
			break;
		}
		return nome;
	}

	public String nomeDoMes(Month mes) {
		if (Month.JANUARY.equals(mes)) {
			return "Janeiro";
		} else if (Month.FEBRUARY.equals(mes)) {
			return "Fevereiro";
		} else if (Month.MARCH.equals(mes)) {
			return "Março";
		} else if (Month.APRIL.equals(mes)) {
			return "Abril";
		} else if (Month.MAY.equals(mes)) {
			return "Maio";
		} else if (Month.JUNE.equals(mes)) {
			return "Junho";
		} else if (Month.JULY.equals(mes)) {
			return "Julho";
		} else if (Month.AUGUST.equals(mes)) {
			return "Agosto";
		} else if (Month.SEPTEMBER.equals(mes)) {
			return "Setembro";
		} else if (Month.OCTOBER.equals(mes)) {
			return "Outubro";
		} else if (Month.NOVEMBER.equals(mes)) {
			return "Novembro";
		} else {
			return "Dezembro";
		}
	}

	public String nomeDoMes2(Month mes) {
		if (Month.JANUARY.equals(mes)) {
			return "Janeiro";
		}
		if (Month.FEBRUARY.equals(mes)) {
			return "Fevereiro";
		}
		if (Month.MARCH.equals(mes)) {
			return "Março";
		}
		if (Month.APRIL.equals(mes)) {
			return "Abril";
		}
		if (Month.MAY.equals(mes)) {
			return "Maio";
		}
		if (Month.JUNE.equals(mes)) {
			return "Junho";
		}
		if (Month.JULY.equals(mes)) {
			return "Julho";
		}
		if (Month.AUGUST.equals(mes)) {
			return "Agosto";
		}
		if (Month.SEPTEMBER.equals(mes)) {
			return "Setembro";
		}
		if (Month.OCTOBER.equals(mes)) {
			return "Outubro";
		}
		if (Month.NOVEMBER.equals(mes)) {
			return "Novembro";
		} else {
			return "Dezembro";
		}
	}

	public String nomeDoMes3(Month mes) {
		String result = "";
		if (Month.JANUARY.equals(mes)) {
			result = "Janeiro";
		} else if (Month.FEBRUARY.equals(mes)) {
			result = "Fevereiro";
		} else if (Month.MARCH.equals(mes)) {
			result = "Março";
		} else if (Month.APRIL.equals(mes)) {
			result = "Abril";
		} else if (Month.MAY.equals(mes)) {
			result = "Maio";
		} else if (Month.JUNE.equals(mes)) {
			result = "Junho";
		} else if (Month.JULY.equals(mes)) {
			result = "Julho";
		} else if (Month.AUGUST.equals(mes)) {
			result = "Agosto";
		} else if (Month.SEPTEMBER.equals(mes)) {
			result = "Setembro";
		} else if (Month.OCTOBER.equals(mes)) {
			result = "Outubro";
		} else if (Month.NOVEMBER.equals(mes)) {
			result = "Novembro";
		} else if (Month.DECEMBER.equals(mes)) {
			result = "Dezembro";
		}
		return result;
	}

}
