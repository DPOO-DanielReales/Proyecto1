package appInventario;

public class ProductoRefrigerado extends Producto {

	private double tempRefrigerado;

	public ProductoRefrigerado(String codigo, String vencimiento) {
		super(codigo, vencimiento);
	}

	public double getTempRefrigerado() {
		return tempRefrigerado;
	}

	public void setTempRefrigerado(double tempRefrigerado) {
		this.tempRefrigerado = tempRefrigerado;
	}

}
