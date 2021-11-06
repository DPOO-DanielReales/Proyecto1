package appInventario;

public class ProductoGondola extends Producto {

	private Gondola gondola; 
	public ProductoGondola(String codigo, String vencimiento,String[] charac, Referencia referencia) {
		super(codigo, vencimiento, charac, referencia);
	}
	
	public void setGondola(Gondola gondola)
	{
		this.gondola = gondola;
	}

}
