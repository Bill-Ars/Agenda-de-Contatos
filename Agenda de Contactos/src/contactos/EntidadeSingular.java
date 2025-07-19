package contactos;

import java.util.Date;
import java.util.Vector;

public class EntidadeSingular extends Contacto {
	
	private String numDoc;
	private Date dataNasc;
	
	public EntidadeSingular (String nome, String endereco, int tel, Vector <Integer> contactos,String numDoc,Date dataNasc) {
		super (  nome,  endereco,  tel, contactos);
		this.numDoc=numDoc;
		this.dataNasc=dataNasc;
	}

	public String getNumDoc() {
		return numDoc;
	}

	
	public Date getDataNasc() {
		return dataNasc;
	}

	@Override
	public String toString() {
		return super.toString()+" ,numDoc=" + numDoc + ", dataNasc=" + dataNasc + "]";
	}

	
		
	
	
	
	
	

}
