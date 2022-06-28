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
		// TODO Auto-generated constructor stub
	}

	public Menaje(String descripcion, boolean reciclable, double precio) {
		super(descripcion, precio);
		this.reciclable=reciclable;
	}

}
