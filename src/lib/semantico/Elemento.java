package lib.semantico;

import java.util.ArrayList;

import lib.codigo.Codigo;
import lib.semantico.Simbolo.Clase_parametro;
import lib.semantico.Simbolo.Tipo_simbolo;
import lib.semantico.Simbolo.Tipo_variable;

public class Elemento {
	
	private Tipo_variable tipo;
	public enum op{
		SUMA,RESTA,MULL,DIV,DIV1,MAYOR,MENOR,
		IGUAL,OR,AND,MOD,MAI,MEI,NI
	}
	private op operando;
	public Tipo_simbolo getSimbolo() {
		return simbolo;
	}
	public void setSimbolo(Tipo_simbolo simbolo) {
		this.simbolo = simbolo;
	}
	private Tipo_simbolo simbolo;
	private Clase_parametro para;
	private Integer entero;
	private Character caracter;
	private String cadena;
	private ArrayList<String> buff;
	public ArrayList<String> getBuff() {
		return buff;
	}
	public void setBuff(ArrayList<String> buff) {
		this.buff = buff;
	}
	private boolean complex;
	public boolean isComplex() {
		return complex;
	}
	public void setComplex(boolean complex) {
		this.complex = complex;
	}
	public op getOperando() {
		return operando;
	}
	public void setOperando(op operando) {
		this.operando = operando;
	}
	public String getCadena() {
		return cadena;
	}
	public void setCadena(String cadena) {
		this.cadena = cadena;
	}
	private Boolean bool;
	public Elemento() {
		this.tipo=null;
		this.para=null;
		this.entero=null;
		this.caracter=null;
		this.bool=null;
		this.complex=false;
		this.buff=new ArrayList<String>();
	}
	public Tipo_variable getTipo() {
		return tipo;
	}
	public void setTipo(Tipo_variable tipo) {
		this.tipo = tipo;
	}
	public Clase_parametro getPara() {
		return para;
	}
	public void setPara(Clase_parametro para) {
		this.para = para;
	}
	public Integer getEntero() {
		return entero;
	}
	public void setEntero(Integer entero) {
		this.entero = entero;
	}
	public Character getCaracter() {
		return caracter;
	}
	public void setCaracter(Character character) {
		this.caracter = character;
	}
	public Boolean getBool() {
		return bool;
	}
	public void setBool(Boolean bool) {
		this.bool = bool;
	}
	
	
}
