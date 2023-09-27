import javax.swing.JOptionPane; 
public class PromedioEstatura {
	public static double Promedio(double est1, double est2 ){
		est1 = est1;
		est2 = est2;
		double prom = (est1 + est2) / 2;
		return prom;
	}

	public static void main(String[] arg){
		double persona1, persona2, estatura;
		
		persona1 = Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese la primera estatura"));
		persona2 = Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese la segunda estatura"));
		estatura = Promedio(persona1, persona2);

		JOptionPane.showMessageDialog(null, "el promedio de estatura es:" + estatura);
	}
}
