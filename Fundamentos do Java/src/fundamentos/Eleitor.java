/**
 *Fundamentos do Java
 * Variaveis, operadores e estruturas de console
 * Exercicio 1 - App Eleitor
 * Desenvolver um APP no modo console que em função da idade do 
 * eleitor avise se o voto é obrigatorio ou não 
 * Abaixo de 16 anos Voto PROIBIDO
 * Entre 18 e 70 (Incluindo 18 e 70) - VOTO OBRIGATORIO
 * 16,17 ou acima de 70 - VOTO FACULTATIVO
 */

package fundamentos;

import java.util.Scanner;

/**
 * @author gabriela.vsantos13
 *
 */
public class Eleitor {

	/**
	 * Metodo principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Variaveis
		int idade;
		// objetos
		Scanner teclado = new Scanner(System.in);
		System.out.println("APP ELEITOR ==================");
		System.out.print("Digite sua idade:");
		// entrada
		idade = teclado.nextInt();
		// apoio ao texte do fluxo (verificar se a idade foi capturada)
		// System.out.print(idade);
		//processamento e saida
		if (idade < 16) {
			System.out.print("PROIBIDO VOTAR");
		} else if (idade > 17 && idade < 71) {
			System.out.print("VOTO OBRIGATORIO");
		} else {
			System.out.print("VOTO FACULTATIVO      ");
		}
		//encerrar a captura de dados
		teclado.close();
	}

}
