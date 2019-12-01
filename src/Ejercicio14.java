import java.util.Scanner;

public class Ejercicio14 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Introduce 3 valores: ");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		int max = Math.max(num1, Math.max(num2, num3));
		int min = Math.min(num1, Math.min(num2, num3));
		System.out.println("El valor minimo es "+ min +" El valor máximo es " +max);
	}
}