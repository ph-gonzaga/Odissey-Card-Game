package br.senac.odissey.combatentes.amazonas;

import br.senac.odissey.combatentes.Amazona;

public class RainhaAmazonas extends Amazona {

	public RainhaAmazonas() {
		super("Rainha Amazonas", 100, 7, 9, 5, "lança");
	}
	
	public RainhaAmazonas(String nome, int vida, int forca, int defesa, int velocidade, String equipamento) {
		super(nome, vida, forca, defesa, velocidade, equipamento);
	}


}
