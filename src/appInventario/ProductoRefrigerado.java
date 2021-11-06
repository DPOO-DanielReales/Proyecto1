package appInventario;

public class ProductoRefrigerado extends Producto {

	private double tempRefrigerado;

	public ProductoRefrigerado(String codigo, String vencimiento, String[] charac, Referencia referencia) {
		super(codigo, vencimiento, charac, referencia);
	}

	public double getTempRefrigerado() {
		return tempRefrigerado;
	}

	public void setTempRefrigerado(double tempRefrigerado) {
		this.tempRefrigerado = tempRefrigerado;
	}

}
