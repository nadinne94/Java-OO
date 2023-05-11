
public class TesteReferencias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Primeira Conta: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		System.out.println("Saldo da 2ª Conta: " + segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("Saldo da 2ª Conta: " + segundaConta.saldo);
		System.out.println("Saldo da 1ª Conta: " + primeiraConta.saldo);
	}
}
