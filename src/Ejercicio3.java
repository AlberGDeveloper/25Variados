import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Introduce un n�mero ");
		int numero = in.nextInt();

		if (numero <= 0 || numero > 99) {
			System.out.println("N�mero incorrecto");
		}

		else if (numero > 9) {
			System.out.println("El n�mero tiene dos d�gitos");
		}

		else {
			System.out.println("El n�mero tiene un d�gito");
		}

	}

}
