
public class ContaEspecial extends Conta {

	private float limite;

	public ContaEspecial(String nome, String cpf, int numConta, float saldo, float limite) {
		super(nome, cpf, numConta, saldo);
		this.limite = limite;
	}

	public String toString() {
		return "Conta Especial: [Titular: " + super.nome + "," + " CPF: " + super.cpf + ", " + "Numero da Conta: "
				+ super.numConta + ", " + "Saldo R$: " + super.saldo + ", " + "Limite R$: " + this.limite + "]";
	}

	public void creditar(float valor) {
		saldo = saldo + valor;
	}

	public boolean debitar(float valor) {
		if (valor <= this.limite + super.saldo) {
			super.saldo = super.saldo - valor;
			return true;
		}
		return false;
	}
}