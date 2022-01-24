
public class Main {

	public static void main(String[] args) {
		Cliente john = new Cliente();
		john.setNome("John Doe");
		
		Cliente jane = new Cliente();
		jane.setNome("Jane Doe");

		Conta cc1 = new ContaCorrente(john);
		Conta cc2 = new ContaCorrente(jane);
		cc2.setAgencia( 2 );
		//Conta pp = new ContaPoupanca(venilton);

		cc1.depositar(105);
		cc1.transferir(100, cc2 );
		
		//cc1.imprimirExtrato();
		//cc2.imprimirExtrato();
	}

}
