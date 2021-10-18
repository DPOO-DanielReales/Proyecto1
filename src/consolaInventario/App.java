package consolaInventario;
import java.io.*;
import java.util.*;

import appInventario.*;
import procesamientoInventario.LectorArchivo;

public class App {

	
	private SistemaInventario sistemaInventario;

	public App() 
	{
		SistemaInventario sistema = new SistemaInventario();
		this.sistemaInventario = sistema;
	}

	
	public static void main(String[] args) {
		System.out.println("Aplicación Iniciada");
		
		App app = new App();
		app.desplegarMenu();

	}

	
	
	public void desplegarMenu()
	{
		//Despliega el Menú Principal de la Aplicación de Inventario
		boolean continuar = true;

		while (continuar)
		{

			System.out.println("1. Cargar Información CSV");
			System.out.println("2. Salir de la Aplicación");

			int respuesta = Integer.parseInt(input("Seleccione su opción"));

			if (respuesta == 2)
			{
				continuar = false;
				System.out.println("Hasta luego");
			}
			else
			{
				ejecutar(respuesta);
			}
		}
	}
	
	private String input(String mensaje)
	{
			Scanner input = new Scanner(System.in);
			System.out.printf("%s", mensaje + ": ");
			String respuesta = input.nextLine();
			return respuesta;
		
	}
	
	private void ejecutar(int respuesta)
	{
		switch (respuesta)
		{
			case 1:
				cargarCSV();
				break;
		}
	}
	
	
	private void cargarCSV()
	{
		String codigo = "12345";
		String fecha = "2007-10-03";
		Producto producto = new Producto(codigo,fecha);
		ProductoCongelado congelado = (ProductoCongelado) producto;
		boolean respuesta = congelado.equals(producto);
		System.out.printf("%b\n\n", respuesta);
		this.sistemaInventario.leerCSV();
	}
	
	
	
}
