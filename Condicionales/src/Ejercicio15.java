import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Número de mes: ");
		int mes = entrada.nextInt();

		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31 días");
			break;
		case 2:
			System.out.println("28 días");
			break;
		default:
			System.out.println("30 días");
		}
	}

}
