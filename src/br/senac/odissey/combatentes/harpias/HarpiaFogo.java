package br.senac.odissey.combatentes.harpias;

import br.senac.odissey.combatentes.Harpia;

public class HarpiaFogo extends Harpia {
	
	public HarpiaFogo() {
		super("Harpia de Fogo", 30, 8, 6, 7, "Pena de Icarus");
	}
	

	public HarpiaFogo(String nome, int vida, int forca, int defesa, int velocidade, String artefatos) {
		super(nome, vida, forca, defesa, velocidade, artefatos);
	}

	@Override
	public int defender() {
		int defesa_total = (defesa + (rand.nextInt(10)+1));
		System.out.println(this.nome + " defesa: " + defesa_total);
		if (defesa_total < 10) {
			int defesa_efeito =  ativarPenaFenix(defesa_total);
			System.out.println(nome + " Sua defesa aumentou " + defesa_total + " para " + defesa_efeito);
			defesa_total = defesa_efeito;
		}
		System.out.println(this.nome + " defende com: " + defesa_total);
		return defesa_total;
	}
	
	
	// Metodo exclusivo para Harpia Fogo
	private int ativarPenaFenix(int defesa) {
		
		System.out.println(nome + " ativou o efeito Pena da Fenix");
		return defesa -= rand.nextInt(5);
		
	}

}
