package siviotti.ops.example.cc;

import static java.lang.reflect.Modifier.isFinal;
import static java.lang.reflect.Modifier.isStatic;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConstCounter3 {
	
	private static final Set<Class<?>> INTEIROS = new HashSet<Class<?>>();
	static {
		INTEIROS.add(Integer.class);	INTEIROS.add(int.class);
		INTEIROS.add(Long.class);		INTEIROS.add(long.class);
		INTEIROS.add(Short.class);		INTEIROS.add(short.class);
		INTEIROS.add(Byte.class);		INTEIROS.add(byte.class);
		INTEIROS.add(BigInteger.class);
	}


	public int countIntConsts(Class<?> clazz) { // +1
		if (!isClasseComConst(clazz)) { // +1
			return -1; // +1
		}
		
		List<Field> fields = getFieldsFromClass(clazz);
		
		int count = 0;
		for (Field field : fields) { // +1
			if (isIntConst(field)) { // +1
				System.out.println("Int Constant:" + field);
				count++;
			}
		}
		return count; // CC = 5 - Acumulado = 22
	}

	public boolean isClasseComConst(Class<?> clazz) { // +1
		return clazz != null && !clazz.isEnum() // +1
				&& !Modifier.isAbstract(clazz.getModifiers()); // +1
		// CC = 3
	}

	public List<Field> getFieldsFromClass(Class<?> clazz) { // +1
		List<Field> fields = new ArrayList<Field>();
		fields.addAll(Arrays.asList(clazz.getDeclaredFields()));
		Class<?> superClass = clazz.getSuperclass();
		if (superClass != null && !superClass.equals(Object.class)) { // +2
			fields.addAll(getFieldsFromClass(superClass));
		}
		return fields; // CC = 3
	}

	public boolean isIntConst(Field field) { // 1
		return INTEIROS.contains(field.getType()) 
				&&isStatic(field.getModifiers()) 
				&& isFinal(field.getModifiers()); // +1
		// CC = 3
	}

}
