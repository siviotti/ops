package siviotti.ops.example.performance;

/**
 * Exemplo de concatenação de String mais performática.
 * 
 * <P>
 * [SONAR] Strings are immutable objects in Java, so concatenation doesn't
 * simply add the new String to the end of the existing string. Instead, in each
 * loop iteration, the first String is converted to an intermediate object type,
 * the second string is appended, and then the intermediate object is converted
 * back to a String. Further, performance of these intermediate operations
 * degrades as the String gets longer. Therefore, the use of StringBuilder is
 * preferred.
 * 
 * @author Douglas Siviotti
 * @since 16 de fev de 2017
 *
 */
public class StringConcat {

	private static final String[] array = { "Abc", "Def", "Ghi" };
	String resultado;

	/**
	 * Este método usa uma forma de concatenação que cria um objeto String para
	 * cada passo do for. Especialmente dentro de loops deve-se evitar este tipo
	 * de concatenação.
	 */
	public void opsConcatenacaoComOperadorMais() {
		String str = "";
		for (int i = 0; i < array.length; ++i) {
			str = str + array[i];
		}
		resultado = str;
	}

	/**
	 * [RECOMENDADO] Esta é a forma recomendada de fazer concatanaçao de
	 * Strings: Usando um StringBuilder que acumula as Strings e, ao final,
	 * retorna uma String com todas as partes concatenadas através do método
	 * toString().
	 */
	public void recomendadoConcatenacaoComStringBuilder() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < array.length; ++i) {
			sb.append(array[i]);
		}
		resultado = sb.toString();
	}

	/**
	 * Esta forma é idêntica à anterior, no entanto, usa a classe StringBuffer
	 * que é thread safe. OU seja, só use esta opção se por algum motivo a
	 * concatenação estiver sendo disputada por várias threads. O mais comum é
	 * usar StringBuilder.
	 * 
	 */
	public void talvezConcatenacaoThreadSafeComStringBuffer() {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < array.length; ++i) {
			sb.append(array[i]);
		}
		resultado = sb.toString();
	}

}
