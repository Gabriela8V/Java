/**
 * 
 */
package minecraft;

/**
 * @author Gabriela
 *
 */
public class Itens {

	/**
	 * 
	 */
	public Itens() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * Metodo principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Enxada enxadaDiamante = new Enxada();
		enxadaDiamante.resistencia = 10;
		enxadaDiamante.textura = "Diamante";
		enxadaDiamante.conquista = false;
		System.out.println("Enxada de " + enxadaDiamante.textura);
		System.out.println("Enxada de " + enxadaDiamante.resistencia);
		enxadaDiamante.arar();
		if (enxadaDiamante.conquista == true) {
			System.out.println("--------------------");
			System.out.println("Conquista obtida!");
			System.out.println("Dedica??o s?ria. Hora do plantio");
			System.out.println("---------------------");
		}

	}

}
