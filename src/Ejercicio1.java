import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Introduce dos números ");
		int numero1 = in.nextInt();
		int numero2 = in.nextInt();
		
		if (numero1 > numero2) {
			int resultado = numero1 + numero2;
			int diferencia = numero1 - numero2;
			System.out.println("La suma de ambos es " +resultado);
			System.out.println("La diferencia de ambos es " +diferencia);
			
		} else if (numero2 == 0) {
			System.out.println("No se puede dividir entre 0");
			
			
		} else {
			double producto = numero1 * numero2;
			double division = (float)numero1 / numero2;
			System.out.println("El producto es " +producto);
			System.out.printf("La división es %4.2f" ,division);

		}
	}
		
}
