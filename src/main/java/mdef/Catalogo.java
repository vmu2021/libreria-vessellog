package mdef;

import java.util.Collection;

public class Catalogo {

	private String descripcion;
	public Collection<Producto> productos;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Collection<Producto> getProductos() {
		return productos;
	}

	public void setProductos(Collection<Producto> productos) {
		this.productos = productos;
	}

	public Catalogo(String descripcion, Collection<Producto> productos) {
		this.descripcion = descripcion;
		this.productos = productos;
	}

	public Catalogo() {
	}

}
