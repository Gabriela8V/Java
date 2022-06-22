/**
 * Seguros
 */

package seguros;

import contas.Conta;

/**
 * @author gabriela.vsantos13
 *
 */
public class SeguroPessoafisica  extends Conta {

	/**
	 * Métodos principais
	 * @param args
	 */
	public static void main(String[] args) {
		//Cliente 3
		SeguroPessoafisica cc3 = new SeguroPessoafisica();
		cc3.setCliente  ("Robson Vaamonde");
		cc3.setSaldo  (9000);
		System.out.println("Cliente: "+ cc3.getCliente());
		cc3.exibirSaldo();
		
		

	}

}
