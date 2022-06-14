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

	public Menaje(boolean reciclable) {
		this.reciclable = reciclable;
	}

	public Menaje(String descripcionProducto, double precio, Catalogo catalogo) {
		super(descripcionProducto, precio, catalogo);
	}


}
