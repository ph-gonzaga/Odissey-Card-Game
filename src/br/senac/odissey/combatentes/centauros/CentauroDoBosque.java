package br.senac.odissey.combatentes.centauros;

import br.senac.odissey.combatentes.SeresMitologicos;

public class CentauroDoBosque extends SeresMitologicos {
	
	public CentauroDoBosque() {
		super("Centauro Do Bosque", 30, 8, 5, 8, "Casco Dourado");
	}
	
	
	public CentauroDoBosque(String nome, int vida, int forca, int defesa, int velocidade, String artefatos) {
		super(nome, vida, forca, defesa, velocidade, artefatos);
		
	}
	
	@Override
	public int defender() {
		int defesa_total = (defesa + rand.nextInt(10));
		System.out.println(this.nome + " defesa: " + defesa_total);
		if (defesa_total < 10) {
			int defesa_efeito =  ativarProtecaoDaFloresta(defesa_total);
			System.out.println(nome + " Sua defesa aumentou " + defesa_total + " para " + defesa_efeito);
			defesa_total = defesa_efeito;
		}
		System.out.println(this.nome + " defende com: " + defesa_total);
		return defesa_total;
	}
	
	
	// Metodo exclusivo para Centauro do Bosque
	private int ativarProtecaoDaFloresta(int defesa) {
		
		System.out.println(nome + " ativou o efeito Protecao da Floresta");
		return defesa -= rand.nextInt(5);
		
	}


}
