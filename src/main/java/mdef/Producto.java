package mdef;

public class Producto {

	private long id;
	private String descripcionProducto;
	private double precio;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescripcionProducto() {
		return descripcionProducto;
	}

	public void setDescripcionProducto(String descripcionProducto) {
		this.descripcionProducto = descripcionProducto;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Producto() {
	}

	public Producto(long id, String descripcionProducto, double precio) {
		this.id = id;
		this.descripcionProducto = descripcionProducto;
		this.precio = precio;
	}

}
