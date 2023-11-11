public class CuentaBancaria {
	private int saldo;

	public CuentaBancaria(int saldo) {
		saldo = this.saldo;
	}
	
	public void depositar(int deposito) {
		if (deposito >= 0) {
			this.saldo = this.saldo + deposito;
		}
	}

	public void retirar(int retiro) {
		if (this.saldo - retiro >= 0) {                   		
			this.saldo = this.saldo - retiro;
		}
	}
	
	public int getSaldo() {
		return this.saldo;
	}
}
