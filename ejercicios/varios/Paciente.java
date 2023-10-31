/* import java.util.Scanner; */

public class Paciente {
	
	public static void imprimirDatos(String nombre, int numPaciente, String diagnostico) {
		System.out.println("El paciente " + nombre + " con el numero de paciente " + numPaciente + " tiene el siguiente diagnostico: " + diagnostico);
	}
	

	public static void main(String[] args) {
		String nombre, diagnostico;
		int numPaciente;

		nombre = "juan";
		numPaciente = 1;
		diagnostico = "gripe";

		imprimirDatos(nombre, numPaciente, diagnostico);
	}
}
