
public class FundoDeAplicacao  extends InstrumentoFinanceiro{
	
	private float rentabilidade;
	
	public FundoDeAplicacao(float rentabilidade, float saldo) {
			super(saldo);
			this.rentabilidade = rentabilidade;
	}
	
	public void setRentabilidade(float rentabilidade) {
			this.rentabilidade = rentabilidade;
	}
	
	@Override
	public float calcularSaldoTotal() {
		return this.rentabilidade + this.getSaldo();
	}
	
	@Override
	public String toString() {
		return "FundoDeAplicacao [rentabilidade=" + rentabilidade + ", Saldo = " + this.calcularSaldoTotal() + "]";
	}
}
