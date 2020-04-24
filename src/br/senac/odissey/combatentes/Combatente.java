package br.senac.odissey.combatentes;

import java.util.Random;

public abstract class Combatente {
	protected Random rand = new Random();
	protected int vida;
	protected int forca;
	protected String nome;
	
	public Combatente() {
		this.nome = "teste" ;
		this.forca = 5 + rand.nextInt(50);
		this.vida = 50 + rand.nextInt(5);
	}


	public Combatente(String nome, int forcaMinima, int vidaMinima) {
		this.nome = nome;
		this.forca = forcaMinima + rand.nextInt(50);
		this.vida = vidaMinima + rand.nextInt(5);
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getVida() {
		return vida;
	}
	
	public int ataca() {
		return (int) (forca * rand.nextInt());
	}
	
	public void recebeAtaque(int forca, String tipo) {
		recebeAtaque(forca);
	}
	
	public void recebeAtaque(int forca) {
		if (forca > vida) {
			vida = 0;
		} else {
			vida -= forca;
		}
	}

}
