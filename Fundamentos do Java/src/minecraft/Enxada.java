/**
 *POO - FUNDAMENTOS
 * 
 */
package minecraft;

/**
 * @author Gabriela Class Modelo com Heran�a (extend)
 *
 */
public class Enxada extends Bloco {

	/**
	 * Contru��o
	 */
	public Enxada() {
		System.out.print("_____ CAMPO _____ ");
	}

	// atributos
	boolean conquista;
	//metodo
	
	/**
	 * Metodo usado para arar a terra
	 */
	void arar() {
		System.out.print("Terra preparada para plantio");
			//Aten��o!
		    conquista = true;
	}

}
