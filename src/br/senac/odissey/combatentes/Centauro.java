package br.senac.odissey.combatentes;

public class Centauro extends SeresMitologicos {

	public Centauro(String nome, int vida, int forca, int defesa, int velocidade, String artefatos) {
		super(nome, vida, forca, defesa, velocidade, artefatos);
	}
	
	@Override
	public void recebeAtaque(int ataque) {
		if (ataque == 12 || ataque == 17) {
			int novo_ataque = ativarTerrenoDeCaçaDosCentauros(ataque);
			System.out.println("Ataque do adversario reduzido a = " + novo_ataque);
			super.recebeAtaque(novo_ataque);
		} else {
			super.recebeAtaque(ataque);
		}
	}

	// Metodo exclusivo para todos os Centauros
	private int ativarTerrenoDeCaçaDosCentauros(int ataque) {
	
		System.out.println(nome + " ativou o efeito especial dos Centauros");
		return ataque -= rand.nextInt(5) ;
		
	}


}
