
// TODO: Auto-generated Javadoc
/**
 * The Enum Tiempos.
 */
public enum Tiempos {
	
	/** The s. */
	S("segundos",1),
	
	/** The m. */
	M("minutos",60),
	
	/** The h. */
	H("horas",3600),
	
	/** The d. */
	D("días",86400),
	
	/** The w. */
	W("semanas",604800);
	
	/**
	 * Instantiates a new tiempos.
	 *
	 * @param t the t
	 * @param s the s
	 */
	private Tiempos(String t,int s){
		
	}
	
	/** The tiempo. */
	private String tiempo;
	
	/** The segundos. */
	private int segundos;
	
	/**
	 * Gets the tiempo.
	 *
	 * @return the tiempo
	 */
	public String getTiempo() {
		return tiempo;
	}
	
	/**
	 * Sets the tiempo.
	 *
	 * @param tiempo the new tiempo
	 */
	public void setTiempo(String tiempo) {
		this.tiempo = tiempo;
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
		this.segundos = segundos;
	}
	
}
