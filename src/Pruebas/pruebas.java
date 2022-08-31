package Pruebas;



import Controlador.Controlador;

import Entidad.Producto;
import Entidad.Vendedor;
import Servicios.Servicio;

public class pruebas {

	public static void main(String[] args) {
		
		Servicio servicio=new Servicio();
		
		Controlador controlador=new Controlador(servicio);
		
		Producto producto1=new Producto(1,"Celular",3000);
		Producto producto2=new Producto(2,"Martillo",500);
		Producto producto3=new Producto(3,"Sillon",2500);
		
		Vendedor vendedor1=new Vendedor(4,"Eric",30000);
		System.out.println("Agregamos Productos :");
		System.out.println(controlador.almacenarProducto(producto1, "tecnologia"));
		System.out.println(controlador.almacenarProducto(producto2,"herramientas"));
		System.out.println(controlador.almacenarProducto(producto3, "muebles"));
		System.out.println("---");
		System.out.println("Agregamos Vendedor :");
		System.out.println(controlador.agregarVendedor(vendedor1));
		System.out.println("----");
		System.out.println("Todos los productos : ");
		System.out.println(controlador.MostrarTodosLosProductos());
		System.out.println("----");
		System.out.println("Producto por categoria : ");
		System.out.println(controlador.MostrarTodosPorCategoria("tecnologia"));
		
		System.out.println("----");
		
		System.out.println(controlador.venta(producto3, vendedor1));
		
		System.out.println(controlador.venta(producto2, vendedor1));
		
		System.out.println(controlador.MostrarTodosLosProductos());
		
		System.out.println(controlador.MostrarTodosLosVendedores());
		
		System.out.println("----");
		
		System.out.println(controlador.sueldoVendedor(vendedor1));
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
