package br.senac.odissey.combatentes;


public abstract class Amazona extends Guerreiro{

	public Amazona(String nome, int vida, int forca, int defesa, int velocidade, String equipamento) {
		super(nome, vida, forca, defesa, velocidade, equipamento);
	}
	
	
	
	@Override
	public void recebeAtaque(int ataque) {
		if (ataque == 13 || ataque == 18) {
			int novo_ataque = ativarEmboscadaAmazonas(ataque);
			System.out.println("Ataque do adversario reduzido a 50% = " + novo_ataque);
			super.recebeAtaque(novo_ataque);
		} else {
			super.recebeAtaque(ataque);
		}
	}

	// Metodo exclusivo para todas Amazonas
	private int ativarEmboscadaAmazonas(int ataque) {
	
		System.out.println(nome + " ativou a emboscada da Amazonas!");
		return ataque = ataque / 2;
		
	}

}
