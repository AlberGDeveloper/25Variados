import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		String navidad = "";
		Scanner in = new Scanner (System.in);
		System.out.println("Introduce un día");
		int dia = in.nextInt();
		System.out.println("Introduce un mes");
		int mes = in.nextInt();
		
		
		if (dia == 25 && mes == 12) {
			navidad = "Es Navidad";
		} else {
			navidad = "No es Navidad";
		}
		System.out.println(navidad);
	}

}
