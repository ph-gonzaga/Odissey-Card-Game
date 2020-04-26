package br.senac.odissey.combatentes.amazonas;

import br.senac.odissey.combatentes.Amazona;
import br.senac.odissey.combatentes.Curandeiro;

public class PrincesaAmazonas extends Amazona implements Curandeiro  {
	
	public PrincesaAmazonas() {
		super("Princesa Amazonas", 100, 5, 10, 6, "Escudo");
	}

	public PrincesaAmazonas(String nome, int vida, int forca, int defesa, int velocidade, String equipamento) {
		super(nome, vida, forca, defesa, velocidade, equipamento);
		
	}

	// Metodo exclusivo para Princesa Amazonas
	
	
	@Override
	public void recebeAtaque(int ataque) {
		if (vida == 5 || vida == 10 || vida == 15) {
			vida += curar();
			System.out.println(nome + " ativou o efeito de cura");
			System.out.println(nome + " seu energia foi restaurada para " + vida);
			super.recebeAtaque(ataque);
		} else {
			super.recebeAtaque(ataque);
		}
	}

	
}

