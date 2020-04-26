package br.senac.odissey.game;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import br.senac.odissey.combatentes.*;
import br.senac.odissey.combatentes.amazonas.*;
import br.senac.odissey.combatentes.harpias.*;
import br.senac.odissey.combatentes.herois.*;
//import br.senac.odissey.combatentes.Harpia;
//import br.senac.odissey.combatentes.amazonas.ArqueiraAmazonas;
//import br.senac.odissey.combatentes.amazonas.RainhaAmazonas;

import java.util.Random;



public class Game {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws InterruptedException, IOException {
	
		Random rand = new Random();
		
		System.out.println("Bem vindo(a) ao Odissey Game!");
		
		Thread.sleep(1000);
		
		System.out.println("\nPara começar, insira os nomes dos jogadores.");
		System.out.println("\nNome do Jogador 1: ");
		String nome_jogador1 = scanner.nextLine();
		
		System.out.println("Nome do Jogador 2: ");
		String nome_jogador2 = scanner.nextLine();
		
		System.out.println("\nSejam bem-vindos, " + nome_jogador1 + " e " + nome_jogador2 + ", agora vamos realizar um sorteio para ver quem começa escolhendo o deck!");
		Thread.sleep(1000);
		
		// Jogando os dados
		System.out.println("\n"+nome_jogador1 + ", jogue o dado e boa sorte!");
		
		int dado_jogador1 = jogarDado(1, 6);
		System.out.println("**jogando o dado**");
	
		Thread.sleep(2000);
		
		System.out.println("\nE caiu o número " + dado_jogador1 + ".");
		
		Thread.sleep(1500);
		
		System.out.println("\n"+nome_jogador2 + ", agora é a sua vez, boa sorte!");
		
		Thread.sleep(1500);
		
		int dado_jogador2 = jogarDado(1, 6);
		System.out.println("**jogando o dado**");
		
		Thread.sleep(1500);
		System.out.println("\nE caiu o número " + dado_jogador2 + ".");
		
		while(dado_jogador1 == dado_jogador2) {
			System.out.println("\nOs números caíram iguais. " + nome_jogador1 + ", jogue novamente!");
			Thread.sleep(1500);
			dado_jogador1 = jogarDado(1, 6);
			System.out.println("**jogando o dado**");
			
			Thread.sleep(1500);
			System.out.println("\nE caiu o número " + dado_jogador1 + ".");
			
			Thread.sleep(1500);
			System.out.println("\n"+nome_jogador2 + ", agora é a sua vez, boa sorte!");
			dado_jogador2 = jogarDado(1, 6);
			System.out.println("**jogando o dado**");
			
			Thread.sleep(1500);
			System.out.println("\nE caiu o número " + dado_jogador2 + ".");
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

		System.out.println("\n"+primeiro_jogador + ", parabéns, vc ganhou. Comece escolhendo o deck.");
//		
		// Primeiro jogador escolhendo o deck
		String[] deck = gerarDeck();
		
		String deck_primeiro_jogador = escolherDeck(deck);
		
		System.out.println("\n" + primeiro_jogador + ", vc escolheu o deck: " + deck_primeiro_jogador+".");
		
		Thread.sleep(1500);
		
		ArrayList<Combatente> deck_final_player1 = carregandoCartas(deck_primeiro_jogador);
		
		Thread.sleep(1500);		
				
		// Segundo jogador escolhendo o deck
		System.out.println("\n" + segundo_jogador + ", agora é a sua vez.");
		String deck_segundo_jogador = escolherDeck(deck);
		System.out.println("\n" + segundo_jogador + ", vc escolheu o deck: " + deck_segundo_jogador+".");
		
		ArrayList<Combatente> deck_final_player2 = carregandoCartas(deck_segundo_jogador);
		
		System.out.println("\nA batalha começará agora!");
		Thread.sleep(1500);
		
	}

	
	private static String[] gerarDeck() {
		String[] deck = { 
			"Amazona",
			"Harpia",
			"Herói"
		};
	    
	    return deck;
	}
	
	public static String escolherDeck(String[] deck) {
		// listando decks
		System.out.println("\nAs opções de deck disponíveis são:\n");
		for (int i = 0; i < deck.length; i++) {
			if(deck[i] != null) {
				System.out.println((i+1) + " -> " + deck[i]);
			}
		}		
		System.out.println("\nDigite o número do deck desejado:");
		// escolhendo deck desejado
		boolean input_valido = false;
		int deck_escolhido = 0;
		while(!input_valido) {
		    try {
		    	deck_escolhido = scanner.nextInt();
		    	if(deck_escolhido <= deck.length && deck_escolhido > 0) {
		    		deck_escolhido--;
		    		input_valido = true;
		    	} else {
		    		System.out.println("Por favor, escolha um deck válido.");
		    	}
		    } catch(InputMismatchException e) {
		        System.out.println("Por favor, digite um número válido.");
		        scanner.next();
		    }
		}
		
		// selecionando deck p/ o jogador
		String deck_jogador = deck[deck_escolhido];
		// removendo deck escolhido das opçoes disponiveis
		deck[deck_escolhido] = null;
		
		return deck_jogador;
		
	}
	
	public static ArrayList<Combatente> carregandoCartas(String deck_escolhido) throws InterruptedException {
		ArrayList<Combatente> cardDeck = new ArrayList<Combatente>();
		
		switch (deck_escolhido) {
		case "Amazona":
			cardDeck.add(new RainhaAmazonas());
			cardDeck.add(new PrincesaAmazonas());
			cardDeck.add(new ArqueiraAmazonas());
			break;
		case "Harpia":
			cardDeck.add(new HarpiaFantasma());
			cardDeck.add(new HarpiaGelo());
			cardDeck.add(new HarpiaPsiquica());
			break;
		case "Herói":
			cardDeck.add(new Aquiles());
			cardDeck.add(new Hercules());
			cardDeck.add(new Perseu());
			break;
		}

		System.out.println("\nIniciando o jogo com o deck: " + deck_escolhido);
		
		Thread.sleep(1500);
		System.out.println("\nSuas cartas são:\n");
		for (Combatente card : cardDeck) {
			System.out.println("- " + card.getNome() + ";");
		}
		
		return cardDeck;
	}
	
	
	private static int jogarDado(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("\nO valor máximo deve ser maior que o mínimo");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

}
