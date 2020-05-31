package br.senac.odissey.combatentes.ninfas;

import br.senac.odissey.combatentes.Ninfas;

public class NinfaDasMontanhas extends Ninfas {
	
	public NinfaDasMontanhas() {
		super("Oreádes - Ninfas das montanhas", 30, 8, 8, 5, "Pena de Icarus");
	}

	public NinfaDasMontanhas(String nome, int vida, int forca, int defesa, int velocidade, String artefatos) {
		super(nome, vida, forca, defesa, velocidade, artefatos);
		
	}
	
	
	@Override
	public int atacar() {
		int ataque_total = ataque();
		if (ataque_total < 10) {
			 ataque_total = ativarElementoSurpresa(ataque_total);
		}
		System.out.println("Ataca com: " + ataque_total);
		System.out.println("///////----//////");
		return ataque_total;
	}
	
	// Metodo exclusivo para Ninfa da Montanha
	private int ativarElementoSurpresa(int ataque) {
		
		int ataque_total = ataque + (rand.nextInt(5)+1);
		
		System.out.println(nome + " ativou o elemento surpresa");
		System.out.println(nome + " teve o ataque alterado para " + ataque_total);
		
		return ataque_total;
		 
		
	}
	


}
