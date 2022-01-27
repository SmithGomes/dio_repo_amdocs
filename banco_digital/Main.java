
public class Main {

	public static void main(String[] args) {
		Cliente john = new Cliente();
		john.setNome("John Doe");
		
		Cliente jane = new Cliente();
		jane.setNome("Jane Doe");

		Conta cc1 = new ContaCorrente(john);
		Conta cc2 = new ContaCorrente(john);
		//cc2.setAgencia( 2 );
		Conta pp = new ContaPoupanca(jane);
		pp.depositar( 1000 );

		cc1.depositar(105);
		//cc1.transferir(100, cc2 );

		System.out.println( "Contas John = " + john.getQuantidadeContas() );
		System.out.println( "Contas Jane = " + jane.getQuantidadeContas() );

		john.getContas();
		jane.getContas();
		//System.out.println( "Contas = " + john.getContas() );
		
		//cc1.imprimirExtrato();
		//cc2.imprimirExtrato();
	}

}
