package br.senac.odissey.combatentes.herois;

import br.senac.odissey.combatentes.Heroi;

public class Aquiles extends Heroi {
	
	public Aquiles() {
		super("Aquiles", 30, 6, 8, 7, "Lança");
	}

	public Aquiles(String nome, int vida, int forca, int defesa, int velocidade, String equipamento) {
		super(nome, vida, forca, defesa, velocidade, equipamento);
	}
	
	
	@Override
	public void recebeAtaque(int ataque) {
		if (ataque > 16) {
			ataque = ativarPisadaTerremoto(ataque);
			super.recebeAtaque(ataque);
		} else {
			super.recebeAtaque(ataque);
		}
	}

	
	
	// Metodo exclusivo para Aquiles

	
	private int ativarPisadaTerremoto(int ataque) {
	
		int ataque_total = ataque - 1;
		vida += 1;
		
		System.out.println(nome + " ativou a Pisada Terremoto");
		System.out.println(nome + " recupera sua energial total para " + vida);
		System.out.println("O ataque do oponente foi reduzido para " + ataque_total);
		
		return ataque_total;
		 
		
	}


}
