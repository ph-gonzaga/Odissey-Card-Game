package br.senac.odissey.combatentes.harpias;

import br.senac.odissey.combatentes.Harpia;

public class HarpiaFantasma extends Harpia {
	
	protected boolean veneno = false;
	
	public HarpiaFantasma() {
		super("Harpia Fantasma", 30, 7, 7, 7);
	}
	

	public HarpiaFantasma(String nome, int vida, int forca, int defesa, int velocidade) {
		super(nome, vida, forca, defesa, velocidade);
	}
	
	@Override
	public int atacar() {
		int ataque_total = ataque();
		if (ataque_total < 9) {
			 ataque_total = ativarMordidaAcida(ataque_total);
			 veneno = true ;
		}
		System.out.println("Ataca com: " + ataque_total);
		System.out.println("///////----//////");
		return ataque_total;
	}
	
	@Override
	public void recebeAtaque(int ataque) {
		if (veneno == true) {
			ativarVeneno();
			veneno = false;
			super.recebeAtaque(ataque);
		} else {
			super.recebeAtaque(ataque);
		}
	}

	
	
	// Metodo exclusivo para Guerreiro
	
	public void ativarVeneno() {
		
		vida -= 1;
		
		System.out.println(nome + " ficou envenenado com a Mordida Acida");
		System.out.println(nome + " teve a vida reduziada para " + vida);
		
	}
	
	public int ativarMordidaAcida(int ataque) {
	
		int ataque_total = ataque + 2;
		
		System.out.println(nome + " ativou a Mordida Acida");
		System.out.println(nome + " teve o ataque alterado para " + ataque_total);
		
		return ataque_total;
		 
		
	}

}
