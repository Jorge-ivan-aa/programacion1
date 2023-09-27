
import javax.swing.JOptionPane; 
public class PromedioEdad {
	public static double Promedio(double est1, double est2 ){
		double prom = (est1 + est2) / 2;
		return prom;
	}

	public static double Preguntar() {
		
	}

	public static void main(String[] arg){
		double persona1, persona2, edad;
		
		persona1 = Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese la primera edad"));
		persona2 = Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese la segunda edad"));
		edad = Promedio(persona1, persona2);

		JOptionPane.showMessageDialog(null, "el promedio de edad es:" + edad);
	}
}
