
public class Banco {

	public static void main(String args[]) {
		Conta c = new Conta("Isidro", "123.456.789-10", 4567, 1000);
		ContaEspecial e = new ContaEspecial("Isidro", "123.456.789-10", 4567, 1000, 200000);

		if (c.debitar(300)) {
			System.out.println("Debito efetuado com sucesso na conta normal");
		}

		if (e.debitar(1300)) {
			System.out.println("Debito efetuado com sucesso na conta especial");
		}

		System.out.println(c);
		System.out.println(e);
	}
}
