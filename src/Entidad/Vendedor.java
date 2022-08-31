package Entidad;

import java.util.ArrayList;
import java.util.List;


public class Vendedor {
	
	private Integer vendedor_id;
	
	private String nombre;
	
	private Integer sueldo;
	
	private List<Producto> productosVendidos=new ArrayList<>();

	public Vendedor() {
		super();
	}
	

	public Vendedor(Integer vendedor_id, String nombre, Integer sueldo) {
		super();
		this.vendedor_id = vendedor_id;
		this.nombre = nombre;
		this.sueldo = sueldo;
	}


	public Vendedor(Integer vendedor_id, String nombre, Integer sueldo, List<Producto> productosVendidos) {
		super();
		this.vendedor_id = vendedor_id;
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.productosVendidos = productosVendidos;
	}


	public Integer getVendedor_id() {
		return vendedor_id;
	}

	public void setVendedor_id(Integer vendedor_id) {
		this.vendedor_id = vendedor_id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getSueldo() {
		return sueldo;
	}

	public void setSueldo(Integer sueldo) {
		this.sueldo = sueldo;
	}

	

	public List<Producto> getProductosVendidos() {
		return productosVendidos;
	}


	public void setProductosVendidos(List<Producto> productosVendidos) {
		this.productosVendidos = productosVendidos;
	}


	@Override
	public String toString() {
		return "Vendedor [vendedor_id=" + vendedor_id + ", nombre=" + nombre + ", sueldo=" + sueldo
				+ ", productosVendidos=" + productosVendidos + "]";
	}
	
	
	
	
	
	
	
	

}
