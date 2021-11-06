package appInventario;

import java.util.*;

import procesamientoInventario.ConstructorArchivo;

public class SistemaInventario {
	
	private ConstructorArchivo constructorArchivo;

	private HashMap<String, Categoria> categorias;

	private HashMap<String, Lote> lotes;
	
	private HashMap<String, Referencia> referencias;

	public SistemaInventario()
	{
		this.constructorArchivo = new ConstructorArchivo(this);
		this.categorias = new HashMap<String, Categoria>();
		this.lotes = new HashMap<String,Lote>();
		this.referencias = new HashMap<String,Referencia>();
	}

	
	public void leerCSV()
	{
		this.constructorArchivo.leerCSV();
		this.constructorArchivo.crearCategorias();
		this.constructorArchivo.crearGondolas();
		this.constructorArchivo.crearReferencias();
		this.constructorArchivo.crearLotes();
	}
	
	public HashMap<String,Categoria> getCategorias()
	{
		return this.categorias;
	}


	public HashMap<String, Lote> getLotes() {
		return lotes;
	}
	
	public HashMap<String, Referencia> getReferencias()
	{
		return this.referencias;
	}
	
}
