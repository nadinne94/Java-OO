
public class TestaValores {

	public static void main(String[] args) {
		
		Conta conta = new Conta(1337, 2244);
		
		System.out.println("Agência: " + conta.getAgencia());
		System.out.println("Número: " + conta.getNumero());
		
		Conta conta2 = new Conta(1337, 3332);
		System.out.println("Agência: " + conta2.getAgencia());
		System.out.println("Número: " + conta2.getNumero());
		
		Conta conta3 = new Conta(1337, 5552);
		System.out.println("Agência: " + conta3.getAgencia());
		System.out.println("Número: " + conta3.getNumero());
		
		System.out.println(Conta.getTotal());
		
	}
}
