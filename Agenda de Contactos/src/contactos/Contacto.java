package contactos;
import java.util.Date;
import java.util.Vector;

public class Contacto {

	
	private String nome;
	private String endereco;
	private int tel;
	private Vector <Integer> contactos;
	
	
	public Contacto (String nome, String endereco, int tel, Vector <Integer> contactos) {
		this.nome=nome;
		this.endereco=endereco;
		this.tel=tel;
		this.contactos= new Vector<>();
	}


	public String getNome() {
		return nome;
	}


	public String getEndereco() {
		return endereco;
	}



	public int getTel() {
		return tel;
	}



	public Vector<Integer> getContactos() {
		return contactos;
	}
	
	
	
	@Override
	public String toString() {
		return "Contacto [nome=" + nome + ", endereco=" + endereco + ", tel=" + tel + ", contactos=" + contactos + "]";
	}
	
	
}
