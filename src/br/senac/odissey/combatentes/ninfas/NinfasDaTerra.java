package br.senac.odissey.combatentes.ninfas;

import br.senac.odissey.combatentes.Ninfas;

public class NinfasDaTerra extends Ninfas{
	
	public NinfasDaTerra() {
		super("Epigéias - Ninfas da Terra", 30, 8, 7, 6, "Ambrósia");
	}
	

	public NinfasDaTerra(String nome, int vida, int forca, int defesa, int velocidade, String artefatos) {
		super(nome, vida, forca, defesa, velocidade, artefatos);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void recebeAtaque(int ataque) {
		
		if (ataque > velocidade) {
			int novo_ataque = ativarSementeSagrada(ataque);
			System.out.println("O ataque do inimigo foi reduzido para " + novo_ataque);	
			
			super.recebeAtaque(novo_ataque);
		} else {
			super.recebeAtaque(ataque);
		}
	}
	
	
	// Metodo exclusivo para Ninfa da Terra
	private int ativarSementeSagrada(int ataque) {
		
		System.out.println(nome + " ativou o efeito Semente Sagrada");
		return ataque -= (rand.nextInt(5)+1);
		
	}
	

}
