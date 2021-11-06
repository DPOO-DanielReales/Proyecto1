package appInventario;

public class ProductoCongelado extends Producto {

	private double tempCongelacion;
	
	public ProductoCongelado(String codigo, String vencimiento,String[] charac, Referencia referencia) {
		super(codigo, vencimiento,charac, referencia);
	}

	public double getTempCongelacion() {
		return tempCongelacion;
	}

	public void setTempCongelacion(double tempCongelacion) {
		this.tempCongelacion = tempCongelacion;
	}
	
	

}
