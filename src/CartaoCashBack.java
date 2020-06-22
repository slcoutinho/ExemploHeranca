
public class CartaoCashBack extends CartaoPrePago {

	protected int tipoCartao;
	
	//Declarando CONSTANTES
	public static final int BRONZE = 1;
	public static final int SILVER = 2;
	public static final int GOLD = 3;
	
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
			if (tipoCartao == BRONZE) {
				super.saldo = super.saldo + valor * 0.02;
			} else if (tipoCartao == SILVER) {
				super.saldo = super.saldo + valor * 0.05;
			} else if (tipoCartao == GOLD) {
				super.saldo = super.saldo + valor * 0.08;
			}
			return true;
		}
		return false;
	}
}