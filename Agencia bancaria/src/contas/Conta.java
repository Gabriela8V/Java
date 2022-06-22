/**
 *POO - Encapsulamentos e metodods especiais
 */

package contas;

/**
 * @author gabriela.vsantos13
 *
 */
public class Conta {
	//atributos
	// Para enccapsular (proteger) uma variavel devemos usar o
	//modificador private e cria metodos espesificos (get e set)
	// para outra  classe pacotes terem acessos as variaveis
	
	//passo 1: modificador private
	private String cliente;
	private double saldo;
	//encapsulamento- passo 2: criar os metodosespecificos (get e set)							
	
	
	/**
	 * ler o conteudo da variavel cliente
	 */
	
	/**
	 * Construtor
	 */
	
	public Conta() {
		System.out.println("------------------------");
		System.out.println("Agência 0261");
	}
	
	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	/**
	 * obter o saldo
	 * @return saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Conta(String cliente, double saldo) {
		super();
		this.cliente = cliente;
		this.saldo = saldo;
	}

	//Métodos
	protected void exibirSaldo() {
		System.out.println("Saldo: R$ " +saldo);
	}

	/**
	 * Método simples com uma variavel local
	 * @param valor
	 */
	protected void sacar(double valor) {
		saldo -= valor;
		System.out.println("Débito: R$" + valor);
	}
	
	protected void depositar(double valor) {
		saldo += valor;
		System.out.println("Crédito: R$" + valor);
	}
	
	/**
	 * Métodon simples com uma variavel local e um valor fisico
	 * @param destino
	 * @param valor
	 */
	protected void transferir(Conta destino, double valor) {
		this.sacar(valor);
		destino.depositar(valor);
		System.out.println("Transferencia: R$" + valor );
	}
	
	/**
	 * metodo com retorno obrigatorio da variavel total
	 * @param cc1
	 * @param cc2
	 * @return total
	 */
	double soma(double cc1, double cc2) {
		double total = cc1 + cc2;
		return total;
	}




}
