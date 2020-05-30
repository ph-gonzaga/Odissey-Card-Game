package br.senac.odissey.combatentes;

public class Sereia extends SeresMitologicos implements Curandeiro {

	public Sereia(String nome, int vida, int forca, int defesa, int velocidade, String artefatos) {
		super(nome, vida, forca, defesa, velocidade, artefatos);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public void recebeAtaque(int ataque) {
		if (vida == 8 || vida == 15 || vida == 20) {
			vida += curaOceanica();
			System.out.println(nome + " ativou o efeito de cura");
			System.out.println(nome + " seu energia foi restaurada para " + vida);
			super.recebeAtaque(ataque);
		} else {
			super.recebeAtaque(ataque);
		}
	}

}
