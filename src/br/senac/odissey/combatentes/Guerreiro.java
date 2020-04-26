package br.senac.odissey.combatentes;

public abstract class Guerreiro extends Combatente {
	
	private boolean efeito = false;
	private int contador = 1;
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
	
	@Override
	public void recebeAtaque(int ataque) {
		if (vida < 21) {
			efeito = true;
		if (efeito == true && contador == 1) {
			ativarEquipamento();
			super.recebeAtaque(ataque);
		} 
		
		}else {
			super.recebeAtaque(ataque);
		}
	}

	
	// Metodo exclusivo para Guerreiro
	
	public void ativarEquipamento() {
		
		System.out.println(nome + " ativou o efeito especial dos Guerreiros!");
		
		 switch(equipamento){
         case "Espada":
             forca += 2;
             System.out.println("Sua força basica aumentou para: " + forca);
             break;
         case "Escudo":
             defesa += 2;
             System.out.println("Sua defesa basica aumentou para: " + defesa);
             break;
         case "Lança":
             forca += 1;
             defesa += 1;
             System.out.println("Sua força basica aumentou para: " + forca);
             System.out.println("Sua defesa basica aumentou para: " + defesa);
             break;
         case "Arco":
        	 System.out.println("Velocidade atual: " + velocidade);
             velocidade += 2; 
             System.out.println("Sua velocidade aumentou para: " + velocidade); 
             break;
		 }
		 
		 contador += 1;
		 
		
	}


}
