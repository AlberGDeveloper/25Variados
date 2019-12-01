import java.util.Scanner;

public class Ejercicio16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el conjunto de alturas");
		int numeroalturas = sc.nextInt();
		int count = 0;
		double sumatotalalturas = 0;
		while (count < numeroalturas) {
			count++;
			System.out.println("Ingresa la altura " + count);
			double datosalturas = sc.nextDouble();
			sumatotalalturas = sumatotalalturas + datosalturas;
		}
		System.out.println("La altura promedio es: " + (sumatotalalturas / count));

	}
}