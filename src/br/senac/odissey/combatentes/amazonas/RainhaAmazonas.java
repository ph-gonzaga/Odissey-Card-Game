package br.senac.odissey.combatentes.amazonas;

import br.senac.odissey.combatentes.Amazona;

public class RainhaAmazonas extends Amazona {

	public RainhaAmazonas() {
		super("Rainha Amazonas", 30, 7, 9, 5, "Lança");
	}
	
	public RainhaAmazonas(String nome, int vida, int forca, int defesa, int velocidade, String equipamento) {
		super(nome, vida, forca, defesa, velocidade, equipamento);
	}

	@Override
	public int atacar() {
		int ataque_total = ataque();
		if (ataque_total < 10) {
			 ataque_total = ativarCinturaoHipolita(ataque_total);
		}
		System.out.println("Ataca com: " + ataque_total);
		System.out.println("///////----//////");
		return ataque_total;
	}

	
	
	// Metodo exclusivo para Rainha Amazona
	private int ativarCinturaoHipolita(int ataque) {
	
		int ataque_total = ataque + 3;
		
		System.out.println(nome + " ativou o efeito Cinturao de Hipolita!");
		System.out.println(nome + " teve o ataque alterado para " + ataque_total);
		
		return ataque_total;
		 
		
	}
}
