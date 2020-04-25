package br.senac.odissey.combatentes;

public abstract class Guerreiro extends Combatente {
	
	protected String equipamento;

	public Guerreiro(String nome, int vida, int forca, int defesa, int velocidade, String equipamento) {
		super(nome, vida, forca, defesa, velocidade);
		this.equipamento = equipamento;
	}

	public String getEquipameto() {
		return equipamento;
	}

	public void setEquipamento(String equipamento) {
		this.equipamento = equipamento;
	}

}
