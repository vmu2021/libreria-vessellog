package mdef;

public class Producto {

	private String descripcionProducto;
	private double precio;
	public Catalogo catalogo;

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

	public Catalogo getCatalogo() {
		return catalogo;
	}

	public void setCatalogo(Catalogo catalogo) {
		this.catalogo = catalogo;
	}

	public Producto(String descripcionProducto, double precio, Catalogo catalogo) {
		this.descripcionProducto = descripcionProducto;
		this.precio = precio;
		this.catalogo = catalogo;
	}

	public Producto() {
	}

}
