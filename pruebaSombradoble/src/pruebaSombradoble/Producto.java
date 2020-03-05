package pruebaSombradoble;

public class Producto {
	
	private String nombre;
	private double precio;
	private double impuestos;
	private boolean importado, basico;
	
	static final double IMP_NO_BASICO = 10.0;
	static final double IMP_EXPORTACION = 5.0;
	
	public Producto (String n, double p, boolean i, boolean b) {
		nombre = n;
		precio = p;
		importado = i;
		basico = b;
		impuestos = 0;
	}

	public double getImpuestos() {
		return impuestos;
	}

	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}

	public boolean isImportado() {
		return importado;
	}

	public void setImportado(boolean importado) {
		this.importado = importado;
	}

	public boolean isBasico() {
		return basico;
	}

	public void setBasico(boolean basico) {
		this.basico = basico;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void calcularImpuestos () {
		
		if (!basico) {
			impuestos = precio * IMP_NO_BASICO / 100;
		}
		
		if (importado) {
			impuestos = impuestos + (precio * IMP_EXPORTACION / 100);
		}
		
		  impuestos = (double)Math.round(impuestos * 100d) / 100d;
	}
	
	public String toString () {
		double total = (double)Math.round((precio + impuestos) * 100d) / 100d;
		return (nombre + ": " + total );
	}
	
	
	

}
