public class Ejercicio19 {
	public static void main(String[] args) {
		int numero = 16;
		int count = 0;
		System.out.print("8");
		while (count++ < 499) {
			System.out.print("-" + numero);
			numero = numero + 8;
		}
	}
}