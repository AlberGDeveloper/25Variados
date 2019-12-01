import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce las notas del estudiante ");
		int numero1 = in.nextInt();
		int numero2 = in.nextInt();
		int numero3 = in.nextInt();
		int promedio = (numero1 + numero2 + numero3) /3;

		if (promedio >= 7) {
			System.out.println("promocionado");

		}
		else {
			System.out.println("No promocionado");
		}
	}
}