import java.util.Scanner;

public class Ejemplo2 {

	public static void main(String[] args) {
		// Preguntamos un precio y si es mayor de 
		// 40 euros escribiremos en pantalla "Tiene
		// derecho a premio". Y si no, "Siga comprando." 

		Scanner teclado = new Scanner(System.in);
		double precio;
		
		// Preguntamos el precio
		System.out.println("Precio del producto: ");
		precio = teclado.nextDouble();
		
		// Miramos si el precio es mayor de 40 o no
		if(precio > 40)
		{
			System.out.println("Tiene derecho a premio.");
		} 
		else
		{
			System.out.println("Siga comprando.");
		}
		
		
		
		
		
		
		
		
		
	}

}
