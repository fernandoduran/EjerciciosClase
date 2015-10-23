import java.util.Scanner;

public class Actividad1 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		byte num1;

		byte num2;

		System.out
				.println("Introduce Dos numeros y se multiplicarán \n Introduce el primer numero:");

		num1 = teclado.nextByte();

		System.out.println("Introduce el segundo numero:");

		num2 = teclado.nextByte();

		int num3 = num1 * num2;

		System.out.println("El resultado es: " + num3);

	}

}