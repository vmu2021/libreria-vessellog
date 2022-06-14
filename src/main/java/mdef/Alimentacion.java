package mdef;

public class Alimentacion extends Producto implements AlimentacionInterfaz{

	private boolean refrigerado;

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

	public Alimentacion(boolean refrigerado) {
		this.refrigerado = refrigerado;
	}

	

	
	
}
