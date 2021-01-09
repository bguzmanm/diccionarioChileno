package cl.awakelab.model;

public class Palabra {

	private int id;
	private String nombre;
	private String significado;
	private String referencia;
	
	public Palabra() {
		
	}
	
	public Palabra(int id, String nombre, String significado, String referencia) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.significado = significado;
		this.referencia = referencia;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSignificado() {
		return significado;
	}

	public void setSignificado(String significado) {
		this.significado = significado;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	
	
	
	
	
	
}
