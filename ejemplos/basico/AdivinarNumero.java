import java.util.Scanner;

public class AdivinarNumero {
	public static void main(String[] arg){
		Scanner scanner = new Scanner(System.in);
		int numero;

		do {
			System.out.println("Ingrese el numero 5: ");
			numero = scanner.nextInt();
		} while (numero != 5);

		System.out.println("Correcto! Has ingresado el numero 5");
	}
}
