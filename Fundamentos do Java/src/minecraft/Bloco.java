/**
 * Poo - Fundamentos
 */

package minecraft;

/**
 * 
 * @author Gabriela Classe Modelo
 */
public class Bloco {
	/**
	 * construtor
	 */

	public  Bloco(){
		super();
		System.out.println("-----------------------------");
	}
		
	// atributos
	int resistencia;
	String textura;

	// metodos
	// void-> um metodo simples sem retorno
	
	/**
	 * Metodo usado para construir um bloco
	 */
	void construir() {
		System.out.println("Bloco colocado");
	}
	
	/**
	 * Metodo de obter recursos de mineração
	 */
	void minerar() {
		System.out.println("Recursos obtidos");
	}
	
	
	/**
	 * Metodo para criar itens
	 */
	void craftar() {
		System.out.println("Item criado");
	}
}
