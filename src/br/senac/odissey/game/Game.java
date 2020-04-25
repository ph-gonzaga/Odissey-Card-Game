package br.senac.odissey.game;
import java.util.ArrayList;
import java.util.Scanner;

import br.senac.odissey.combatentes.Harpia;
import br.senac.odissey.combatentes.amazonas.ArqueiraAmazonas;
import br.senac.odissey.combatentes.amazonas.RainhaAmazonas;

import java.util.Random;



public class Game {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * ArrayList<Combatente> cartasDeckJogador1 = new ArrayList(); ArrayList<String>
		 * cartasDeckJogador2 = new ArrayList<String>();
		 */
	
		Random rand = new Random();
		
		System.out.println("Bem vindo(a) ao Odissey Game!");
		
		Thread.sleep(1000);
		
		System.out.println("Para começar, insira os nomes dos jogadores.");
		System.out.println("Nome do Jogador 1: ");
		String nome_jogador1 = scanner.nextLine();
		
		System.out.println("Nome do Jogador 2: ");
		String nome_jogador2 = scanner.nextLine();
		
		System.out.println("Sejam bem-vindos, " + nome_jogador1 + " e " + nome_jogador2 + ", agora vamos realizar um sorteio para ver quem começa escolhendo o deck!");
		Thread.sleep(1000);
		
		// Jogando os dados
		System.out.println(nome_jogador1 + ", jogue o dado e boa sorte!");
		
		int dado_jogador1 = jogarDado(1, 6);
		System.out.println("**jogando o dado**");
	
		Thread.sleep(2000);
		
		System.out.println("E caiu o número " + dado_jogador1 + ".");
		
		Thread.sleep(1500);
		
		System.out.println(nome_jogador2 + ", agora é a sua vez, boa sorte!");
		
		Thread.sleep(1500);
		
		int dado_jogador2 = jogarDado(1, 6);
		System.out.println("**jogando o dado**");
		
		Thread.sleep(1500);
		System.out.println("E caiu o número " + dado_jogador2 + ".");
		
		while(dado_jogador1 == dado_jogador2) {
			System.out.println("Os números caíram iguais. " + nome_jogador1 + ", jogue novamente!");
			dado_jogador1 = jogarDado(1, 6);
			System.out.println("**jogando o dado**");
			
			Thread.sleep(1500);
			System.out.println("E caiu o número " + dado_jogador1 + ".");
			
			dado_jogador2 = jogarDado(1, 6);
			System.out.println("**jogando o dado**");
			
			Thread.sleep(1500);
			System.out.println("E caiu o número " + dado_jogador2 + ".");
		}
		
		// declara vencedor dos dados
		String primeiro_jogador;
		String segundo_jogador;
		if(dado_jogador1 > dado_jogador2) {
			primeiro_jogador = nome_jogador1;
			segundo_jogador = nome_jogador2;
		} else {
			primeiro_jogador = nome_jogador2;
			segundo_jogador = nome_jogador1;
		}
//		
		Thread.sleep(1500);
		System.out.println(primeiro_jogador + ", parabéns, vc ganhou. Comece escolhendo o deck.");
//		
		// Escolhendo o deck
		String[] deck = gerarDeck();
		
		escolherDeck(primeiro_jogador, deck);
		
		

//		RainhaAmazonas rainha_amazonas = new RainhaAmazonas();
//		ArqueiraAmazonas arqueira_amazonas = new ArqueiraAmazonas();
//		
//		System.out.println(rainha_amazonas.getNome());
		/*
		 * System.out.println(rainha_amazonas.getVida());
		 * System.out.println(rainha_amazonas.getForca());
		 * System.out.println(rainha_amazonas.getDefesa());
		 * System.out.println(rainha_amazonas.getVelocidade());
		 * System.out.println(rainha_amazonas.getEquipameto());
		 */
		
		
//		System.out.println(arqueira_amazonas.getNome());
		/*
		 * System.out.println(arqueira_amazona.getVida());
		 * System.out.println(arqueira_amazona.getForca());
		 * System.out.println(arqueira_amazona.getDefesa());
		 * System.out.println(arqueira_amazona.getVelocidade());
		 * System.out.println(arqueira_amazona.getEquipameto());
		 */
		
//		int ataque = rainha_amazonas.atacar();
//		arqueira_amazonas.recebeAtaque(ataque);
//		System.out.println(arqueira_amazonas.getNome() + " Possui de Vida Total " + arqueira_amazonas.getVida());
//		ataque = arqueira_amazonas.atacar();
//		rainha_amazonas.recebeAtaque(ataque);
//		System.out.println(rainha_amazonas.getNome() + " Possui de Vida Total " + rainha_amazonas.getVida());
		
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
	
	private static String[] gerarDeck() {
		String[] deck = { 
			"Amazona",
			"Harpia",
			"Herói"
		};
	    
	    return deck;
	}
	
	public static void escolherDeck(String primeiro_jogador, String[] deck) {
		// listando decks
		System.out.println(primeiro_jogador + ", as opções de deck disponíveis são:\n");
		for (int i = 0; i < deck.length; i++) {
			System.out.println((i+1) + " -> " + deck[i]);
		}		
		System.out.println("\nDigite o número do deck desejado.");
		// escolhendo deck desejado
		int deck_escolhido = scanner.nextInt();
		System.out.println("Deck escolhido:"+deck_escolhido);
		
		
	}
	
	
	private static int jogarDado(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("O valor máximo deve ser maior que o mínimo");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

}
