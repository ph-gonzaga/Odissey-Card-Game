package br.senac.odissey.combatentes.herois;

import br.senac.odissey.combatentes.Heroi;

public class Teseu extends Heroi {
	
	public Teseu() {
		super("Teseu", 30, 8, 6, 7, "Espada");
	}

	public Teseu(String nome, int vida, int forca, int defesa, int velocidade, String equipamento) {
		super(nome, vida, forca, defesa, velocidade, equipamento);
	}
	
	
	@Override
	public int atacar() {
		int ataque_total = ataque();
		if (ataque_total == 11 || ataque_total == 14) {
			 ataque_total = ativarInvestidaDeFerro(ataque_total);
		}
		System.out.println("Ataca com: " + ataque_total);
		System.out.println("///////----//////");
		return ataque_total;
	}
	

	// Metodos exclusivos para Teseu
	
	private int ativarInvestidaDeFerro(int ataque) {
	
		System.out.println(nome + " ativou a investida de ferro");
		
		return ataque += (rand.nextInt(6)+1);
		
	}


}
