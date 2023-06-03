
public class ContaCorrente extends InstrumentoFinanceiro{
private float limite;
	
	
	
	public ContaCorrente(float limite, float saldo) {
		super(saldo);
		this.limite = limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	@Override
	public float calcularSaldoTotal() {
		return this.limite + this.getSaldo();
	}

	@Override
	public String toString() {
		return "ContaCorrente [limite=" + limite + ", Saldo = " + this.calcularSaldoTotal() + "]";
	}
	

}
