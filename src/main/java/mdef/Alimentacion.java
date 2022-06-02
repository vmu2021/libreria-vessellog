package mdef;

public class Alimentacion extends Producto implements AlimentacionInterfaz{

	private boolean refrigerado;
	private char ejemplo;

	@Override
	public boolean isRefrigerado() {
		return refrigerado;
	}

	@Override
	public void setRefrigerado(boolean refrigerado) {
		this.refrigerado = refrigerado;
	}

	public Alimentacion() {
	}

	public Alimentacion(long id, String descripcionProducto, double precio, boolean refrigerado) {
		super(id, descripcionProducto, precio);
		this.refrigerado = refrigerado;
	}

	
	
	
}
