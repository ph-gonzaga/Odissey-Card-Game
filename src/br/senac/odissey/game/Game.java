package br.senac.odissey.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.senac.odissey.batalha.Batalha;
import br.senac.odissey.combatentes.*;
import br.senac.odissey.combatentes.amazonas.*;
import br.senac.odissey.combatentes.harpias.*;
import br.senac.odissey.combatentes.herois.*;

import java.util.Random;

public class Game { 


	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Bem vindo(a) ao Odissey Game");
	

		List<Combatente> inimigo1 = new ArrayList<Combatente>();
		List<Combatente> inimigo2 = new ArrayList<Combatente>();

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
				  
	}
}
