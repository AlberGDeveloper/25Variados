import java.util.Scanner;

public class Ejercicio6 {
//Lo he realizado de una forma un poco diferente al tercero.
//Añadiendo una variable STRING respuesta y con un único SYSO
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Introduce un número ");
		int numero = in.nextInt();
		String respuesta = "";

		if (numero <= 0 || numero > 999) {
			respuesta = "Meeeh ERROR!";
		}

		else if (numero > 0 && numero <= 9) {
			respuesta = "Un dígito";
		} else if (numero >= 10 && numero <= 99) {
			respuesta = "Dos dígitos";
		} else {
			respuesta = "Tres dígitos";
		}
		System.out.println("El número tiene " + respuesta);

	}

}
