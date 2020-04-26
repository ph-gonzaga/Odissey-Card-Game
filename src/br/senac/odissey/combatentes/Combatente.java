package br.senac.odissey.combatentes;

import java.util.Random;

public abstract class Combatente {
	
	protected String nome;
	protected int vida;
	protected int forca;
	protected int defesa;
	protected int velocidade;
	public Random rand = new Random();
	
	public Combatente(String nome, int vida, int forca, int defesa, int velocidade) {
		this.nome = nome;
		this.vida = 30;
		this.forca = forca;
		this.defesa = defesa;
		this.velocidade = velocidade;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	
	public int getForca() {
		return forca;
	}
	public void setForca(int forca) {
		this.forca = forca;
	}
	
	public int getDefesa() {
		return defesa;
	}
	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}
	
	public int getVelocidade() {
		return velocidade;
	}
	
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	
	//Metodos Batalha
	
	public boolean estaMorto() {
		return this.vida == 0;
	}
	
	public boolean estaVivo() {
		return this.vida > 0;
	}
	
	public int ataque() {
		System.out.println(this.nome.toUpperCase());
		int ataque_total = (forca + rand.nextInt(15));
		//System.out.println("Ataque inicial:" + ataque_total);
		ataque_total = agilidade(ataque_total);
		return ataque_total;
	}
	

	public int atacar() {
		int ataque_total = ataque();
		System.out.println("Ataca com: " + ataque_total);
		System.out.println("///////----//////");
		return ataque_total;
	}
	
	
	public int defender() {
		int defesa_total = (defesa + rand.nextInt(10));
		System.out.println(this.nome + " defende com: " + defesa_total);
		return defesa_total;
	}
	
	public int agilidade(int ataque) {
		int velocidade_total = (velocidade + rand.nextInt(10));
		/* System.out.println("velocidade total: " + velocidade_total); */
		if (velocidade_total > ataque) {
			ataque += rand.nextInt(6);
			System.out.println("Ataque Critico!");
		}
		return ataque;
	}
	
	
	public void recebeAtaque(int ataque) {
		int defesa_total = defender();
		if (ataque < defesa_total) {
			System.out.println(this.nome + " possui defesa " + defesa_total + " o ataque foi bloqueado ");
<<<<<<< HEAD
		} else {
=======
		}else {
			ataque -= defesa_total;
>>>>>>> 1b04e0f4febd6c83ce695af1116a2a33d7e4ca49
			if (ataque > vida) {
				System.out.println(this.nome + " recebeu " + ataque + " dano ");
				System.out.println(this.nome + " foi derrotado(a)");
				vida = 0;
			} else {
			System.out.println(this.nome + " recebeu " + ataque + " dano ");
			vida -= ataque;
			}	
		}
	}
	
}
