import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = 1;  
		int par = 0; 
		int impar = 0;
		System.out.println("¿Introduce los números a comparar?");
		int totalnumeros = in.nextInt();
		while (count++ < totalnumeros) {
			System.out.println("Introduce un número");
			int leer = in.nextInt();
			if (leer % 2 == 0)
				par++;
			else
				impar++;
		}
		System.out.println( par + " pares " + impar + " impares");
	}

}
