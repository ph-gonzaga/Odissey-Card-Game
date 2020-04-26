package br.senac.odissey.combatentes.harpias;

import br.senac.odissey.combatentes.Harpia;

public class HarpiaGelo extends Harpia {
	
	public HarpiaGelo() {
		super("Harpia de Gelo", 100, 5, 6, 10);
	}
	

	public HarpiaGelo(String nome, int vida, int forca, int defesa, int velocidade) {
		super(nome, vida, forca, defesa, velocidade);
		
	}
	
	@Override
	public int defender() {
		int defesa_total = (defesa + rand.nextInt(10));
		System.out.println(this.nome + " defesa: " + defesa_total);
		if (defesa_total < 10) {
			int defesa_efeito = ativarVentoArtico(defesa_total);
			System.out.println(nome + " Sua defesa aumentou " + defesa_total + " para " + defesa_efeito);
			defesa_total = defesa_efeito;
		}
		System.out.println(this.nome + " defende com: " + defesa_total);
		return defesa_total;
	}
	
	
	public int ativarVentoArtico(int defesa) {
		
		defesa += 3;
		
		System.out.println(nome + " disparou o efeito Vento Artico");
		
		return defesa;
		 
		 
		
	}

}