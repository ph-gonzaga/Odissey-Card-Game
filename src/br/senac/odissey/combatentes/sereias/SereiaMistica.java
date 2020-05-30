package br.senac.odissey.combatentes.sereias;

import br.senac.odissey.combatentes.Sereia;

public class SereiaMistica extends Sereia {

	
	public SereiaMistica() {
		super("Sereia Mística", 30, 6, 8, 7, "Caixa de Pandora");
	}
	
	public SereiaMistica(String nome, int vida, int forca, int defesa, int velocidade, String artefatos) {
		super(nome, vida, forca, defesa, velocidade, artefatos);
	}

	@Override
	public int defender() {
		int defesa_total = (defesa + rand.nextInt(10));
		System.out.println(this.nome + " defesa: " + defesa_total);
		if (defesa_total == 10 || defesa_total == 13 || defesa_total == 15) {
			int defesa_efeito =  ativarPetrificar(defesa_total);
			System.out.println(nome + " Sua defesa aumentou " + defesa_total + " para " + defesa_efeito);
			defesa_total = defesa_efeito;
		}
		System.out.println(this.nome + " defende com: " + defesa_total);
		return defesa_total;
	}

	// Metodo exclusivo para Sereia Mistica
	private int ativarPetrificar(int defesa) {
		
		System.out.println(nome + " ativou o efeito petrificação");
		return defesa += rand.nextInt(5);
	}
}
