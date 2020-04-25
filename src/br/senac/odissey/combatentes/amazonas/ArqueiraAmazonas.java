package br.senac.odissey.combatentes.amazonas;

import br.senac.odissey.combatentes.Amazona;

public class ArqueiraAmazonas extends Amazona {
	
	public ArqueiraAmazonas() {
		super("Arqueira Amazonas", 100, 8, 5, 8, "Arco");
	}
	
	public ArqueiraAmazonas(String nome, int vida, int forca, int defesa, int velocidade, String equipamento) {
		super(nome, vida, forca, defesa, velocidade, equipamento);
	}

}
