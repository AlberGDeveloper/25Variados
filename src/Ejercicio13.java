import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.println("Introduce el sueldo");
		int sueldo = num.nextInt();
		System.out.println("Introduce los a�os de antiguedad");
		int a�os = num.nextInt();
		int aumento;
		if (sueldo<500 && a�os>=10) {
			aumento= sueldo + (sueldo*20)/100;
			System.out.println("El sueldo a pagar es "+aumento);
			
		} else if (sueldo<500 && a�os <10) {
			aumento= sueldo +(sueldo*5)/100;
			System.out.println("El sueldo a pagar es "+aumento);

		}else {
			System.out.println("El sueldo es "+sueldo);
	}	
	}

}
