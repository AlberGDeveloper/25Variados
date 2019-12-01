import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int lista1 = 0;
		int lista2 = 0;
		int count1 = 0;
		int count2 = 1;
		while (count1++ < 15) {
			System.out.println("Introduce el valor " + count1 + " de la primera lista");
			int valoreslista1 = in.nextInt();
			lista1 = lista1 + valoreslista1;
		}
		while (count2++ < 15) {
			System.out.println("Introduce el valor " + count2 + " de la segunda lista");
			int valoreslista2 = in.nextInt();
			lista2 += lista2 + valoreslista2;
		}
		if (lista1 == lista2) {
			System.out.println("Las listas son iguales");
		} else if (lista1 > lista2) {
			System.out.println("Lista 1 es mayor");
		} else
			System.out.println("Lista 2 es mayor");
	}
}
