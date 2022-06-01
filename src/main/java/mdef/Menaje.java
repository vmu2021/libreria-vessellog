package mdef;

public class Menaje extends Producto implements MenajeInterfaz {

	private boolean reciclable;

	@Override
	public boolean isReciclable() {
		return reciclable;
	}

	@Override
	public void setReciclable(boolean reciclable) {
		this.reciclable = reciclable;
	}

	public Menaje() {
		super();
	}

	public Menaje(long id, String descripcionProducto, double precio, boolean reciclable) {
		super(id, descripcionProducto, precio);
		this.reciclable = reciclable;
	}

}
