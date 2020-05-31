package br.senac.odissey.combatentes.centauros;

import br.senac.odissey.combatentes.SeresMitologicos;

public class CentauroArqueiro extends SeresMitologicos {
	
	public CentauroArqueiro() {
		super("Centauro Arqueiro", 30, 6, 7, 8, "Casco Dourado");
	}
	
	
	public CentauroArqueiro(String nome, int vida, int forca, int defesa, int velocidade, String artefatos) {
		super(nome, vida, forca, defesa, velocidade, artefatos);
		
	}

	@Override
	public void recebeAtaque(int ataque) {
		if (vida <= 10) {
			int novo_ataque = ativarFlechaParalisante(ataque);
			System.out.println("O ataque do inimigo foi reduzido para " + novo_ataque);	
			
			super.recebeAtaque(novo_ataque);
		} else {
			super.recebeAtaque(ataque);
		}

	}
	
	// Metodo exclusivo para o Centauro Arqueiro
	private int ativarFlechaParalisante(int ataque) {
			
		System.out.println(nome + " ativou a Flecha Paralisante");
		return ataque -= (rand.nextInt(5)+1);
			
		}

}
