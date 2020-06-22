
public class CartaoTeste {

	public static void main(String args[]) {
		CartaoPrePago cpp = new CartaoPrePago("1111 1111 1111 1111", "Isidro Pai", 2027, 03, 8000);
		CartaoCashBack ccb = new CartaoCashBack("1111 1111 1111 1112", "Isidro Filho", 2025, 12, 3000, CartaoCashBack.SILVER);

		if (cpp.comprar(1000)) {
			System.out.println("Compra efetuada!");
		}

		if (ccb.comprar(1000)) {
			System.out.println("Compra efetuada no cartao cashback!");
		}

		System.out.println(cpp);
		System.out.println(ccb);
	}
}
