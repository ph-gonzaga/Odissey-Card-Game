package br.senac.odissey.game;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import br.senac.odissey.combatentes.Harpia;
import br.senac.odissey.combatentes.amazonas.ArqueiraAmazonas;
import br.senac.odissey.combatentes.amazonas.RainhaAmazonas;

import java.util.Random;



public class Game {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws InterruptedException {
	
		Random rand = new Random();
		
		System.out.println("Bem vindo(a) ao Odissey Game!");
		
		Thread.sleep(1000);
		
		System.out.println("\nPara come�ar, insira os nomes dos jogadores.");
		System.out.println("\nNome do Jogador 1: ");
		String nome_jogador1 = scanner.nextLine();
		
		System.out.println("Nome do Jogador 2: ");
		String nome_jogador2 = scanner.nextLine();
		
		System.out.println("\nSejam bem-vindos, " + nome_jogador1 + " e " + nome_jogador2 + ", agora vamos realizar um sorteio para ver quem come�a escolhendo o deck!");
		Thread.sleep(1000);
		
		// Jogando os dados
		System.out.println("\n"+nome_jogador1 + ", jogue o dado e boa sorte!");
		
		int dado_jogador1 = jogarDado(1, 6);
		System.out.println("**jogando o dado**");
	
		Thread.sleep(2000);
		
		System.out.println("\nE caiu o n�mero " + dado_jogador1 + ".");
		
		Thread.sleep(1500);
		
		System.out.println("\n"+nome_jogador2 + ", agora � a sua vez, boa sorte!");
		
		Thread.sleep(1500);
		
		int dado_jogador2 = jogarDado(1, 6);
		System.out.println("**jogando o dado**");
		
		Thread.sleep(1500);
		System.out.println("\nE caiu o n�mero " + dado_jogador2 + ".");
		
		while(dado_jogador1 == dado_jogador2) {
			System.out.println("\nOs n�meros ca�ram iguais. " + nome_jogador1 + ", jogue novamente!");
			dado_jogador1 = jogarDado(1, 6);
			System.out.println("**jogando o dado**");
			
			Thread.sleep(1500);
			System.out.println("\nE caiu o n�mero " + dado_jogador1 + ".");
			
			dado_jogador2 = jogarDado(1, 6);
			System.out.println("**jogando o dado**");
			
			Thread.sleep(1500);
			System.out.println("\nE caiu o n�mero " + dado_jogador2 + ".");
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
		System.out.println("\n"+primeiro_jogador + ", parab�ns, vc ganhou. Comece escolhendo o deck.");
//		
		// Escolhendo o deck
		String[] deck = gerarDeck();
		
		escolherDeck(primeiro_jogador, deck);
	}
	
	private static String[] gerarDeck() {
		String[] deck = { 
			"Amazona",
			"Harpia",
			"Her�i"
		};
	    
	    return deck;
	}
	
	public static void escolherDeck(String primeiro_jogador, String[] deck) {
		// listando decks
		System.out.println("\nAs op��es de deck dispon�veis s�o:\n");
		for (int i = 0; i < deck.length; i++) {
			if(deck[i] != null) {
				System.out.println((i+1) + " -> " + deck[i]);
			}
		}		
		System.out.println("\nDigite o n�mero do deck desejado:");
		// escolhendo deck desejado
		boolean input_valido = false;
		int deck_escolhido = 0;
		while(!input_valido) {
		    try {
		    	deck_escolhido = scanner.nextInt();
		    	input_valido = true;
		    } catch(InputMismatchException e) {
		        System.out.println("Por favor digite um n�mero v�lido.");
		        scanner.next();
		    }
		}
		
		// selecionando o deck nas op��es
		if(deck_escolhido <= deck.length && deck_escolhido > 0){			
			String deck_jogador = deck[deck_escolhido];
			System.out.println(deck_jogador);
		} else {
			System.out.println("escolha um deck v�lido");
		}
	}
	
	
	private static int jogarDado(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("\nO valor m�ximo deve ser maior que o m�nimo");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}

}
