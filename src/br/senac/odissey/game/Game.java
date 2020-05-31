package br.senac.odissey.game;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

import br.senac.odissey.batalha.Batalha;
import br.senac.odissey.combatentes.*;
import br.senac.odissey.combatentes.amazonas.*;
import br.senac.odissey.combatentes.centauros.*;
import br.senac.odissey.combatentes.ninfas.*;
import br.senac.odissey.combatentes.harpias.*;
import br.senac.odissey.combatentes.herois.*;
import br.senac.odissey.combatentes.sereias.*;

//import br.senac.odissey.combatentes.Harpia;
//import br.senac.odissey.combatentes.amazonas.ArqueiraAmazonas;
//import br.senac.odissey.combatentes.amazonas.RainhaAmazonas;

import java.util.Random;



public class Game {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) throws InterruptedException, IOException {
	
		Random rand = new Random();
		
		System.out.println("Bem vindo(a) ao Odissey Game!");
		
//		Thread.sleep(1000);
		
		System.out.println("\nPara começar, insira os nomes dos jogadores.");
		System.out.println("\nNome do Jogador 1: ");
		String nome_jogador1 = scanner.nextLine();
		
		System.out.println("Nome do Jogador 2: ");
		String nome_jogador2 = scanner.nextLine();
		
		System.out.println("\nSejam bem-vindos, " + nome_jogador1 + " e " + nome_jogador2 + "!");
//		Thread.sleep(1000);
		System.out.println("\nVamos realizar um sorteio para ver quem começa escolhendo o deck!");
//		Thread.sleep(1000);
		
		// Jogando os dados
		System.out.println("\n"+nome_jogador1 + ", jogue o dado e boa sorte!");
		
		int dado_jogador1 = jogarDado(1, 6);
		System.out.println("**jogando o dado**");
	
//		Thread.sleep(2000);
		
		System.out.println("\nE caiu o número " + dado_jogador1 + ".");
		
//		Thread.sleep(1500);
		
		System.out.println("\n"+nome_jogador2 + ", agora é a sua vez, boa sorte!");
		
//		Thread.sleep(1500);
		
		int dado_jogador2 = jogarDado(1, 6);
		System.out.println("**jogando o dado**");
		
//		Thread.sleep(1500);
		System.out.println("\nE caiu o número " + dado_jogador2 + ".");
		
		while(dado_jogador1 == dado_jogador2) {
			System.out.println("\nOs números caíram iguais. " + nome_jogador1 + ", jogue novamente!");
//			Thread.sleep(1500);
			dado_jogador1 = jogarDado(1, 6);
			System.out.println("**jogando o dado**");
			
//			Thread.sleep(1500);
			System.out.println("\nE caiu o número " + dado_jogador1 + ".");
			
//			Thread.sleep(1500);
			System.out.println("\n"+nome_jogador2 + ", agora é a sua vez, boa sorte!");
			dado_jogador2 = jogarDado(1, 6);
			System.out.println("**jogando o dado**");
			
//			Thread.sleep(1500);
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
//		Thread.sleep(1500);

		System.out.println("\nARENA DE BATALHA: TITÃ.");
		System.out.println("\n"+primeiro_jogador + ", parabéns, vc ganhou. Comece escolhendo o deck.");
//		
		// Primeiro jogador escolhendo o deck
		String[] deck = gerarDeck();
		
		String deck_primeiro_jogador = escolherDeck(deck);
		
//		Thread.sleep(1500);
		
		ArrayList<Combatente> deck_final_player1 = carregandoCartas(deck_primeiro_jogador);
		
//		Thread.sleep(1500);
		// Segundo jogador escolhendo o deck
		System.out.println("\n" + segundo_jogador + ", agora é a sua vez.");
		String deck_segundo_jogador = escolherDeck(deck);
		
		ArrayList<Combatente> deck_final_player2 = carregandoCartas(deck_segundo_jogador);
		
		System.out.println("\nA batalha começará agora!");
//		Thread.sleep(1500);
		
		int vencedorBatalha = executarBatalha(deck_final_player1, deck_final_player2);
//		executarBatalha(deck_final_player1, deck_final_player2);
		
		switch (vencedorBatalha) {
		case 1:
			System.out.print("PARABÉNS, " + primeiro_jogador + "! \nVOCE VENCEU!!");
			System.out.print("Deck: " + deck_primeiro_jogador);
			break;
		case 2:
			System.out.print("PARABÉNS, " + segundo_jogador + "! \nVOCE VENCEU!!");
			System.out.print("\nDeck: " + deck_segundo_jogador);
			break;
		}		
	}
	
	
	
	public static int executarBatalha(ArrayList<Combatente> deck1, ArrayList<Combatente> deck2) throws InterruptedException {
		int qtd_deck1 = deck1.size();
		int qtd_deck2 = deck2.size();
		
//		System.out.println(calculaCartasDeck(qtd_deck1));
//		System.out.println(calculaCartasDeck(qtd_deck2));
		
		while(qtd_deck1 != 0 || qtd_deck2 != 0) {
			if(calculaCartasDeck(qtd_deck1) == 5 || calculaCartasDeck(qtd_deck2) == 5) {
				System.out.println("\n\nBATALHA ENCERRADA\n\n");
				break;
			} else {
				Batalha batalha = new Batalha(deck1.get(calculaCartasDeck(qtd_deck1)), deck2.get(calculaCartasDeck(qtd_deck2))); 
				int vencedor = batalha.lutar();
				switch (vencedor) {
				case 0:
					qtd_deck1--;
					qtd_deck2--;
					break;
				case 1:
					qtd_deck2--;
					break;
				case 2:
					qtd_deck1--;
					break;
				}
			}
		}
		
		if(qtd_deck1 == 0) {
			return 2;
		} else {
			return 1;
		}
	}

	private static int calculaCartasDeck(int qtdCartas) {
		return (qtdCartas-5)*-1;
	}
	
	private static String[] gerarDeck() {
		String[] deck = { 
			"Amazona",
			"Centauro",
			"Harpia",
			"Herói",
			"Ninfas",
			"Sereia",
			"Guerreiros",
			"Seres Mistícos"
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
				cardDeck.add(new EspiaAmazonas());
				cardDeck.add(new PrincesaAmazonas());
				cardDeck.add(new ArqueiraAmazonas());
				cardDeck.add(new LutadoraAmazonas());
				break;
			case "Centauro":
				cardDeck.add(new CentauroArqueiro());
				cardDeck.add(new CentauroDaCachoeira());
				cardDeck.add(new CentauroDoBosque());
				cardDeck.add(new CentauroGuardiao());
				cardDeck.add(new CentauroRei());
				break;
			case "Harpia":
				cardDeck.add(new HarpiaFantasma());
				cardDeck.add(new HarpiaCaverna());
				cardDeck.add(new HarpiaGelo());
				cardDeck.add(new HarpiaFogo());
				cardDeck.add(new HarpiaPsiquica());
				break;
			case "Herói":
				cardDeck.add(new Aquiles());
				cardDeck.add(new Hercules());
				cardDeck.add(new Odisseu());
				cardDeck.add(new Teseu());
				cardDeck.add(new Perseu());
				break;
			case "Ninfas":
				cardDeck.add(new NinfaDaFloresta());
				cardDeck.add(new NinfaDasAguasDoce());
				cardDeck.add(new NinfaDasFlores());
				cardDeck.add(new NinfaDasMontanhas());
				cardDeck.add(new NinfasDaTerra());
				break;
			case "Sereia":
				cardDeck.add(new SereiaCoral());
				cardDeck.add(new SereiaEletrica());
				cardDeck.add(new SereiaMistica());
				cardDeck.add(new SereiaRainha());
				cardDeck.add(new SereiaVenenosa());
				break;
			case "Guerreiros":
				cardDeck.add(new RainhaAmazonas());
				cardDeck.add(new LutadoraAmazonas());
				cardDeck.add(new Hercules());
				cardDeck.add(new Teseu());
				cardDeck.add(new Aquiles());
				break;
			case "Seres Mistícos":
				cardDeck.add(new SereiaVenenosa());
				cardDeck.add(new NinfasDaTerra());
				cardDeck.add(new CentauroGuardiao());
				cardDeck.add(new SereiaRainha());
				cardDeck.add(new HarpiaFantasma());
				break;
		}

		System.out.println("\nVc escolheu o deck: " + deck_escolhido);
		
		Thread.sleep(1500);
		
		// embaralhamento do deck
		Collections.shuffle(cardDeck);
		
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