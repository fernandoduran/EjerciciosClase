import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int temperatura;

		temperatura = teclado.nextInt();

		if (temperatura > 120) {
			System.out.print("TEMPERATURA DEL REACTOR CRÍTICA.");
			System.out.println("¡CORRED INSENSATOS!");
			
		}
		
		if(temperatura <= 120){
			System.out.print("TEMPERATURA DEL REACTOR NORMAL.");
			System.out.print("TODO VA BIEN.");
		}

	}

}
