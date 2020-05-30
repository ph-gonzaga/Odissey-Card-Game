package br.senac.odissey.combatentes.centauros;

import br.senac.odissey.combatentes.SeresMitologicos;

public class CentauroRei extends SeresMitologicos {
	
	public CentauroRei() {
		super("Rei dos Centauros", 30, 10, 6, 5, "Casco Dourado");
	}
	
	public CentauroRei(String nome, int vida, int forca, int defesa, int velocidade, String artefatos) {
		super(nome, vida, forca, defesa, velocidade, artefatos);
		
	}
	
	@Override
	public int agilidade(int ataque) {
		int velocidade_total = (velocidade + rand.nextInt(10));
		System.out.println("velocidade total: " + velocidade_total);
		if (velocidade_total > ataque) {
			ataque += rand.nextInt(6);;
			System.out.println("Ataque Critico");
		}else {
			ataque = ativarTropaCentauro(ataque);
			System.out.println(nome + " Seu ataque foi alterado para " + ataque);
		}
		return ataque;
	}
	
	
	// Metodo exclusivo para Hercules

	private int ativarTropaCentauro(int ataque) {
	
		System.out.println(nome + " invoca sua tropa de Centauros");
		return ataque += rand.nextInt(6);
		
	}


}
