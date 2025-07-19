package contactos;
import java.util.Vector;


public interface Operacoes {
	
	public void adicionar(Contacto c, Vector v);
	public void remover (Contacto c, Vector v);
	public Vector pesquisar (Vector v, int nrTelemovel);
	public void pesquisar(Vector v, String nome);
	//public String getIdadesContactosSingulares(Vector v);
	public void unirContactos(Vector v, Contacto c1, Contacto c2);

}
