package appInventario;

import java.time.LocalDate;
import java.util.*;


public class Referencia {

	private int unidadesRestantes;

	private double precioVenta;

	private SortedMap<LocalDate, Producto> productos;

	private String SKU;

	public Referencia(String SKU)
	{
		this.SKU = SKU;
	}
	
	public SortedMap<LocalDate, Producto> getProductos()
	{
		return this.productos;
	}
	
	public void actualizarUnidades(int cantidad)
	{
		//Recibe por parámetro el número de unidades a subir o bajar
		this.unidadesRestantes += cantidad;
	}

	public void agregarProducto(Producto producto)
	{
		productos.put(producto.getFechaVenc(), producto);
	}
	
	public void setPrecioVenta(double precio)
	{
		this.precioVenta = precio;
	}
}
