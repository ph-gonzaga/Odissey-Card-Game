package br.senac.odissey.combatentes.herois;

import br.senac.odissey.combatentes.Guerreiro;

public class Hercules extends Guerreiro {
	
	public Hercules() {
		super("Hercules", 30, 9, 7, 5, "Espada");
	}

	public Hercules(String nome, int vida, int forca, int defesa, int velocidade, String equipamento) {
		super(nome, vida, forca, defesa, velocidade, equipamento);
	}

	public int agilidade(int ataque) {
		int velocidade_total = (velocidade + rand.nextInt(10));
		System.out.println("velocidade total: " + velocidade_total);
		if (velocidade_total > ataque) {
			ataque += rand.nextInt(6);;
			System.out.println("Ataque Critico");
		}else {
			ataque = ativarPunhoDeAco(ataque);
			System.out.println(nome + " Seu ataque foi alterado para " + ataque);
		}
		return ataque;
	}
	
	
	// Metodo exclusivo para Hercules

	
	public int ativarPunhoDeAco(int ataque) {
	
		System.out.println(nome + " ativa sua habilidade Punho de Aço!");
		return ataque += rand.nextInt(6);
		
	}
}
