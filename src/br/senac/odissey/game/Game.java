package br.senac.odissey.game;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import br.senac.odissey.batalha.Batalha;
import br.senac.odissey.combatentes.*;
import br.senac.odissey.combatentes.amazonas.*;
import br.senac.odissey.combatentes.harpias.*;
import br.senac.odissey.combatentes.herois.*;
<<<<<<< HEAD
//import br.senac.odissey.combatentes.Harpia;
//import br.senac.odissey.combatentes.amazonas.ArqueiraAmazonas;
//import br.senac.odissey.combatentes.amazonas.RainhaAmazonas;
=======
>>>>>>> 1b04e0f4febd6c83ce695af1116a2a33d7e4ca49

import java.util.Random;



public class Game {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws InterruptedException, IOException {
	
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
			Thread.sleep(1500);
			dado_jogador1 = jogarDado(1, 6);
			System.out.println("**jogando o dado**");
			
			Thread.sleep(1500);
			System.out.println("\nE caiu o n�mero " + dado_jogador1 + ".");
			
			Thread.sleep(1500);
			System.out.println("\n"+nome_jogador2 + ", agora � a sua vez, boa sorte!");
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
		// Primeiro jogador escolhendo o deck
		String[] deck = gerarDeck();
		
		String deck_primeiro_jogador = escolherDeck(deck);
		
		System.out.println("\n" + primeiro_jogador + ", vc escolheu o deck: " + deck_primeiro_jogador+".");
		
		Thread.sleep(1500);
		
		ArrayList<Combatente> deck_final_player1 = carregandoCartas(deck_primeiro_jogador);
		
		Thread.sleep(1500);
		// Segundo jogador escolhendo o deck
		System.out.println("\n" + segundo_jogador + ", agora � a sua vez.");
		String deck_segundo_jogador = escolherDeck(deck);
		System.out.println("\n" + segundo_jogador + ", vc escolheu o deck: " + deck_segundo_jogador+".");
		
		ArrayList<Combatente> deck_final_player2 = carregandoCartas(deck_segundo_jogador);
		
		System.out.println("\nA batalha come�ar� agora!");
		Thread.sleep(1500);
		
//		for (Combatente temp : deck_final_player1) {
//            System.out.println(temp);
//        }
		
		executarBatalha(deck_final_player1, deck_final_player2);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void executarBatalha(ArrayList<Combatente> deck1, ArrayList<Combatente> deck2) throws InterruptedException {
		for (int i = 0; i < deck1.size(); i++) {
			for (int ii = 0; ii < deck2.size(); ii++) {
				Batalha batalha = new Batalha(deck1.get(i), deck2.get(ii)); 
				Combatente vencedor = batalha.lutar();
				System.out.println("Vencedor: " + vencedor.getNome());
			}
		}
//		Batalha batalha = new Batalha(deck1.get(1), deck2.get(1)); 
//		Combatente vencedor = batalha.lutar();
//		System.out.println("Vencedor: " + vencedor.getNome());
	}

<<<<<<< HEAD
	private static String[] gerarDeck() {
		String[] deck = { 
			"Amazona",
			"Harpia",
			"Her�i"
		};
	    
	    return deck;
	}
	
	public static String escolherDeck(String[] deck) {
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
		    	if(deck_escolhido <= deck.length && deck_escolhido > 0) {
		    		deck_escolhido--;
		    		input_valido = true;
		    	} else {
		    		System.out.println("Por favor, escolha um deck v�lido.");
		    	}
		    } catch(InputMismatchException e) {
		        System.out.println("Por favor, digite um n�mero v�lido.");
		        scanner.next();
		    }
		}
		
		// selecionando deck p/ o jogador
		String deck_jogador = deck[deck_escolhido];
		// removendo deck escolhido das op�oes disponiveis
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
		case "Her�i":
			cardDeck.add(new Aquiles());
			cardDeck.add(new Hercules());
			cardDeck.add(new Perseu());
			break;
		}

		System.out.println("\nVc escolheu o deck: " + deck_escolhido);
		
		Thread.sleep(1500);
		System.out.println("\nSuas cartas s�o:\n");
		for (Combatente card : cardDeck) {
			System.out.println("- " + card.getNome() + ";");
		}
		
		return cardDeck;
	}
	
	
	private static int jogarDado(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("\nO valor m�ximo deve ser maior que o m�nimo");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
=======
		inimigo1.add(new Aquiles());
		inimigo2.add(new ArqueiraAmazonas());
		/* inimigo2.add(new HarpiaGelo()); */
		
        for (Combatente cartaDeck1 : inimigo1) {
        	for (Combatente cartaDeck2 : inimigo2) {
        		 Batalha batalha = new Batalha(cartaDeck1, cartaDeck2); 
				 String vencedor = batalha.lutar();
				 System.out.println("Vencedor: " + vencedor);
            }
        }
				  
>>>>>>> 1b04e0f4febd6c83ce695af1116a2a33d7e4ca49
	}

}
