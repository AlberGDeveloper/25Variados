import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int superficiemayor12 = 0;
		System.out.println("Introduce el numero de triangulos a procesar");

		int triangulos = in.nextInt();
		for (int i = 0; i < triangulos; i++) {
			System.out.println("Introduce la altura del triangulo");
			float altura = in.nextFloat();
			System.out.println("Introduce la base del triangulo");
			float base = in.nextFloat();
			float superficie = (base * altura) / 2;
			System.out.println("La base es " + base + " la altura es " + altura + " la superficie es " + superficie);
			if (superficie > 12) {
				superficiemayor12++;
			}

		}
		System.out.println("El número de triangulos cuya superficie es mayor que 12 es " + superficiemayor12);
	}

}
