package br.senac.odissey.combatentes.harpias;

import br.senac.odissey.combatentes.Curandeiro;
import br.senac.odissey.combatentes.Harpia;

public class HarpiaPsiquica extends Harpia implements Curandeiro  {
	
	public HarpiaPsiquica() {
		super("Harpia Fantasma", 100, 6, 8, 7);
	}
	

	public HarpiaPsiquica(String nome, int vida, int forca, int defesa, int velocidade) {
		super(nome, vida, forca, defesa, velocidade);
	}

	@Override
	public void recebeAtaque(int ataque) {
		if (vida == 5 || vida == 10 || vida == 15) {
			vida += curar();
			System.out.println(nome + " ativou o efeito de cura");
			System.out.println(nome + " seu energia foi restaurada para " + vida);	
		} 
		
		if (ataque > velocidade) {
			ataque = ativarMaldicaoMistica(ataque);
			System.out.println(" o ataque do inimigo foi reduzido para " + ataque);	
		}
		
		super.recebeAtaque(ataque);
	}
	
	
	public int ativarMaldicaoMistica(int ataque) {
		
		System.out.println(nome + " ativou o efeito Maldição Mistica");
		return ataque -= 2 ;
		
	}

}
