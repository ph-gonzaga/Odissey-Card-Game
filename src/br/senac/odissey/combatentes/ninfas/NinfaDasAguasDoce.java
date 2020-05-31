package br.senac.odissey.combatentes.ninfas;

import br.senac.odissey.combatentes.Curandeiro;
import br.senac.odissey.combatentes.Ninfas;

public class NinfaDasAguasDoce extends Ninfas implements Curandeiro {
	
	public NinfaDasAguasDoce() {
		super("Naiade - Ninfa das Águas Doces", 30, 6, 9, 6, "Concha das Ondas");
	}
	
	public NinfaDasAguasDoce(String nome, int vida, int forca, int defesa, int velocidade, String artefatos) {
		super(nome, vida, forca, defesa, velocidade, artefatos);
		
	}
	
	@Override
	public void recebeAtaque(int ataque) {
		if (vida == 5 || vida == 25) {
			vida += curar();
			System.out.println(nome + " ativa o efeito de agua celestial");
			System.out.println(nome + " seu energia foi restaurada para " + vida);
			super.recebeAtaque(ataque);
		} else {
			super.recebeAtaque(ataque);
		}
		 	ativarPuricacaoDaAgua();
	}
	
	
	//Metodo exclusivo da Ninfa das Aguas Doces
			private void ativarPuricacaoDaAgua() {
			
			vida += 1;
			
			System.out.println(nome + " utiliza o efeito de purificação da agua");
			System.out.println(nome + " teve sua vida alterada para " + vida);
			
		}

}
