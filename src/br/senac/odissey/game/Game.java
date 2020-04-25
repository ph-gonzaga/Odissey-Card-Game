package br.senac.odissey.game;
import java.util.ArrayList;
import java.util.Scanner;

import br.senac.odissey.combatentes.Harpia;
import br.senac.odissey.combatentes.amazonas.ArqueiraAmazonas;
import br.senac.odissey.combatentes.amazonas.RainhaAmazonas;

import java.util.Random;



public class Game {

	public static void main(String[] args) {
		
		/*
		 * ArrayList<Combatente> cartasDeckJogador1 = new ArrayList(); ArrayList<String>
		 * cartasDeckJogador2 = new ArrayList<String>();
		 */
	
		Scanner scanner = new Scanner(System.in);
		
		RainhaAmazonas rainha_amazonas = new RainhaAmazonas();
		ArqueiraAmazonas arqueira_amazonas = new ArqueiraAmazonas();

		System.out.println("Bem vindo(a) ao Odissey Game");
		
		System.out.println(rainha_amazonas.getNome());
		/*
		 * System.out.println(rainha_amazonas.getVida());
		 * System.out.println(rainha_amazonas.getForca());
		 * System.out.println(rainha_amazonas.getDefesa());
		 * System.out.println(rainha_amazonas.getVelocidade());
		 * System.out.println(rainha_amazonas.getEquipameto());
		 */
		
		
		System.out.println(arqueira_amazonas.getNome());
		/*
		 * System.out.println(arqueira_amazona.getVida());
		 * System.out.println(arqueira_amazona.getForca());
		 * System.out.println(arqueira_amazona.getDefesa());
		 * System.out.println(arqueira_amazona.getVelocidade());
		 * System.out.println(arqueira_amazona.getEquipameto());
		 */
		
		int ataque = rainha_amazonas.atacar();
		arqueira_amazonas.recebeAtaque(ataque);
		System.out.println(arqueira_amazonas.getNome() + " Possui de Vida Total " + arqueira_amazonas.getVida());
		ataque = arqueira_amazonas.atacar();
		rainha_amazonas.recebeAtaque(ataque);
		System.out.println(rainha_amazonas.getNome() + " Possui de Vida Total " + rainha_amazonas.getVida());
		
		/*
		 * System.out.print("Nome do Jogador 1: "); String nome_jogador1 =
		 * scanner.next();
		 * 
		 * System.out.print("Nome do Jogador 2: "); String nome_jogador2 =
		 * scanner.next();
		 * 
		 * int QuemComeca = rand.nextInt(2); //if (QuemComeca == 1) {
		 * System.out.println("Jogador 1: " + nome_jogador1 +
		 * " Voce foi escolhido para iniciar a batalha!");
		 * System.out.println("Escolha seu deck!"); //Exibir deck disponiveis
		 * System.out.println("Digite o nome do seu deck: "); String deck_jogador1 =
		 * scanner.next(); //metodo que identifica deck retorna deck com cards para
		 * usuario 1
		 * 
		 * }else { System.out.println("Jogador 2: " + nome_jogador2 +
		 * " /n Voce foi escolhido para iniciar a batalha!");
		 * //metodo_exibir_escolher_deck }
		 */

	}

}
