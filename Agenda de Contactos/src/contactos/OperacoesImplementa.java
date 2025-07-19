package contactos;
import java.util.Vector;

public class OperacoesImplementa implements Operacoes {
	
	/*Interface  a implementar:
	 * 
	 * public void adicionar(Contacto c, Vector v);
	public void remover (Contacto c, Vector v);
	public Vector pesquisar (Vector v, int nrTelemovel);
	public void pesquisar(Vector v, String nome);
	public String getIdadesContactosSingulares(Vector v);
	public void unirContactos(Vector v, Contacto c1, Contacto c2);
	*/
	
	
	Vector v = new Vector();
	
	public void adicionar(Contacto c, Vector v) {
		v.add(c);
	}
	
	public void remover (Contacto c, Vector v) {
		v.remove(c);
	}
	
	
	public Vector pesquisar (Vector v, int nrTelemovel) {
		
		Vector encontrados = new Vector();
		
		for (int i=0;i<v.size();i++) {
			if( ((Contacto) v.get(i)).getTel()== nrTelemovel ) {
				
				encontrados.add( (Contacto) v.get(i) );
			}
		}
		
		return encontrados;
		
	}
	
	
	
	public void pesquisar(Vector v, String nome) {
		for (int i=0;i<v.size();i++) {
			if( ((Contacto) v.get(i)).getNome().equalsIgnoreCase(nome)  ) {
				System.out.println(  ((Contacto) v.get(i)).toString()  );
			}
		}
	}
	
	
	
	//public String getIdadesContactosSingulares(Vector v){}
	
	
	
	public void unirContactos(Vector v, Contacto c1, Contacto c2) {
	    if (v.contains(c1) && v.contains(c2)) {
	        // Adiciona o número de c2 à lista de contactos associados de c1
	        c1.getContactos().add(c2.getTel());

	        // Remove c2 da agenda
	        v.remove(c2);
	    }
	}


}
