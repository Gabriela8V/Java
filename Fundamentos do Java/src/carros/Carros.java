/**
 * Fundamentos do Carro.java
 */

package carros;



/**
 * 
 * @author Gabriela
 *
 */

public class Carros {

		
	
	
	
	
		public Carros() {
		super();
		// TODO Auto-generated constructor stub
	}
		/*
		 * M�todo principal
		 */
			 /**0
			 * @author Gabriela
			 * Classe respons�vel pela craia��o dos objetos
			 */
			public static void main(String[] args) {
				// Objeto 1
				
						Carro Fusca volkswagen = new Carro();
						fuscaClassico.ano = 1938 ;
						fuscaClassico.cor = "Preto";
						System.out.println("Ano de fabrica��o: " + fuscaClassico.ano);
						System.out.println("Cor do carro: " + fuscaClassico.cor);
						fuscaClassico.ligar();
						fuscaClassico.desligar();
						fuscaClassico.acelerar();
						// Objeto 2
						Carro fusca Sedan = new Carro();
						fuscaSedan.ano = 1959 ;
						fuscaSedan.cor = "Verde";
						System.out.println("Ano de fabrica��o: " + fuscaSedan.ano);
						System.out.println("Cor do carro: " + fuscaSedan.cor);
						fuscaSedan.ligar();
						fuscaSedan.desligar();
						fuscaSedan.acelerar();
			}

		}