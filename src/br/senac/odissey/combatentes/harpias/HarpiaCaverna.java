package br.senac.odissey.combatentes.harpias;

import br.senac.odissey.combatentes.Harpia;

public class HarpiaCaverna extends Harpia {
	
	
	public HarpiaCaverna() {
		super("Harpia das Cavernas", 30, 5, 9, 7, "Pena de Icarus");
	}
	

	public HarpiaCaverna(String nome, int vida, int forca, int defesa, int velocidade, String artefatos) {
		super(nome, vida, forca, defesa, velocidade, artefatos);
	}
	
	@Override
	public int atacar() {
		int ataque_total = ataque();
		if (ataque_total == 8 || ataque_total == 10 || ataque_total == 13) {
			 ataque_total = ativarUnhaAfiada(ataque_total);
		}
		System.out.println("Ataca com: " + ataque_total);
		System.out.println("///////----//////");
		return ataque_total;
	}
	

	// Metodos exclusivos para Harpia das Cavernas
	
	private int ativarUnhaAfiada(int ataque) {
	
		System.out.println(nome + " ativou a investida unha afiada");
		
		return ataque += rand.nextInt(6);
		 
		
	}

}
