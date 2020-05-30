package br.senac.odissey.combatentes.ninfas;

import br.senac.odissey.combatentes.Curandeiro;
import br.senac.odissey.combatentes.Ninfas;

public class NinfaDasFlores extends Ninfas implements Curandeiro{
	
	public NinfaDasFlores() {
		super("Alseídes - Ninfa das Flores", 30, 6, 7, 8, "Caixa de Pandora");
	}
	

	public NinfaDasFlores(String nome, int vida, int forca, int defesa, int velocidade, String artefatos) {
		super(nome, vida, forca, defesa, velocidade, artefatos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int atacar() {
		int ataque_total = ataque();
		if (ataque_total == 9 || ataque_total == 12) {
			 ataque_total =  ativarExplosãoDeEspinho(ataque_total);
		}
		System.out.println("Ataca com: " + ataque_total);
		System.out.println("///////----//////");
		return ataque_total;
	}
	
	@Override
	public void recebeAtaque(int ataque) {
		if (vida == 4 || vida == 9 || vida == 14) {
			vida += curar();
			System.out.println(nome + " tomou o antidoto de restauração de energia");
			System.out.println(nome + " seu energia foi restaurada para " + vida);
			super.recebeAtaque(ataque);
		} else {
			super.recebeAtaque(ataque);
		}
	}
	
	//Metodo exclusivo da Ninfa das Flores
	private int ativarExplosãoDeEspinho(int ataque) {
		
		int ataque_total = ataque + 4;
		
		System.out.println(nome + " equipou seu ataque com uma bomba de espinhos venenosos");
		System.out.println(nome + " teve o ataque alterado para " + ataque_total);
		
		return ataque_total;
		 
		
	}
	
}
