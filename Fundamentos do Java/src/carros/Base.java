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
		// void -> M?todo simples sem retorno
		/**
		 * M?todo usado para ligar o carro
		 */
		void ligar() {
			System.out.println("Carro Ligado");
		}
		/**
		 * M?todo usado para desligar o carro
		 */
		void desligar() {
			System.out.println("Carro Desligado");
		}
		/**
		 * M?todo usado para acelerar o carro
		 */
		void acelerar() {
			System.out.println("Carro acelerado");
		}
	
}