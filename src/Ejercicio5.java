import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Introduce un n�mero ");
		double num = in.nextDouble();
		
		if (num == 0) {
			System.out.println("El n�mero es nulo");
		}
			else if (num < 0) {
				System.out.println("El n�mero es negativo");
			}
			else {
				System.out.println("El n�mero es positivo");
			}
		}
	}


