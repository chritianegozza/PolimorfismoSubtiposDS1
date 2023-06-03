
public class Acao extends InstrumentoFinanceiro{
	
	private int cotas;
	
	public Acao(int cotas, float saldo) {
		super(saldo);
		this.cotas = cotas;
	}
	
	public void setCotas(int cotas) {
		this.cotas = cotas;
	}
	
	@Override
	public float calcularSaldoTotal() {
		return this.cotas * this.getSaldo();
	}
	
	@Override
	public String toString() {
		return "Acao [cotas=" + cotas + ", Saldo = " + this.calcularSaldoTotal() + "]";
	}

}
