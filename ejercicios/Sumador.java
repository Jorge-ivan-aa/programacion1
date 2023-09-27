package ejercicios2;

public class Sumador {
	int num1, num2;

	Sumador(int num1, int num2)  {
		this.num1 = num1;
		this.num2 = num2;
	}
		
	public int sumar() {
		int suma = this.num1 + this.num2;
		return suma;
	}
}

