package lib.errores;

import analizador.Token;

public class Aviso {

	public static void deteccion(String string, Token t) {
		// TODO Auto-generated method stub
		System.out.println(string);
		System.out.println("Error en token "+t.toString());
	}

}
