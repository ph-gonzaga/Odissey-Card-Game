package br.senac.odissey.combatentes;

public class Harpia extends Combatente {
	
	boolean efeito = false;
	int contador = 1;

	public Harpia(String nome, int vida, int forca, int defesa, int velocidade) {
		super(nome, vida, forca, defesa, velocidade);
		
	}
	
	@Override
	public void recebeAtaque(int ataque) {
		if (vida < 21) {
			efeito = true;
		if (efeito == true && contador == 1) {
			ativarFuracaoPenas();
			super.recebeAtaque(ataque);
		} 
		
		}else {
			super.recebeAtaque(ataque);
		}
	}


	// Metodo exclusivo para todas as Harpias
	
	public void ativarFuracaoPenas() {
		
		System.out.println(nome + " ativou o efeito especial Furacao de Penas das Harpias!");
		
             forca += 1;
             System.out.println(nome + " teve sua força basica alterada para = " + forca);
             velocidade += 1; 
             System.out.println(nome + " teve sua velocidade basica alterada para = "+ velocidade); 
       
             contador += 1;
	}

}
