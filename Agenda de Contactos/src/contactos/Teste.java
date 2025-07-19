package contactos;
import java.util.Date;
import java.util.Calendar;
import java.util.Vector;

public class Teste {
 public static void main (String args []) {
	
	
	OperacoesImplementa c1 = new OperacoesImplementa();
	OperacoesImplementa c2 = new OperacoesImplementa();
	
	

	
	Vector v = new Vector();
	
	//Contacto (String nome, String endereco, int tel, Vector <Integer> contactos)
    //EntidadeSingular (String nome, String endereco, int tel, Vector <Integer> contactos,String numDoc,Date dataNasc)
	//EntColectiva (String nome, String endereco, int tel, Vector <Integer> contactos, int ano, String areaActua)
	
	
	
	Vector<Integer> contactos = new Vector<>();

	Calendar cal = Calendar.getInstance();
	cal.set(2002, Calendar.APRIL, 28); // mês Abril (04)
	Date dataNasc = cal.getTime();

	EntidadeSingular benjamim = new EntidadeSingular("Benjamim", "Boane", 8364674, contactos, "21425364Bbd", dataNasc);
	
	
	benjamim.getContactos().add(152563682);
	benjamim.getContactos().add(152563682);
	benjamim.getContactos().add(152563682);
	benjamim.getContactos().add(152563682);

	c2.adicionar(benjamim, v);
	
	
	
	
	
	
	
	
	  
	// Criar contacto e guardar numa variável
	Contacto valentim = new Contacto("Valentim", "Boane", 8364674, contactos);

	// Adicionar à agenda
	c1.adicionar(valentim, v);

	// Adicionar um número associado ao contacto "Valentim"
	valentim.getContactos().add(152563682);
	valentim.getContactos().add(152563682);
	valentim.getContactos().add(152563682);
	
	
	
	
	
	
	
 }
	
}
