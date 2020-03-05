package pruebaSombradoble;

import java.util.ArrayList;
import java.util.List;

public class Input {

	private List<Producto> listaProductos;
	private double totalImpuestos;
	private double totalPrecio;
	
	public Input() {
		listaProductos = new ArrayList<Producto>(); // inicializo la lista
		totalImpuestos = 0;
		totalPrecio = 0;
	}
	
	public void addProducto (Producto p) {
		listaProductos.add(p);
	}
	
	public Producto getProducto (int index) {
		return listaProductos.get(index);
	}
	
	public int numProductos () {
		return listaProductos.size();
	}
	
	public void calcularImpLista () {
		
		for (int i = 0; i < listaProductos.size(); i++) {
			Producto local = listaProductos.get(i);
			local.calcularImpuestos();
			totalImpuestos = totalImpuestos  + local.getImpuestos();
			totalPrecio = totalPrecio + local.getPrecio() + local.getImpuestos();
		}
		
		totalPrecio = (double)Math.round((totalPrecio) * 100d) / 100d;
		totalImpuestos = (double)Math.round((totalImpuestos) * 100d) / 100d;
	}


	public double getTotalImpuestos() {
		return totalImpuestos;
	}

	public void setTotalImpuestos(double totalImpuestos) {
		this.totalImpuestos = totalImpuestos;
	}
	
	public String toString () {
		
		for (int i = 0; i < listaProductos.size(); i++) {
			System.out.println(listaProductos.get(i).toString());
		}
		
		System.out.println("Impuestos: " + totalImpuestos );
		System.out.println("Total: " + totalPrecio);
		
		return "";
	}
	
}
