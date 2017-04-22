/*
 * 
 */
import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class StartApp.
 */
public class StartApp {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hora h1 = new Hora(23,79,70);
		Hora h2 = new Hora(1,15,0);
		ArrayList<Hora> lista = new ArrayList<Hora>();
		lista.add(h1);
		lista.add(h2);
		System.out.println(Hora.getStringHora(lista));
		Hora h3 = new Hora(60);		
	}

}
