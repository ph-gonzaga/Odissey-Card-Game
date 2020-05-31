package br.senac.odissey.combatentes.sereias;

import br.senac.odissey.combatentes.Sereia;

public class SereiaRainha extends Sereia {

	
	public SereiaRainha() {
		super("Atlanta - Sereia Rainha", 30, 8, 8, 5, "Ambrósia");
	}
	
	public SereiaRainha(String nome, int vida, int forca, int defesa, int velocidade, String artefatos) {
		super(nome, vida, forca, defesa, velocidade, artefatos);
	}
	
	@Override
	public int agilidade(int ataque) {
		int velocidade_total = (velocidade + (rand.nextInt(10)+1));
		System.out.println("velocidade total: " + velocidade_total);
		if (velocidade_total > ataque) {
			ataque += rand.nextInt(6)+1;
			System.out.println("Ataque Critico");
		}else {
			ataque = ativarTempestade(ataque);
			System.out.println(nome + " Seu ataque foi alterado para " + ataque);
		}
		return ataque;
	}
	
	
	// Metodo exclusivo para Rainha Sereia

	private int ativarTempestade(int ataque) {
	
		System.out.println(nome + " ativa a habilidade Tempestade oceanica");
		return ataque += (rand.nextInt(6)+1);
		
	}
}



