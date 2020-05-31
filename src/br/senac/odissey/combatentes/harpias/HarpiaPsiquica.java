package br.senac.odissey.combatentes.harpias;

import br.senac.odissey.combatentes.Curandeiro;
import br.senac.odissey.combatentes.Harpia;

public class HarpiaPsiquica extends Harpia implements Curandeiro  {
	
	public HarpiaPsiquica() {
		super("Harpia Psiquica", 30, 6, 8, 7, "Pena de Icarus");
	}
	

	public HarpiaPsiquica(String nome, int vida, int forca, int defesa, int velocidade, String artefatos) {
		super(nome, vida, forca, defesa, velocidade, artefatos);
	}

	@Override
	public void recebeAtaque(int ataque) {
		if (vida == 5 || vida == 10 || vida == 15) {
			vida += curar();
			System.out.println(nome + " ativou o efeito de cura");
			System.out.println(nome + " seu energia foi restaurada para " + vida);	
		} 
		
		if (ataque > velocidade) {
			int novo_ataque = ativarMaldicaoMistica(ataque);
			System.out.println("O ataque do inimigo foi reduzido para " + novo_ataque );	
			
			super.recebeAtaque(novo_ataque);			
		} else {
			super.recebeAtaque(ataque);			
		}
		
	}
	
	
	// Metodo exclusivo para Harpia Psiquica
	private int ativarMaldicaoMistica(int ataque) {
		
		System.out.println(nome + " ativou o efeito Maldição Mistica");
		return ataque -= 2 ;
		
	}

}
