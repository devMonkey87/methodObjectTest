package testMethodObject;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Coche coche = new Coche("Mercedes", "Benz");

		System.out.println(coche);

		System.out.println("_____________________________________");

		probarMethod(coche);
	}

	public static void probarMethod(Object o)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Class clase = o.getClass();
		Method[] metodos = clase.getMethods();

		// Variable que contiene el número de parámetros que posee un método de una
		// clase
		int parametros = metodos[2].getParameterCount();

		for (int i = 0; i < metodos.length; i++) {

			Method m = metodos[i];

			if (m.getName().startsWith("get")) {

				Object ret = m.invoke(o);
				System.out.println("NOMBRE MÉTODO INVOCADO :" + m.getName() + "  RESULTADO INVOCACIÓN: " + ret);

			}
		}
	}

}