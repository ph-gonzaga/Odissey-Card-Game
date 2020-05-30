package br.senac.odissey.combatentes.centauros;

import br.senac.odissey.combatentes.SeresMitologicos;

public class CentauroGuardiao extends SeresMitologicos {
	
	public CentauroGuardiao() {
		super("Guardiao Centauro", 30, 6, 9, 6, "Casco Dourado");
	}
	
	
	public CentauroGuardiao(String nome, int vida, int forca, int defesa, int velocidade, String artefatos) {
		super(nome, vida, forca, defesa, velocidade, artefatos);
		
	}
	
	@Override
	public int atacar() {
		int ataque_total = ataque();
		if (ataque_total < 13) {
			 ataque_total = ativarChamadoDeGuerra(ataque_total);
		}
		System.out.println("Ataca com: " + ataque_total);
		System.out.println("///////----//////");
		return ataque_total;
	}
	
	// Metodo exclusivo do Guardiao Centauro
	private int ativarChamadoDeGuerra(int valor) {
				
		System.out.println(nome + " invocou o Chamado de Guerra");
				
		return valor +=  rand.nextInt(5) ;	 
				
	}


}
