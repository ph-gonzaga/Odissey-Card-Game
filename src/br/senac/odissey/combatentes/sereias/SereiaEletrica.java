package br.senac.odissey.combatentes.sereias;

import br.senac.odissey.combatentes.Sereia;

public class SereiaEletrica extends Sereia {

	
	public SereiaEletrica() {
		super("Sereia Electra", 30, 9, 5, 7, "Dracma");
	}
	
	public SereiaEletrica(String nome, int vida, int forca, int defesa, int velocidade, String artefatos) {
		super(nome, vida, forca, defesa, velocidade, artefatos);
	}

	@Override
	public int defender() {
		int defesa_total = (defesa + rand.nextInt(8));
		System.out.println(this.nome + " defesa: " + defesa_total);
		if (defesa_total == 7 || defesa_total == 10 || defesa_total == 12) {
			int defesa_efeito = ativareEscudoOceanico(defesa_total);
			System.out.println(nome + " Sua defesa aumentou " + defesa_total + " para " + defesa_efeito);
			defesa_total = defesa_efeito;
		}
		System.out.println(this.nome + " defende com: " + defesa_total);
		return defesa_total;
	}
	
	
	// Metodo exclusivo para Sereia Eletrica
	private int ativareEscudoOceanico(int defesa) {
		
		System.out.println(nome + " ativa o escudo oceanico!");
		return defesa += rand.nextInt(6);
		
	}

}
