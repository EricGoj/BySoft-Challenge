package Controlador;

import java.util.List;

import Entidad.Producto;
import Entidad.Vendedor;
import Excepciones.CategoriaInexistenteException;
import Excepciones.ErrorGenericoException;
import Excepciones.ErrorParametrosException;
import Servicios.Servicio;

public class Controlador {

	private final Servicio service;

	public Controlador(final Servicio service) {
		this.service = service;
	}

	public String almacenarProducto(Producto producto, String Categoria) {
		try {
			service.saveProducto(producto.getProducto_id(), producto.getNombre(), producto.getPrecio(), Categoria);
			return "Producto agregado con exito";
		} catch (Exception e) {
			throw new ErrorParametrosException();
		}
	}

	public String agregarVendedor(Vendedor vendedor) {
		try {
			service.saveVendedor(vendedor.getVendedor_id(), vendedor.getNombre(), vendedor.getSueldo());
			return "Vendedor agregado con exito";
		} catch (Exception e) {
			throw new ErrorParametrosException();
		}
	}

	public String venta(Producto producto, Vendedor vendedor) {
		try {
			service.vincularVenta(vendedor.getVendedor_id(), producto.getProducto_id());
			Integer saldo = producto.getPrecio();
			return "venta realizada , el precio a pagar seria de " + saldo;
		} catch (Exception e) {
			throw new ErrorGenericoException();
		}
	}

	public String sueldoVendedor(Vendedor vendedor) {
		try {
			return "El sueldo total del vendedor" + " " + vendedor.getNombre() + " " + "es de:"
					+ service.sueldoTotalVendedor(vendedor);
		} catch (Exception e) {
			throw new ErrorGenericoException();
		}
	}

	public List<Producto> MostrarTodosLosProductos() {
		return service.allProductos();
	}

	public List<Producto> MostrarTodosPorCategoria(String categoria) {
		try {
			return service.allProductosCategoria(categoria);
		} catch (Exception e) {
			throw new CategoriaInexistenteException(categoria);
		}

	}

	public List<Vendedor> MostrarTodosLosVendedores() {
		return service.allVendedores();
	}

}
