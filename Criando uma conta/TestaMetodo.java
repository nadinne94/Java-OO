
public class TestaMetodo {
	
	public static void main(String[] args) {
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		System.out.println("Saldo: " + contaDoPaulo.saldo);
		
		boolean saque = contaDoPaulo.saca(20);
		System.out.println(contaDoPaulo.saldo);
		System.out.println(saque);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		if(contaDaMarcela.transfere(300, contaDoPaulo)) {
			System.out.println("Transferência realizada com sucess;");
		} else {
			System.out.println("Ocorreu um problema! Tente novamente!");
		}
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoPaulo.saldo);
	}
}
