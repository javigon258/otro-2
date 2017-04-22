/*
 * 
 */
import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class Hora.
 */
public class Hora {
	
	/** The horas. */
	private int horas;
	
	/** The minutos. */
	private int minutos;
	
	/** The segundos. */
	private int segundos;
	
	/**
	 * Instantiates a new hora.
	 */
	public Hora(){
		this(0,0,0);
	}

	/**
	 * Instantiates a new hora.
	 *
	 * @param h the h
	 */
	public Hora(int h){
		this(h,0,0);
	}

	/**
	 * Instantiates a new hora.
	 *
	 * @param h the h
	 * @param m the m
	 */
	public Hora(int h,int m){
		this(h,m,0);
	}
	
	/**
	 * Instantiates a new hora.
	 *
	 * @param h the h
	 * @param m the m
	 * @param s the s
	 */
	public Hora(int h,int m,int s){
		this.setHoras(h);
		this.setMinutos(m);
		this.setSegundos(s);
	}

	/**
	 * Gets the hora en segundos.
	 *
	 * @return the hora en segundos
	 */
	public long getHoraEnSegundos() {
		int modoHora = Tiempos.H.getSegundos();
		int modoMinutos = Tiempos.M.getSegundos();
		int modoSegundos = Tiempos.S.getSegundos();
		   return this.horas * modoHora 
				+ this.minutos * modoMinutos 
				+ this.segundos * modoSegundos;
	}
	
	/**
	 * Gets the string hora.
	 *
	 * @param listahora the listahora
	 * @return the string hora
	 */
	public static String getStringHora(ArrayList<Hora> listahora){
		long totalSegundos = 0;
		StringBuilder sb = new StringBuilder();
		for(Hora hora:listahora){
			totalSegundos += hora.getHoraEnSegundos();
		}
		Tiempos[] tiempos = Tiempos.values();
		int[] valoresTiempos = new int[tiempos.length];
		for(int i=tiempos.length-1;i>-1;i--) {
			valoresTiempos[i] = (int) totalSegundos/tiempos[i].getSegundos();
			totalSegundos = totalSegundos%tiempos[i].getSegundos();
			sb.append(tiempos[i].getTiempo()+": ").append(valoresTiempos[i]).append("\n");
		}
		return sb.toString();
	}
	
	/**
	 * Gets the horas.
	 *
	 * @return the horas
	 */
	public int getHoras() {
		return horas;
	}

	/**
	 * Sets the horas.
	 *
	 * @param horas the new horas
	 */
	public void setHoras(int horas) {
		if(horas<0 || horas>23) throw new IllegalArgumentException("Rango de horas superior o inferior a [0,23]");
		this.horas = horas;
	}

	/**
	 * Gets the minutos.
	 *
	 * @return the minutos
	 */
	public int getMinutos() {
		return minutos;
	}

	/**
	 * Sets the minutos.
	 *
	 * @param minutos the new minutos
	 */
	public void setMinutos(int minutos) {
		if(minutos<0 || minutos>=60) throw new IllegalArgumentException("Rango de minutos superior o inferior a [0,59]");
		this.minutos = minutos;
	}

	/**
	 * Gets the segundos.
	 *
	 * @return the segundos
	 */
	public int getSegundos() {
		return segundos;
	}

	/**
	 * Sets the segundos.
	 *
	 * @param segundos the new segundos
	 */
	public void setSegundos(int segundos) {
		if(segundos<0 || segundos>60) throw new IllegalArgumentException("Rango de segundos superior o inferior a [0,59]");
		this.segundos = segundos;
	}
	
}
