package br.senac.odissey.combatentes.herois;

import br.senac.odissey.combatentes.Guerreiro;

public class Odisseu extends Guerreiro {
	
	public Odisseu() {
		super("Odisseu", 30, 7, 7, 7, "Lança");
	}

	public Odisseu(String nome, int vida, int forca, int defesa, int velocidade, String equipamento) {
		super(nome, vida, forca, defesa, velocidade, equipamento);
	}
	
	@Override
	public void recebeAtaque(int ataque) {
		
		if (ataque > velocidade) {
			ataque = ativarCavaloDeTroia(ataque);
			System.out.println("O ataque do inimigo foi reduzido para " + ataque);	
		}
		
		super.recebeAtaque(ataque);
	}
	
	
	// Metodo exclusivo para Odisseu
	private int ativarCavaloDeTroia(int ataque) {
		
		System.out.println(nome + " ativou o efeito Cavalo de Troia");
		return ataque -= rand.nextInt(5) ;
		
	}
	
}
