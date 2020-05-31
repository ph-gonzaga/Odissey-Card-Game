package br.senac.odissey.combatentes.centauros;

import br.senac.odissey.combatentes.SeresMitologicos;

public class CentauroDaCachoeira extends SeresMitologicos {
	
	public CentauroDaCachoeira() {
		super("Centauro Da Cachoeira", 30, 7, 7, 7, "Concha das Ondas");
	}
	
	
	public CentauroDaCachoeira(String nome, int vida, int forca, int defesa, int velocidade, String artefatos) {
		super(nome, vida, forca, defesa, velocidade, artefatos);
		
	}
	
	@Override
	public int atacar() {
		int ataque_total = ataque();
		if (ataque_total == 8) {
			 ataque_total = ativarAfogamentoDramatico(ataque_total);
		}
		if (ataque_total == 10 || ataque_total == 13 ) {
			 ataque_total =  ativarPulsacaoDeAgua(ataque_total);
		}
		System.out.println("Ataca com: " + ataque_total);
		System.out.println("///////----//////");
		return ataque_total;
	}
	
	// Metodo exclusivo do Centauro da Cachoeira
	private int ativarAfogamentoDramatico(int valor) {
				
		System.out.println(nome + " ativou a habilidade secreto Afogamento Dramatico");
				
		return valor +=  30;	 
				
	}
	
	private int ativarPulsacaoDeAgua(int valor) {
		
		System.out.println(nome + " ativou a habilidade Pulsação de Agua");
				
		return valor += (rand.nextInt(6)+1);	 
				
	}
	


}
