package mdef;

public class Catalogo {

	private long id;
	private String descripcion;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Catalogo() {
	}

	public Catalogo(String descripcion) {
		this.descripcion = descripcion;
	}

}
