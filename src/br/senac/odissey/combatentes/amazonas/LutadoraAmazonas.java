package br.senac.odissey.combatentes.amazonas;

import br.senac.odissey.combatentes.Amazona;

public class LutadoraAmazonas  extends Amazona {
	
	public LutadoraAmazonas() {
		super("Lutadora Amazonas", 30, 9, 7, 5, "Arco");
	}
	

	public LutadoraAmazonas(String nome, int vida, int forca, int defesa, int velocidade, String equipamento) {
		super(nome, vida, forca, defesa, velocidade, equipamento);
		
	}
	
	@Override
	public int atacar() {
		int ataque_total = ataque();
		if (ataque_total < 13) {
			 ataque_total = ativarExplosaoDeEnergia(ataque_total);
		}
		System.out.println("Ataca com: " + ataque_total);
		System.out.println("///////----//////");
		return ataque_total;
	}

	
	@Override
	public int defender() {
		int defesa_total = (defesa + rand.nextInt(10));
		System.out.println(this.nome + " defesa: " + defesa_total);
		if (defesa_total == 9 || defesa_total == 12) {
			int defesa_efeito = ativarExplosaoDeEnergia(defesa_total);
			System.out.println(nome + " Sua defesa aumentou " + defesa_total + " para " + defesa_efeito);
			defesa_total = defesa_efeito;
		}
		System.out.println(this.nome + " defende com: " + defesa_total);
		return defesa_total;
	}
	
	
	
	// Metodo exclusivo para Lutadora Amazona
		private int ativarExplosaoDeEnergia(int valor) {
			
			System.out.println(nome + " ativou o bracelete de explosão de energia");
			
			return valor +=  rand.nextInt(5) ;	 
			
		}


}
