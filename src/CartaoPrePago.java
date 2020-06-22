
public class CartaoPrePago {

	protected String numCartao;
	protected String titular;
	protected int anoValidade;
	protected int mesValidade;
	protected double saldo;

	public CartaoPrePago(String numCartao, String titular, int anoValidade, int mesValidade, double saldo) {
		super();
		this.numCartao = numCartao;
		this.titular = titular;
		this.anoValidade = anoValidade;
		this.mesValidade = mesValidade;
		this.saldo = saldo;
	}

	public String toString() {
		return "Cartao PrePago  [Num. do Cartao: " +numCartao+ ", Titular: " +titular+ ", Validade/Ano: " +anoValidade
				+ ", Validade/Mes: " +mesValidade+ ", Saldo: R$ " +saldo+ "]";
	}

	public void addCredito(double valor) {
		saldo = saldo + valor;
	}

	public boolean comprar(double valor) {
		if (valor <= saldo) {
			saldo = saldo - valor;
			return true;
		}
		return false;
	}

	public String getNumCartao() {
		return numCartao;
	}

	public void setNumCartao(String numCartao) {
		this.numCartao = numCartao;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getAnoValidade() {
		return anoValidade;
	}

	public void setAnoValidade(int anoValidade) {
		this.anoValidade = anoValidade;
	}

	public int getMesValidade() {
		return mesValidade;
	}

	public void setMesValidade(int mesValidade) {
		this.mesValidade = mesValidade;
	}

	public double getSaldo() {
		return saldo;
	}
}
