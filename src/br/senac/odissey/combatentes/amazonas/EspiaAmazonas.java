package br.senac.odissey.combatentes.amazonas;

import br.senac.odissey.combatentes.Amazona;

public class EspiaAmazonas extends Amazona {
	
	public EspiaAmazonas() {
		super("Arqueira Amazonas", 30, 6, 6, 9, "Punhal");
	}

	public EspiaAmazonas(String nome, int vida, int forca, int defesa, int velocidade, String equipamento) {
		super(nome, vida, forca, defesa, velocidade, equipamento);
		
	}
	
	public int agilidade(int ataque) {
		int velocidade_total = (velocidade + rand.nextInt(10));
		System.out.println("velocidade total: " + velocidade_total);
		if (velocidade_total > ataque) {
			ataque += rand.nextInt(6);;
			System.out.println("Ataque Critico");
		}else {
			ataque = ativarDistracao(ataque);
			System.out.println(nome + " Seu ataque foi alterado para " + ataque);
		}
		return ataque;
	}
	
	
	// Metodo exclusivo para Hercules

	private int ativarDistracao(int ataque) {
	
		System.out.println(nome + " ativa sua habilidade Distração");
		return ataque += rand.nextInt(6);
		
	}

}
