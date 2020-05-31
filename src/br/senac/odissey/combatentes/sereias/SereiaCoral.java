package br.senac.odissey.combatentes.sereias;

import br.senac.odissey.combatentes.Sereia;

public class SereiaCoral extends Sereia {

	
	public SereiaCoral() {
		super("Sereia dos Corais", 30, 5, 6, 10, "Concha das Ondas");
	}
	
	public SereiaCoral(String nome, int vida, int forca, int defesa, int velocidade, String artefatos) {
		super(nome, vida, forca, defesa, velocidade, artefatos);
	}

	@Override
	public int atacar() {
		int ataque_total = ataque();
		if (ataque_total < 12) {
			 ataque_total = ativarCancaoDaSereia(ataque_total);
		}
		System.out.println("Ataca com: " + ataque_total);
		System.out.println("///////----//////");
		return ataque_total;
	}
	
	// Metodo exclusivo para Sereia Coral
	private int ativarCancaoDaSereia(int ataque) {
		
		int ataque_total = ataque + (rand.nextInt(5)+1);
		
		System.out.println(nome + " ativou a canção da sereia");
		System.out.println(nome + " teve o ataque alterado para " + ataque_total);
		
		return ataque_total;
		 
		
	}
	
	

}
