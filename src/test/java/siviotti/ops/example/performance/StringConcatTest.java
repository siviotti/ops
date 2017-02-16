package siviotti.ops.example.performance;

import static org.junit.Assert.*;

import java.util.logging.Logger;

import org.junit.Test;

/**
 * 
 * @author Douglas Siviotti
 * @since 16 de fev de 2017
 *
 */
public class StringConcatTest {

	Logger logger = Logger.getLogger(StringConcat.class.getName());

	@Test
	public void test() {
		long max = 10000000;
		StringConcat stringConcat = new StringConcat();
		long t0 = System.currentTimeMillis();
		for (int i = 0; i < max; i++) {
			stringConcat.opsConcatenacaoComOperadorMais();
		}
		long t1 = System.currentTimeMillis();
		logger.info("tempo de ops :" + (t1 - t0));
		t0 = t1;
		for (int i = 0; i < max; i++) {
			stringConcat.recomendadoConcatenacaoComStringBuilder();
		}
		t1 = System.currentTimeMillis();
		logger.info("tempo de reco:" + (t1 - t0));
		t0 = t1;
		for (int i = 0; i < max; i++) {
			stringConcat.talvezConcatenacaoThreadSafeComStringBuffer();
		}
		t1 = System.currentTimeMillis();
		logger.info("tempo de talv:" + (t1 - t0));

	}

}
