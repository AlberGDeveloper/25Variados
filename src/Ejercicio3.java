import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Introduce un número ");
		int numero = in.nextInt();

		if (numero <= 0 || numero > 99) {
			System.out.println("Número incorrecto");
		}

		else if (numero > 9) {
			System.out.println("El número tiene dos dígitos");
		}

		else {
			System.out.println("El número tiene un dígito");
		}

	}

}
