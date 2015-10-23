import java.util.*;

public class Ejemplo1 {

	public static void main(String[] args) {

		// Acceso a una discoteca
		// Hay que tener más de 18 años para pasar.

		System.out.println("¿Cuántos años tienes? ");
		Scanner teclado = new Scanner(System.in);
		int edad = teclado.nextInt();

		if (edad >= 18) {
			System.out.println("Puedes pasar.");
		}

		System.out.println("Fin del programa portero.");
	}

}
