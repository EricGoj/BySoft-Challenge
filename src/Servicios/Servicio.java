package Servicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


import Entidad.Categoria;
import Entidad.Producto;
import Entidad.Vendedor;

public class Servicio {
	
     HashMap<Integer,Producto> ListaProductos = new HashMap<>();
     HashMap<Integer,Vendedor> ListaVendedores= new HashMap<>();
     List<Producto> ProductosVendidos= new ArrayList<>();
	
	public void saveProducto(Integer producto_id, String nombre, Integer precio, String categoria) {
		Producto prod= new Producto();
		
		prod.setProducto_id(producto_id);
		prod.setNombre(nombre);;
		prod.setPrecio(precio);
		
		String categoriaString = categoria.toLowerCase();
		
		Categoria c=null;
		
		if(categoriaString == "tecnologia") {
			c=Categoria.Tecnologia;
		}
		else if (categoriaString == "muebles") {
			c=Categoria.Muebles;
		}
		else if (categoriaString == "herramientas" ) {
			c=Categoria.Herramientas;
		}
		prod.setCategoria(c);
		
		ListaProductos.put(producto_id, prod);	
	}
	
	public void saveVendedor(Integer vendedor_id, String nombre, Integer sueldo) {
		Vendedor vende= new Vendedor();
		vende.setVendedor_id(vendedor_id);
		vende.setNombre(nombre);
		vende.setSueldo(sueldo);
		ListaVendedores.put(vendedor_id, vende);
	}
	
	public void vincularVenta(Integer vendedor_id , Integer producto_id) {
		Producto producto=ListaProductos.get(producto_id);
		Vendedor Vendedor=ListaVendedores.get(vendedor_id);
		registrarVenta(Vendedor,producto);
		ListaProductos.remove(producto_id);
	}
	
	public void registrarVenta(Vendedor vend,Producto product) {
		ProductosVendidos.add(product);
		vend.setProductosVendidos(ProductosVendidos);
	}
	
	public int porcentajeComision(Vendedor vendedor) {
	
		if(ProductosVendidos.isEmpty()) {
			return 0;
		}
		else if(ProductosVendidos.size() > 2) {
			return 10;
		}
		else if(ProductosVendidos.size() <= 2 && ProductosVendidos.size() > 0) {
			return 5;
		}
		return 0;
	}
	
	public int sueldoTotalVendedor(Vendedor vendedor) {
		
		int pagoPorVentas = 0;
		
		for(Producto a: vendedor.getProductosVendidos()) {
			pagoPorVentas=pagoPorVentas+a.getPrecio();
		}
		int comision=porcentajeComision(vendedor)*vendedor.getSueldo()/100;
		return vendedor.getSueldo()+comision;
	}
	
	public List<Producto> allProductos(){
		List<Producto> allProduct=new ArrayList<Producto>();
		for (Producto prod: ListaProductos.values()) {
			allProduct.add(prod);
		}
		return allProduct;
	}
	
	public List<Producto> allProductosCategoria (String categoria){
		List<Producto> allProduct=new ArrayList<Producto>();
		String categoriaString = categoria.toLowerCase();
		for (Producto prod: ListaProductos.values()) {
			if (categoriaString == "tecnologia") {
				if ( prod.getCategoria() == Categoria.Tecnologia) allProduct.add(prod);	
			}
			else if(categoriaString == "muebles") {
				if (prod.getCategoria() == Categoria.Muebles) allProduct.add(prod);
			}
			else if(categoriaString == "herramientas") {
				if(prod.getCategoria() == Categoria.Herramientas) allProduct.add(prod);
			}
		}
		return allProduct;
	}
	
	public String DetallesVendedor(Vendedor vendedor) {
		return vendedor.toString();
	}
	
	public List<Vendedor> allVendedores(){
		List<Vendedor> allVendedores=new ArrayList<Vendedor>();
		for (Vendedor ven: ListaVendedores.values()) {
			allVendedores.add(ven);
		}
		return allVendedores;
	}
	}
	
	

