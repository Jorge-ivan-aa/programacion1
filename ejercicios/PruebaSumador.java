package ejercicios2;

public class PruebaSumador {
	public static void main(String[] args) {
		Sumador suma = new Sumador(12, 3);
		float resultado = suma.sumar();

		System.out.println("el resultado de la suma es: " + resultado);
	}
}
