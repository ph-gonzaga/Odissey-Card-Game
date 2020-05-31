package br.senac.odissey.combatentes.amazonas;

import br.senac.odissey.combatentes.Amazona;

public class ArqueiraAmazonas extends Amazona {
	
	public ArqueiraAmazonas() {
		super("Arqueira Amazonas", 30, 8, 5, 8, "Arco");
	}
	
	public ArqueiraAmazonas(String nome, int vida, int forca, int defesa, int velocidade, String equipamento) {
		super(nome, vida, forca, defesa, velocidade, equipamento);
	}
	
	@Override
	public int defender() {
		int defesa_total = (defesa + (rand.nextInt(10)+1));
		System.out.println(this.nome + " defesa: " + defesa_total);
		if (defesa_total < 11) {
			int defesa_efeito = ativarFlechaEnvenenada(defesa_total);
			System.out.println(nome + " Sua defesa aumentou " + defesa_total + " para " + defesa_efeito);
			defesa_total = defesa_efeito;
		}
		System.out.println(this.nome + " defende com: " + defesa_total);
		return defesa_total;
	}
	
	
	// Metodo exclusivo para Arqueira Amazonas
	private int ativarFlechaEnvenenada(int defesa_total) {
	
		defesa_total += 3;
		
		System.out.println(nome + " disparou uma flexa envenenada");
		
		return defesa_total;
		 
		
	}

}
