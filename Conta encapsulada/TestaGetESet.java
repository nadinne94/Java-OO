
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 2224);
		
		
		Cliente cliente = new Cliente();
		cliente.setNome("Paulo Siveira");
		
		conta.setTitular(cliente);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		
		//agora em duas linhas: 
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("programador");
		
		System.out.println(titularDaConta); 
        System.out.println(cliente);
        System.out.println(conta.getTitular());
		
		
		
	}
}
