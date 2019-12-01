import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce 3 números ");
		double num = in.nextDouble();
		double num2 = in.nextDouble();
		double num3 = in.nextDouble();
		
		double nummayor = num;
		nummayor = nummayor < num2 ? num2 : nummayor;
		nummayor = nummayor < num3 ? num3 : nummayor;
		
		System.out.println("El mayor es: " +nummayor);

		
		
		
	}

}
