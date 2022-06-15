/**
 * 
 */
package carros;

/**
 * @author Gabriela
 *
 */
public class Base {

	/**
	 * 
	 */
	public Base() {
		super();
		System.out.println("===============================");
	}
	// Atributos
	int ano;
	String cor;

	// Modelos
		// void -> Método simples sem retorno
		/**
		 * Método usado para ligar o carro
		 */
		void ligar() {
			System.out.println("Carro Ligado");
		}
		/**
		 * Método usado para desligar o carro
		 */
		void desligar() {
			System.out.println("Carro Desligado");
		}
		/**
		 * Método usado para acelerar o carro
		 */
		void acelerar() {
			System.out.println("Carro acelerado");
		}
	
}