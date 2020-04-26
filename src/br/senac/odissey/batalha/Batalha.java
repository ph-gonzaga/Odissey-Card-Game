
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
	
	public Combatente lutar() throws InterruptedException{
		while(batalhaContinua()) {
			int ataque = inimigo1.atacar(); 
			inimigo2.recebeAtaque(ataque); 
			 ataque = inimigo2.atacar(); 
			 inimigo1.recebeAtaque(ataque);
		}
		return retornaVencedor();
	}

	private boolean batalhaContinua() {
		return  inimigo1.estaVivo() && inimigo2.estaVivo();
	}
	
	private Combatente retornaVencedor() {
		return  (inimigo1.estaVivo() ? inimigo1 : inimigo2);
	}
	
	


}
