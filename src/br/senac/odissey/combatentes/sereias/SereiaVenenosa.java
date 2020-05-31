package br.senac.odissey.combatentes.sereias;

import br.senac.odissey.combatentes.Sereia;

public class SereiaVenenosa extends Sereia {

	protected boolean veneno = false;
	
	
	public SereiaVenenosa() {
		super("Sereia Venenosa", 30, 7, 8, 6, "Concha das Ondas");
	}
	
	public SereiaVenenosa(String nome, int vida, int forca, int defesa, int velocidade, String artefatos) {
		super(nome, vida, forca, defesa, velocidade, artefatos);
	}
	
	@Override
	public int atacar() {
		int ataque_total = ataque();
		if (ataque_total == 12 || ataque_total == 15 ) {
			 ataque_total = ativarMordidaVenenosa(ataque_total);
		}
		
		if (ataque_total < 12) {
			 veneno = true ;
		}
		System.out.println("Ataca com: " + ataque_total);
		System.out.println("///////----//////");
		return ataque_total;
	}
	
	
	@Override
	public void recebeAtaque(int ataque) {
		if (veneno == true) {
			ativarAlgaVenenosa();
			veneno = false;
			super.recebeAtaque(ataque);
		} else {
			super.recebeAtaque(ataque);
		}
	}

	
	// Metodos exclusivos para Sereia Venenosa

	private int ativarMordidaVenenosa(int ataque) {
	
		int ataque_total = ataque + 3;
		
		System.out.println(nome + " ativou a Mordida Acida");
		System.out.println(nome + " teve o ataque alterado para " + ataque_total);
		
		return ataque_total;
		
	}

	private void ativarAlgaVenenosa() {
		
		vida -= 2;
		
		System.out.println(nome + " caiu na Alga Venenosa");
		System.out.println(nome + " teve a vida reduzida para " + vida);
		
	}
	
}
