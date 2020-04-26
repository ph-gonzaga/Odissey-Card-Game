package br.senac.odissey.combatentes;

public class Heroi extends Guerreiro {

	public Heroi(String nome, int vida, int forca, int defesa, int velocidade, String equipamento) {
		super(nome, vida, forca, defesa, velocidade, equipamento);
	}
	
	@Override
	public void recebeAtaque(int ataque) {
		if (ataque == 14 || ataque == 20) {
			ativarInvestidaFerro();
		} 
		
		super.recebeAtaque(ataque);
	}
	
	// Metodo exclusivo para todos os Heroi
	
	public void ativarInvestidaFerro() {
	
		System.out.println(nome + " ativou a investida de ferro!");
		velocidade += 1;
		System.out.println(nome + " teve sua velocidade basica alterada para = " + velocidade);
	}
	

}
