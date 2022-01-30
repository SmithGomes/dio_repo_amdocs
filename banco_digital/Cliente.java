import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private String nome;
	private int quantidadeContas;
	private List<Conta> contas = new ArrayList<Conta>();

	public void setContas( Conta novaConta ){
		contas.add( novaConta );
	}

	public void getContas(){
		int nContas = contas.size();
		String numero, tipoConta;
		double saldo;

		System.out.println( "\n==========================" );
		System.out.println( String.format( "Cliente: %s", nome ) );
		System.out.println( "# de Contas: " + nContas );

		for( int i = 0; i != contas.size(); i++ ) {
			tipoConta = ( contas.get( i ) instanceof ContaPoupanca ) ? "Poupança" : "Corrente";
			numero = contas.get( i ).getNumero();
			saldo = contas.get( i ).getSaldo();

			System.out.println( "\n------------------------" );	
			System.out.println( String.format( "Tipo Conta: %s", tipoConta ) );
			System.out.println( String.format( "Conta: %s", numero ) );
			System.out.println( String.format( "Saldo: %.2f", saldo ) );
			System.out.println( "------------------------\n" );
		}
		System.out.println( "\n==========================" );
	}

	public int getQuantidadeContas() {
		return quantidadeContas;
	}

	public void setQuantidadeContas( int i ) {
		quantidadeContas += i;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}