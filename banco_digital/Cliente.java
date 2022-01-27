import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private String nome;
	private int quantidadeContas;
	private List<Conta> contas = new ArrayList<Conta>();

	public void setContas( Conta novaConta ){
		contas.add( novaConta );
	}

	 //public List<Conta> getContas(){
	public void getContas(){
		//String .out.println( "\n========================" );
		String nContas = "# de Contas: " + contas.size();
		String nome, cc, num, tipoConta;
		double saldo;

		for( int i = 0; i != contas.size(); i++ ) {

			//cc += contas.get( i ).;
			System.out.println( "\n========================" );
			nome = this.getNome();
			System.out.println( String.format( "Cliente: %s", nome ) );

			tipoConta = ( contas.get( i ) instanceof ContaPoupanca ) ? "Poupança" : "Corrente";
			System.out.println( String.format( "Tipo Conta: %s", tipoConta ) );

			num = contas.get( i ).getNumero();
			System.out.println( String.format( "Conta: %s", num ) );

			saldo = contas.get( i ).getSaldo();
			System.out.println( String.format( "Saldo: %f", saldo ) );
			System.out.println( "========================\n" );
		}



		//return contas;
	}

	//public void setConta( int agencia, String numero, double saldo ) {
	//	contas.add( agencia, numero, saldo );
	//}
	

	public int getQuantidadeContas() {
		return quantidadeContas;
	}

	public void setQuantidadeContas( int conta ) {
		quantidadeContas += conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
