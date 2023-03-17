package com.recuperativajava.recuperativa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.converter.xml.SourceHttpMessageConverter;

import com.recuperativajava.recuperativa.models.Inventario;
import com.recuperativajava.recuperativa.models.Producto;
import com.recuperativajava.recuperativa.models.TipoProducto;

@SpringBootApplication
public class RecuperativaApplication {

	// Función para crear productos
	public static Producto creadorProducto(Scanner ingreso, Integer numeroProducto) {
		System.out.print("Ingrese el nombre del producto: " + numeroProducto + ": ");
		String ingresoNombre = ingreso.next();

		System.out.print("Ingrese la cantidad del producto " + numeroProducto + ": ");
		Integer ingresoNumeroProductos = ingreso.nextInt();

		System.out.print("Ingrese la categoría del producto " + numeroProducto + ": ");
		String ingresoCategoria = ingreso.next();

		System.out.print("Ingrese el precio del producto " + numeroProducto + ": ");
		Double ingresoPrecio = ingreso.nextDouble();

		Producto producto = new Producto();
		producto.setNombreProducto(ingresoNombre);
		producto.setCantidad(ingresoNumeroProductos);
		producto.setCategoria(ingresoCategoria);
		producto.setPrecioVenta(ingresoPrecio);

		return producto;
	}

	// Función para guardar productos
	public static ArrayList<Producto> guardarProductos(Scanner ingreso) {
		System.out.println("================Menú para guardar productos================");
		System.out.print("Ingrese el número de productos que desea guardar: ");

		Integer ingresoCantidad = ingreso.nextInt();
		ArrayList<Producto> productosGuardados = new ArrayList<Producto>();

		for (int i = 1; i <= ingresoCantidad; i++) {
			Producto productoTemp = creadorProducto(ingreso, i);
			productosGuardados.add(productoTemp);
		}
		return productosGuardados;

	}

	// Función para obtener ganancias
	public static HashMap<String, Double> venta(Scanner ingreso) {
		HashMap<String, Double> productoParaCalcular = new HashMap<String, Double>();
		ArrayList<Producto> productoActual = guardarProductos(ingreso);
		Producto producto = new Producto();
		Double valorTotalVenta = 0.0;
		for (String i : productoParaCalcular.keySet()) {
			Double productoObtenido = productoParaCalcular.get(i);
			// En esta linea se tienen que multiplicar la cantidad de producto por el precio
			// de venta
			Double valorVentaProducto = producto.getCantidad() * producto.getPrecioVenta();
			valorTotalVenta += valorVentaProducto;
		}
		productoParaCalcular.put("productos", valorTotalVenta);

		return productoParaCalcular;
	}

	// Función para obtener valores de producto
	public static void valores(Scanner ingreso) {
		guardarProductos(ingreso);
		for (Integer i = 0; i <= producto.getCantidad(); i++) {
			// Por cada producto se debe iterar según su cantidad e ir sumando sus precios
			// al obtenerlos con producto.getPrecioVenta
			// Para obtener el valor total.

			// Para obtener el valor más bajo se debe comparar cada valor con el inicial y
			// si el valor actual es menor que el siguiente, sucesivaemente
			// se ordena para dejar en el indice 0 al más bajo, y en el indice final al más
			// alto.
		}
	}

	public static void main(String[] args) {

		Scanner ingreso = new Scanner(System.in);

		Inventario inventario = new Inventario();

		ArrayList<Producto> productos = guardarProductos(ingreso);

		inventario.setProductosEnInventario(productos);

		venta(ingreso);
		valores(ingreso);

	}

}
