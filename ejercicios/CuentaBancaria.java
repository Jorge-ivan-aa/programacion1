import java.util.Scanner;

public class CuentaBancaria {
	String titular;
	int balance;

/* Metodo constructor */
	CuentaBancaria(String titular, int balance){
		this.titular = titular;
		this.balance = balance;
	}

/* Metodo depositar: retorna el balance luego de sumarle el valor ingresado por el usuario */
	public static int Depositar(int dinero) {	
		Scanner tomar = new Scanner(System.in);
		int valor;
		boolean condicional = false;

		System.out.println("\n-_-_-_-_-_ Opcion depositar Seleccionada -_-_-_-_-_\n");

		do {
			System.out.println("Digite el monto que desee depositar en su cuenta");
			valor =  tomar.nextInt();
			if (valor > 0) {
				condicional = true;
			} else {System.out.println("Error: No puede ingresar cero o un valor negativo.\n\n");}
		} while (condicional == false);
		
		dinero = dinero + valor;
		System.out.println("Monto ingresado correctamente, ¡feliz dia!\n\n");
		return dinero;
	}

/* Metodo retirar: retorna el balance luego de restarle el valor ingresado por el usuario */
	public static int Retirar(int dinero) {
		Scanner tomar = new Scanner(System.in);
		int valor;
		boolean condicional = false;

		System.out.println("\n-_-_-_-_-_ Opcion retirar Seleccionada -_-_-_-_-_\n");

		do {
			System.out.println("Digite el monto que desee retirar en su cuenta");
			valor =  tomar.nextInt();
			if (valor > 0) {
				condicional = true;
			} else {System.out.println("Error: No puede retirar cero o un valor negativo.\n\n");}
		} while (condicional == false);
	
		if (dinero < valor) {
			System.out.println("Error: No es posible retirar el monto solicitado debido a que su balance actual es de " + dinero + " pesos");
		} else {
			dinero = dinero - valor;
			System.out.println("Monto retirado correctamente, ¡feliz dia!\n\n");
		}

		return dinero;
		/* Aqui va el codigo para restarle */
	}

/* Metodo BalanceActual: imprime el balance actual*/
	public static void BalanceActual(int dinero) {
		System.out.println("\n-_-_-_-_-_ Opcion balance actual Seleccionada -_-_-_-_-_\n");
		System.out.println("El balance actual es de " + dinero + " pesos.");
	}

/* Metodo Menu: imprime un menu para seleccionar una opcion*/
	public static int Menu(int dinero) {
		Scanner input = new Scanner(System.in);
		int menu;
		boolean condicional = false;

		/* pedir al usuario que seleccone una opcion del menu */
		do {
			System.out.println("Por favor selecione una opcion: \n 1.Depositar\n 2.Retirar\n 3.BalanceActual\n ");
			menu = input.nextInt();
		
			if (menu == 1 || menu == 2 || menu == 3){
				condicional = true;
			} else {
				System.out.println("\n-_-_-_-_-_Opcion no valida-_-_-_-_-_\n");
			}
		} while (condicional == false);
		
		/* Segun el valor del menu, ejecutar opcion */
		switch (menu) {
			case 1: dinero = Depositar(dinero);
			break;

			case 2: dinero = Retirar(dinero);
			break;

			case 3: BalanceActual(dinero);
			break;
		}
	return dinero;
	}


/* Metodo Main */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int salir = 0;

		/* inicializar los datos de titular y balance con sus variables correspondientes*/
		System.out.println("Bienvenido, ingrese su nombre de usuario\n");
		String user =  input.next();
		System.out.println("¡Hola! " + user + " \n\n");

		int dinero = 0;
		
		do {
			dinero = Menu(dinero);
			System.out.println("Desea continuar en la aplicacion: 1) Continuar, 2) Salir");
			salir = input.nextInt();

			if (salir == 2) {
				salir = -1;
				System.out.println("Adios muchacho");
			} else if (salir == 1) {
				System.out.println("\n\n");

			}	
		} while (salir > 0);

		CuentaBancaria usuario = new CuentaBancaria(user, dinero);
	}
}
