package siviotti.ops.example.cc;

import static java.lang.reflect.Modifier.isFinal;
import static java.lang.reflect.Modifier.isStatic;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConstCounter2 {
	
	public int countIntConsts(Class<?> clazz) { // +1
		if (!isConstClass(clazz)) { // +1
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
		return count; // CC = 5 - Acumulado = 23
	}

	public boolean isConstClass(Class<?> clazz) { // +1
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
		Class<?> fieldType = field.getType();
		return  isStatic(field.getModifiers()) && isFinal(field.getModifiers()) 
				&& (
				fieldType.equals(Integer.class) || fieldType.equals(int.class) 
				|| fieldType.equals(Long.class)	|| fieldType.equals(long.class) 
				|| fieldType.equals(Short.class) || fieldType.equals(short.class)
				|| fieldType.equals(Byte.class) || fieldType.equals(byte.class)
				|| fieldType.equals(BigInteger.class)
				);	// CC = 11
	}

}
