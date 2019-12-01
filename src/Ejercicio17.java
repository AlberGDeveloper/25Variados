import java.util.Scanner;

public class Ejercicio17 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("¿Cuantos sueldos va a introducir?");
		int numerosueldos = in.nextInt();
		int count = 1;
		double sueldototal = 0;
		int sueldo1 = 0;
		int sueldo2 = 0;
		while (count <= numerosueldos) {
			System.out.print("Ingresa un sueldo entre 100 y 500€ ");
			double datosueldos = in.nextInt();
			if (datosueldos <= 300) {
				sueldo1++;
			} else {
				sueldo2++;
			}
			sueldototal = sueldototal + datosueldos;

			count++;
		}
		System.out.println(sueldo1 + " cobran entre 100 y 300 euros");
		System.out.println(sueldo2 + " cobran mas de 300 euros");
		System.out.println("La empresa gasta en sueldos " + sueldototal + " euros");
	}
}