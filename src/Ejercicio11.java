import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Introduce un número");
		int numero1 = num.nextInt();
		System.out.println("Introduce un segundo número");
		int numero2 = num.nextInt();
		System.out.println("Introduce un tercer número");
		int numero3 = num.nextInt();

		if (numero1 < 10 || numero2 < 10 || numero3 < 10) {
			System.out.println("Alguno de los números es menor a 10");

		}

	}
}
