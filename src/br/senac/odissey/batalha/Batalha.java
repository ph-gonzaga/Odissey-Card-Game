
package br.senac.odissey.batalha;

import br.senac.odissey.combatentes.*;

import java.util.List;
import java.util.Random;


public class Batalha {

	private Combatente inimigo1;
	private Combatente inimigo2;
	
	public Batalha(Combatente inimigo1, Combatente inimigo2) {
		this.inimigo1 = inimigo1;
		this.inimigo2 = inimigo2;
	}
	
	public int lutar() throws InterruptedException{
		while(batalhaContinua()) {
			Thread.sleep(500);
			statusPersonagem();

			System.out.println("BATALHA----------------------------------");
			System.out.println("---------------------------------------------------------------------------");
			System.out.println(inimigo1.getNome().toUpperCase() +  " VS " + inimigo2.getNome().toUpperCase());
			System.out.println("---------------------------------------------------------------------------");
			

			int ataque = inimigo1.atacar();
			inimigo2.recebeAtaque(ataque);
			System.out.println("---------------------------------------------------------------------------");
			ataque = inimigo2.atacar(); 
			inimigo1.recebeAtaque(ataque);
			System.out.println("---------------------------------------------------------------------------");
			
			System.out.println("ENERGIAS");
			System.out.println(inimigo1.getNome().toUpperCase() + ": " + String.valueOf(inimigo1.getVida()));
			System.out.println(inimigo2.getNome().toUpperCase() + ": " + String.valueOf(inimigo2.getVida()));
			System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

		}
		return retornaVencedor();
	}

	private boolean batalhaContinua() {
		return  inimigo1.estaVivo() && inimigo2.estaVivo();
	}
	
	private int retornaVencedor() {
		if (inimigo1.estaMorto() && inimigo2.estaMorto()) {
			System.out.println("Empate");
			return 0;
		} else if(inimigo1.estaVivo() == true){
			System.out.println("\nVencedor: " + inimigo1.getNome()+"\n");
			return 1;
		} else {
			System.out.println("\nVencedor: " + inimigo2.getNome()+"\n");
			return 2;
		}
	}
	
	private void statusPersonagem() {
		//System.out.println("\n");
		//System.out.println("===========///=============");
		//System.out.println("STATUS CARD JOGADOR 1");
		//System.out.println(inimigo1.getNome().toUpperCase());
		//System.out.println("HP: " + inimigo1.getVida());
		//System.out.println("FORÇA: " + inimigo1.getForca());
		//System.out.println("DEFESA: " + inimigo1.getDefesa());
		//System.out.println("VELOCIDADE: " + inimigo1.getVelocidade());
		//System.out.println("===========///=============");
		//System.out.println("STATUS CARD JOGADOR 2");
		//System.out.println(inimigo2.getNome().toUpperCase());
		//System.out.println("HP: " + inimigo2.getVida());
		//System.out.println("FORÇA: " + inimigo2.getForca());
		//System.out.println("DEFESA: " + inimigo2.getDefesa());
		//System.out.println("VELOCIDADE: " + inimigo2.getVelocidade());
		//System.out.println("===========///=============");
		//System.out.println("\n");
	}
	

}
