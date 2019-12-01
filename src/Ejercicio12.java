import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
//todas las coordenadas !=0
//1º cuadrante x>0 y>0
//2º cuadrante x<0 y>0
//3er cuadrante x>0 y<0
//4º cuadrante x<0 y>0

		Scanner num = new Scanner(System.in);
		System.out.println("Introduce una coordenada");
		int x = num.nextInt();
		System.out.println("Introduce una segunda coordenada");
		int y = num.nextInt();
		
		if (x>0 && y>0) {
			System.out.println("Primer cuadrante");
		} else if (x<0 && y>0) {
			System.out.println("Segundo cuadrante");
		} else if (x>0 && y<0) {
			System.out.println("Tercer cuadrante");
			
		}
		else {
			System.out.println("Cuarto cuadrante");
			
		}

	}
}
