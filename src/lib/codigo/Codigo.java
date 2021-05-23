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
	
	public void escribir(String buff) {
			buffer.add(buff);//buffer.add("\t"+buff+"\n");
	}
	
	public String getEtiqueta() {
		String e="L"+Integer.toString(etiqueta);
		this.etiqueta=this.etiqueta+1;
		return e;
		
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
