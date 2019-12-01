import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double numcuenta = 0;
		double saldo = 0;
		double suma = 0;

		do {
			System.out.print("Introduzca el número de cuenta: ");
			numcuenta = in.nextDouble();
			if (numcuenta >= 0) {
				System.out.println("Introduce el saldo");
				saldo = in.nextDouble();

			} else if (saldo > 0) {
				System.out.println("Saldo acreedor");
				suma = suma + saldo;
			} else if (saldo < 0) {
				System.out.println("Saldo deudor");
			} else {
				System.out.println("Saldo nulo");
			}
		} while (numcuenta >= 0);
		{

		}
		System.out.print("Total de saldos Acreedores: " + suma);

	}
}
