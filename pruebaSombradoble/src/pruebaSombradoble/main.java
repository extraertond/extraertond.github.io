package pruebaSombradoble;

public class main {

	public static void main(String[] args) {
		System.out.println("Ejercicio prueba SombraDoble de Néstor Fernández \n");
		
		Input i1 = new Input();
		Input i2 = new Input();
		Input i3 = new Input();
		
		Producto p1 = new Producto("libro" , 12.49 , false, true);
		Producto p2 = new Producto("película en DVD" , 14.99 , false, false);
		Producto p3 = new Producto("barrita de chocolate" , 0.85 , false, true);
		
		i1.addProducto(p1);
		i1.addProducto(p2);
		i1.addProducto(p3);
		i1.calcularImpLista();
		
		Producto p4 = new Producto("caja de bombones de importación" , 10.00 , true, true);
		Producto p5 = new Producto("fraco de perfumes de importación" , 47.50 , true, false);
		
		i2.addProducto(p4);
		i2.addProducto(p5);
		i2.calcularImpLista();
		
		Producto p6 = new Producto("frasco de perfume de importación" , 27.99 , true, false);
		Producto p7 = new Producto("frasco de perfume" , 18.99 , false, false);
		Producto p8 = new Producto("caja de pastillas para el estómago" , 9.75 , false, true);
		Producto p9 = new Producto("caja de bombones importados" , 11.25 , true, true);
		
		i3.addProducto(p6);
		i3.addProducto(p7);
		i3.addProducto(p8);
		i3.addProducto(p9);
		i3.calcularImpLista();
		
		System.out.println("Output1: ");
		System.out.println(i1.toString());
		System.out.println("Output2: ");
		System.out.println(i2.toString());
		System.out.println("Output3: ");
		System.out.println(i3.toString());

	}

}
