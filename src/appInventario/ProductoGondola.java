package appInventario;

public class ProductoGondola extends Producto {

	private Gondola gondola; 
	public ProductoGondola(String codigo, String vencimiento) {
		super(codigo, vencimiento);
	}
	
	public void setGondola(Gondola gondola)
	{
		this.gondola = gondola;
	}

}
