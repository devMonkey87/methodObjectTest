package testMethodObject;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Coche coche = new Coche("Mercedes", "Benz",4);

		System.out.println(coche);

		System.out.println("_____________________________________");

		probarMethod(coche);
	}
	
	

public String newMethod(){
	return "hello";
}


public int hi() {
	return 3;
}
	
	
	public boolean fixMe(){
		
		return false;
	}

	public static void probarMethod(Object o)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Class clase = o.getClass();
		Method[] metodos = clase.getMethods();

		// Variable que contiene el n�mero de par�metros que posee un m�todo de una
		// clase
		int parametros = metodos[2].getParameterCount();

		for (int i = 0; i < metodos.length; i++) {

			Method m = metodos[i];

			if (m.getName().startsWith("get")) {

				Object ret = m.invoke(o);
				System.out.println("NOMBRE M�TODO INVOCADO :" + m.getName() + "  RESULTADO INVOCACI�N: " + ret);

			}
		}
	}

}
