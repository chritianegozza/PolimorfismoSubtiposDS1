
public class Banco {
	
	private int numInstrumentos; //int 
	private InstrumentoFinanceiro[] instrumentosFinanceiros; // um array 

	public Banco(int numInstrumentos) {
		this.numInstrumentos = numInstrumentos;
		this.instrumentosFinanceiros = new InstrumentoFinanceiro[this.numInstrumentos];
	}
	
	public void adicionar(InstrumentoFinanceiro instrumentosFinanceiro) {
		for(int i = 0; i < this.instrumentosFinanceiros.length; i++) {
			if(this.instrumentosFinanceiros[i] == null) {
				this.instrumentosFinanceiros[i] = instrumentosFinanceiro;
				return;
			}
		}
	}
	
	public float calcularSaldos() {
		float total = 0f;
		for(int i = 0; i < this.instrumentosFinanceiros.length; i++) {
			total += this.instrumentosFinanceiros[i].calcularSaldoTotal();
		}
		return total;
	}
	
	
	
	public InstrumentoFinanceiro[] getInstrumentosFinanceiros() {
		return instrumentosFinanceiros;
	}

	public static void main(String[] args) {
		Banco banco = new Banco(2);
		banco.adicionar(new Acao(14, 30));
		banco.adicionar(new ContaCorrente(13, 6));
		banco.adicionar(new FundoDeAplicacao(5, 18));
		
		System.out.println("|========= Bem-Vindo ==========|");
		
		for(int i = 0; i < banco.getInstrumentosFinanceiros().length; i++) {
			System.out.println(banco.getInstrumentosFinanceiros()[i]);
		}
		
		
		// Impressão do saldo total
		System.out.println("Saldo total: " + banco.calcularSaldos());
		
		
	}

}
