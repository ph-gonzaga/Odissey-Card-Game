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
		this.vida = 100;
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
	
	

	public int atacar() {
		System.out.println(this.nome + " possui força " + forca);
		System.out.println(this.nome + " possui velocidade " + velocidade);
		int ataque_total = (forca + rand.nextInt(10));
		System.out.println(ataque_total);
		ataque_total = agilidade(ataque_total);
		System.out.println(this.nome + " ataca com força " + ataque_total);
		return ataque_total;
	}
	
	public int defender() {
		int defesa_total = (defesa + rand.nextInt(15));
		System.out.println(this.nome + " defende com " + defesa_total);
		return defesa_total;
	}
	
	public int agilidade(int ataque) {
		int velocidade_total = (velocidade + rand.nextInt(10));
		System.out.println(velocidade_total);
		if (velocidade_total > ataque) {
			System.out.println("Ataque Critico");
		}
		return ataque;
		
	}
	
	
	public void recebeAtaque(int ataque) {
		defesa = defender();
		if (ataque < defesa) {
			System.out.println(this.nome + " possui defesa " + defesa + " o ataque foi bloqueado ");
		}else {
			if (ataque > vida) {
				System.out.println(this.nome + " recebeu " + ataque + " dano ");
				System.out.println(this.nome + " foi derrotado(a)");
				vida = 0;
			} else {
			ataque -= defesa;
			System.out.println(this.nome + " recebeu " + ataque + " dano ");
			vida -= ataque;
			}	
		}
	}
	
}
