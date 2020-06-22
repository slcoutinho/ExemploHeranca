
public class Conta {

	protected String nome;
	protected String cpf;
	protected int numConta;
	protected float saldo;

	public Conta(String nome, String cpf, int numConta, float saldo) {
		// super();
		this.nome = nome;
		this.cpf = cpf;
		this.numConta = numConta;
		this.saldo = saldo;
	}

	public String toString() {
		return "Conta: [Titular: " + nome + ", CPF: " + cpf + ", Numero da Conta: " + numConta + ", Saldo R$: " + saldo
				+ "]";
	}

	public void creditar(float valor) {
		saldo = saldo + valor;
	}

	public boolean debitar(float valor) {
		if (valor <= saldo) {
			saldo = saldo - valor;
			return true;
		}
		return false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

}
