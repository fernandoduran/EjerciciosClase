import java.util.Scanner;

public class Actividad2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduce dos numeros para dividirlos");
		long numero1 = teclado.nextLong();
		System.out.println("/");
		long numero2 = teclado.nextLong();
		long resultado;
		resultado = numero1 % numero2;
		System.out.println("Resto de " + numero1 + "/" + numero2 + "="
				+ resultado);
	}
}
