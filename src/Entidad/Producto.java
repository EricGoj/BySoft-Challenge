package Entidad;

public class Producto {
	
	private Integer producto_id;
	
	private String nombre;
	
	private Integer precio;
	
	private Categoria categoria;

	
	public Producto() {
		super();
	}


	public Producto(Integer producto_id, String nombre, Integer precio, Categoria categoria) {
		super();
		this.producto_id = producto_id;
		this.nombre = nombre;
		this.precio = precio;
		this.categoria = categoria;
	}
	
	


	public Producto(Integer producto_id, String nombre, Integer precio) {
		super();
		this.producto_id = producto_id;
		this.nombre = nombre;
		this.precio = precio;
	}


	public Integer getProducto_id() {
		return producto_id;
	}


	public void setProducto_id(Integer producto_id) {
		this.producto_id = producto_id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Integer getPrecio() {
		return precio;
	}


	public void setPrecio(Integer precio) {
		this.precio = precio;
	}


	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


	@Override
	public String toString() {
		return "Producto [producto_id=" + producto_id + ", nombre=" + nombre + ", precio=" + precio + ", categoria="
				+ categoria + "]";
	}
	
	

	
	

	

}
