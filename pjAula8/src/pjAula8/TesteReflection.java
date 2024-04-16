package pjAula8;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class TesteReflection {
	public static void main (String [] args) {
		List<String> listaNegra = new ArrayList<String>();
		listaNegra.add("teste");
		listaNegra.add("agoraVai");
		Field[] campos = NotaFiscal.class.getDeclaredFields();
		for(Field f : campos) {
			System.out.println(f.getType() + " " + f.getName());
			
			if(f.getName().length() < 6) {
				System.err.println("Não atende ao padrão");
		}
	}
	
		
		Method[] metodos = NotaFiscal.class.getDeclaredMethods();
		for(Method m : metodos) {
			if(listaNegra.contains(m.getName())) {
			System.out.println(m.getName() + " " + m.getReturnType() + "Não é um nome de método válido");
			}
		}
	}
}
