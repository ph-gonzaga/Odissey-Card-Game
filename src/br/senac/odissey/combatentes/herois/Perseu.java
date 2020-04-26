package br.senac.odissey.combatentes.herois;

import br.senac.odissey.combatentes.Guerreiro;

public class Perseu extends Guerreiro {
	
	public Perseu() {
		super("Perseu", 30, 5, 6, 10, "Escudo");
	}

	public Perseu(String nome, int vida, int forca, int defesa, int velocidade, String equipamento) {
		super(nome, vida, forca, defesa, velocidade, equipamento);
	}
	
	
	@Override
	public int defender() {
		int defesa_total = (defesa + rand.nextInt(8));
		System.out.println(this.nome + " defesa: " + defesa_total);
		if (defesa_total < 9) {
			int defesa_efeito = ativarDefesaAntiGorgona(defesa_total);
			System.out.println(nome + " Sua defesa aumentou " + defesa_total + " para " + defesa_efeito);
			defesa_total = defesa_efeito;
		}
		System.out.println(this.nome + " defende com: " + defesa_total);
		return defesa_total;
	}
	
	
	public int ativarDefesaAntiGorgona(int defesa) {
		
		System.out.println(nome + " ativa sua habilidade Escudo Anti Gorgonas!");
		return defesa += rand.nextInt(6);
		
	}

}
