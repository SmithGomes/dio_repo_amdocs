import java.util.Scanner;

public abstract class Conta implements IConta {
	
	private static final int AGENCIA_PADRAO = 1;
	//private static int SEQUENCIAL = 1;

	protected int agencia;
	protected String numero;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = getHash();
		this.cliente = cliente;
	}

	
	public String getHash(){
		String num = "00";
		for( int i = 0; i != 4; i++ ){
			num += (int) (Math.random() * 10);
		}
		return num;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		boolean sameBank = (getAgencia() == contaDestino.getAgencia()) ? true : false;
		double total = valor;

		if( !sameBank ){
			double tax = 3.00;
			total = valor + tax;

			System.out.println( "\nTRANSFERÊNCIA PARA OUTRO BANCO" );
			System.out.printf( " Na conta = %.2f%n Taxa = %.2f%n Total = %.2f%n", getSaldo(), tax, total   );
			
			promptTranfer( valor, total, contaDestino );
		}else{
			promptTranfer( valor, total, contaDestino );
		}
	}

	public void promptTranfer( double valor, double total, Conta contaDestino ){
		if( getSaldo() < total ){
			System.out.println( "SALDO INSUFICIENTE" );
		}else{
			Scanner scanner = new Scanner( System.in );
			System.out.print( "1 = TRANSFERIR | 0 = NÃO   " );
		
			try {
				if( scanner.nextInt() == 1 ){
					sacar(total);
					contaDestino.depositar(valor);
					System.out.println( "TRANSFERÊNCIA CONCLUÍDA" );
					imprimirInfosComuns();
					contaDestino.imprimirInfosComuns();
				}else{
					System.out.println( "TRANSFERÊNCIA CANCELADA" );
				}
			} catch (Exception e) {
				System.out.println( "DIGITE APENAS NÚMEROS" );
			}

			scanner.close();
		}		
	}

	
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia( int numero ) {
		agencia = numero;
	}

	public String getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void imprimirInfosComuns() {
		System.out.println( "\n========================" );
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %s", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		System.out.println( "========================\n" );
	}
}