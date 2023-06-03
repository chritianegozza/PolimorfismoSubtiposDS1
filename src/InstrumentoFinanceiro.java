
public abstract class InstrumentoFinanceiro {
	private float saldo;
	
	public InstrumentoFinanceiro(float saldo) {
		super();
		this.saldo = saldo;
	}
	
	public float getSaldo() {
		return saldo;
	}
	
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public abstract float calcularSaldoTotal();
}
