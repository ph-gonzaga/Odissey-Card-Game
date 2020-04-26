package br.senac.odissey.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.senac.odissey.combatentes.*;
import br.senac.odissey.combatentes.amazonas.*;

import java.util.Random;

public class Game {

	public static void main(String[] args) throws InterruptedException {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Bem vindo(a) ao Odissey Game");

		ArrayList<Combatente> cardDeck1 = new ArrayList<Combatente>();

		cardDeck1.add(new RainhaAmazonas());
		cardDeck1.add(new PrincesaAmazonas());
		cardDeck1.add(new ArqueiraAmazonas());

		System.out.println("Iniciando o jogo com as cartas das Harpias");

		for (Combatente card : cardDeck1) {
			System.out.println(card.getNome());
		}

	}

}
