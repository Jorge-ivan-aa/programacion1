// Hacer diferencia, division, y edad2
public class DatosEnteros {
	public static void main(String[] args) {
		int edad1, segundos, dias, diferencia, suma, division, edad2;

		edad1=18;
		edad2=24;

		dias=edad1*365;
		segundos=dias*86400;
		System.out.println("De la edad1 han pasado: ");
		System.out.println(segundos+" segundos y "+dias+" dias");

// Diferencia y division entre edades
		diferencia=edad2-edad1;
		division=edad2/edad1;
		System.out.println(" La diferencia de edad entre edad1 y edad2 es: "+diferencia+". La division entre edad1 y edad2 es: "+division);

// Para edad2
		dias=edad2*365;
		segundos=dias*86400;
		System.out.println("De la edad2 han pasado: ");
		System.out.println(segundos+" segundos y "+dias+" dias");
	}
}
