import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Introduce un n�mero");
		int numero1 = num.nextInt();
		System.out.println("Introduce un segundo n�mero");
		int numero2 = num.nextInt();
		System.out.println("Introduce un tercer n�mero");
		int numero3 = num.nextInt();
		int suma = numero1 + numero2;
		if (numero1 == numero2 && numero1 == numero3) {
			System.out.println("La suma de los dos primeros n�meros es " + suma);
			System.out.println("El resultado multiplicado por el numero 3 es " + suma * numero3);
		}

	}
		
	}


