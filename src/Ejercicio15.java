import java.util.Scanner;

public class Ejercicio15 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int notas = 11;
		int notamayor = 0;
		int notamenor = 0;
		int count = 1;
		while (count < notas) {
			System.out.println("Ingresa la nota " + count );
			int nota = scan.nextInt();
			if (nota >= 7)
				notamayor++;
			else
				notamenor++;
			count++;
		}
		System.out.println(
				"las notas mayores o iguales a 7 son; " + notamayor + " y las notas menores a 7 son: " + notamenor);
	}
}