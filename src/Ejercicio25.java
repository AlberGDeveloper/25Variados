import java.util.Scanner;

public class Ejercicio25 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int suma = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.print("Introduzca los nueros: ");
			int num = in.nextInt();
			if (i > 5)
				suma += num;
		}
		System.out.println("La suma de los últimos 5 numeros es : " + suma);
	}
}