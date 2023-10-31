public abstract class Figura {	
	protected void calcularArea(){}
}

class Cuadrado extends Figura {
	@Override
	public void calcularArea() {
		double lado = 12;
		System.out.println("El area del cuadrado es:" + lado*2);
	}
}

class Circulo extends Figura {
	@Override
	public void calcularArea() {
		double radio = 6;
		System.out.println("El area del cuadrado es:" + radio*radio*3.16);
	}
}
