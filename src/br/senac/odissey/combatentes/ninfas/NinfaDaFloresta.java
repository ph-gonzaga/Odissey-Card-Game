package br.senac.odissey.combatentes.ninfas;

import br.senac.odissey.combatentes.Ninfas;

public class NinfaDaFloresta extends Ninfas{
	
	
	public NinfaDaFloresta() {
		super("Dríades - Ninfas da floresta", 30, 7, 7, 7, "Caixa de Pandora");
	}
	

	public NinfaDaFloresta(String nome, int vida, int forca, int defesa, int velocidade, String artefatos) {
		super(nome, vida, forca, defesa, velocidade, artefatos);
		
	}
	
	@Override
	public int defender() {
		int defesa_total = (defesa + rand.nextInt(10));
		System.out.println(this.nome + " defesa: " + defesa_total);
		if (defesa_total == 10 || defesa_total == 8 ) {
			int defesa_efeito = ativarCamuflagem(defesa_total);
			System.out.println(nome + " Sua defesa aumentou " + defesa_total + " para " + defesa_efeito);
			defesa_total = defesa_efeito;
		}
		System.out.println(this.nome + " defende com: " + defesa_total);
		return defesa_total;
	}
	
	// Metodo exclusivo para Ninfa da Floresta
	private int ativarCamuflagem(int defesa) {
		
		defesa += 5;
		
		System.out.println(nome + " ativou o efeito de Camuflagem");
		
		return defesa;
		 
		
	}

}
