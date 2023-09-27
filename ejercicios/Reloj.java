// Reloj que permite setear hora actual y luego imprime la hora en tiempo real.
import java.util.Scanner; 

public class Reloj {
	
	public static int SetearTiempo(String texto, String condicion) {
		Scanner input = new Scanner(System.in);	
		System.out.println(texto);
		int tiempo = input.nextInt();			
		boolean terminar = false;

		if (condicion == "hora") {

			while(terminar == false){
				if (tiempo > 12 || tiempo < 1){
					System.out.println("La hora ingresada no está en el formato correcto, ingresela nuevamente");
					tiempo = input.nextInt();
				} else {
					terminar = true;
				}
			}
		} else if (condicion == "minuto") {

 			while(terminar == false){
				if (tiempo > 60 || tiempo < 0){
					System.out.println("Los minutos ingresados no están en el formato correcto, ingreselos nuevamente");
					tiempo = input.nextInt();
				} else {
					terminar = true;
				}
			}
		} else if (condicion == "segundo") {
	
			while(terminar == false){
				if (tiempo > 60 || tiempo < 0){
					System.out.println("Los segundos ingresados no están en el formato correcto, ingreselos nuevamente");
					tiempo = input.nextInt();
				} else {
					terminar = true;
				}
			}
		}

		return tiempo;
	}


	public static void main(String[] args) throws InterruptedException {
		int hora, minutos, segundos;
		boolean consulta = true;
		
		hora = SetearTiempo("Ingrese la hora actual: ", "hora");
		minutos = SetearTiempo("\nIngrese los minutos: ", "minuto");
		segundos = SetearTiempo("\nIngrese los segundos: \n", "segundo");
		
		while(consulta == true){

			for (int m = minutos; m<60; m++) {

				minutos = m;

				for (int s=segundos; s<60; s++) {
					
					Thread.sleep(1000);
					segundos = s;
					System.out.println("son las: " + hora + ":" + minutos + ":" + segundos + "\n");
				}
				segundos = 0;
			}

			minutos = 0;
			hora++;

			if (hora == 12) {
				hora= 0;	
			}
		}
	}
}
