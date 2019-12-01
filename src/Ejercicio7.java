import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce el total de preguntas");
		int totalpreguntas = in.nextInt();
		System.out.println("Introduce las preguntas correctas");
		int correctas = in.nextInt();
		int porcentajeacierto = (totalpreguntas * correctas) / totalpreguntas;

		if (porcentajeacierto >= 90) {
			System.out.println("Nivel máximo");
		} else if (porcentajeacierto >= 75) {
			System.out.println("Nivel medio");

		} else if (porcentajeacierto >= 50) {
			System.out.println("Nivel regular");

		}

		else {
			System.out.println("Fuera de nivel");
		}

	}

}
