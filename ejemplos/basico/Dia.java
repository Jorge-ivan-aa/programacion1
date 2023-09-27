public class Dia {

	public enum EnumDia {
		LUNES, MARTES, MIERCOLES, JUEVES, VIERNES,
	}

	public static void main(String[] args) {
		EnumDia diaActual = EnumDia.MARTES;

		switch(diaActual) {
			case LUNES: System.out.println("Hoy es lunes"); break;
			case MARTES: System.out.println("Hoy es martes y ya estás cansado"); break;
			case MIERCOLES: System.out.println("Hoy es miercoles"); break;
			case JUEVES: System.out.println("Hoy es jueves"); break;
			case VIERNES: System.out.println("Hoy es viernes"); break;
		}
	}
}

