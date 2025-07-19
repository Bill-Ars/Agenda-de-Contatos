package contactos;

import java.util.Date;
import java.util.Vector;

public class EntColectiva extends Contacto{
	
	private int ano;
	private String areaActua;
	
	
	public EntColectiva (String nome, String endereco, int tel, Vector <Integer> contactos, int ano, String areaActua) {
		super(  nome,  endereco,  tel,  contactos);
		this.ano=ano;
		this.areaActua=areaActua;
	}


	public int getAno() {
		return ano;
	}

    public String getAreaActua() {
		return areaActua;
	}




	@Override
	public String toString() {
		return super.toString()+" ,ano=" + ano + ", areaActua=" + areaActua + "]";
	}
	
	


}
