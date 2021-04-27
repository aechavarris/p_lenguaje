package lib.semantico;

import lib.semantico.Simbolo.Clase_parametro;
import lib.semantico.Simbolo.Tipo_variable;

public class Elemento {
	
	private Tipo_variable tipo;
	private enum op{
		SUMA,RESTA,MULL,DIV,DIV1,MAYOR,MENOR,
		IGUAL,OR,AND,MOD,MAI,MEI,NI
	}
	private Clase_parametro para;
	private Integer entero;
	private Character character;
	private Boolean bool;
	public Elemento() {
		this.tipo=null;
		this.para=null;
		this.entero=null;
		this.character=null;
		this.bool=null;
	}
}
