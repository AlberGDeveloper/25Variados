import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int valoresacumulados = 0;
		int suma = 0;

		do {
			System.out.print("Introduzca los números: ");
			num = sc.nextInt();
			if (num != 9999)
				valoresacumulados = num + valoresacumulados;
		} while (num != 9999);

		if (valoresacumulados > 0) {
			System.out.println("El valor acumulado es mayor a cero");
		} else if (valoresacumulados == 0) {
			System.out.println("El valor acumulado es cero");
		} else {
			System.out.println("El valor acumulado es menor a cero");
		}
		System.out.println("La suma total es " + valoresacumulados);
	}
}
