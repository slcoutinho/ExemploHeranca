
public class CartaoCashBack extends CartaoPrePago {

	protected int tipoCartao;

	public CartaoCashBack(String numCartao, String titular, int anoValidade, int mesValidade, double saldo, int tipo) {
		super(numCartao, titular, anoValidade, mesValidade, saldo);
		this.tipoCartao = tipo;
	}

	@Override
	public String toString() {
		return "Cartao CashBack [Num. do cartao: " +numCartao+ ", Titular: " +titular
				+ ", Validade/Ano: " +anoValidade+ ", Validade/Mes: " +mesValidade+ ", Saldo: R$ " +saldo+ ", Tipo Cartao: " +tipoCartao+"]";
	}

	public void addCredito(double valor) {
		super.saldo = super.saldo + valor;
	}

	public boolean comprar(double valor) {
		if (valor <= super.saldo) {
			super.saldo = super.saldo - valor;
			if (tipoCartao == 1) {
				super.saldo = super.saldo + valor * 0.02;
			} else if (tipoCartao == 2) {
				super.saldo = super.saldo + valor * 0.05;
			} else if (tipoCartao == 3) {
				super.saldo = super.saldo + valor * 0.08;
			}
			return true;
		}
		return false;
	}
}