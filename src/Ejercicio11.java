import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Introduce un n�mero");
		int numero1 = num.nextInt();
		System.out.println("Introduce un segundo n�mero");
		int numero2 = num.nextInt();
		System.out.println("Introduce un tercer n�mero");
		int numero3 = num.nextInt();

		if (numero1 < 10 || numero2 < 10 || numero3 < 10) {
			System.out.println("Alguno de los n�meros es menor a 10");

		}

	}
}
