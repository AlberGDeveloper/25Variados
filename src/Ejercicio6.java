import java.util.Scanner;

public class Ejercicio6 {
//Lo he realizado de una forma un poco diferente al tercero.
//A�adiendo una variable STRING respuesta y con un �nico SYSO
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Introduce un n�mero ");
		int numero = in.nextInt();
		String respuesta = "";

		if (numero <= 0 || numero > 999) {
			respuesta = "Meeeh ERROR!";
		}

		else if (numero > 0 && numero <= 9) {
			respuesta = "Un d�gito";
		} else if (numero >= 10 && numero <= 99) {
			respuesta = "Dos d�gitos";
		} else {
			respuesta = "Tres d�gitos";
		}
		System.out.println("El n�mero tiene " + respuesta);

	}

}
