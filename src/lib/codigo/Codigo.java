package lib.codigo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import lib.semantico.Elemento;

public class Codigo {
	
	private String file;
	private int etiqueta;
	public ArrayList<String> buffer;
	public Codigo(String fichero) {
		String[] nombre=fichero.split("\\.");	
		this.file=nombre[0]+".code";
		this.etiqueta=0;
		this.buffer=new ArrayList<String>();
	}
	
	public void escribir(String buff,boolean tabulador) {
		if(tabulador) {
			buffer.add("\t"+buff+"\n");
		}else {
			buffer.add(buff+"\n");
		}
		
		
	}
	
	public String getEtiqueta() {
		String e="L"+Integer.toString(etiqueta);
		this.etiqueta=this.etiqueta+1;
		return e;
		
	}
	
	public void escribirOperador(Elemento.op op) {
		
		switch(op) {
			case SUMA:
				escribir("PLUS",true);
				break;
			case RESTA:
				escribir("SBT",true);
				break;
			case MULL:
				escribir("TMS",true);
				break;
			case MOD:
				escribir("MOD",true);
				break;
			case DIV:
				escribir("DIV",true);
				break;
			case DIV1:
				escribir("DIV",true);
				break;
			case OR:
				escribir("OR",true);
				break;
			case AND:
				escribir("AND",true);
				break;
			case MAYOR:
				escribir("GT",true);
				break;
			case MENOR:
				escribir("LT",true);
				break;
			case IGUAL:
				escribir("EQ",true);
				break;
			case MAI:
				escribir("GTE",true);
				break;
			case MEI: 
				escribir("LTE",true);
				break;
			case NI:
				escribir("NEQ",true);
				break;
			default:
		}
		
	}
	
	public void finCodigo(int ejecucion) throws IOException {
		if(ejecucion==1) {
			FileWriter file=new FileWriter(this.file);
			for(int n=0;n<this.buffer.size();n++) {
				file.write(this.buffer.get(n));
			}
			file.close();
		}
	}
	
}
