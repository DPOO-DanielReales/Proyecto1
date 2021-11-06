package appInventario;

import java.util.*;

public class Gondola {

	private HashMap<String, Referencia> referencias;
	private Categoria categoria;
	private String nombre;
	
	public Gondola(String nombre)
	{
		this.referencias = new HashMap<String,Referencia>();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void setCategoria(Categoria categoria)
	{
		this.categoria = categoria;
	}

	public HashMap<String,Referencia> getReferencias()
	{
		return this.referencias;
	}
}
