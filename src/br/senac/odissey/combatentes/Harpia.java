package br.senac.odissey.combatentes;

public class Harpia extends SeresMitologicos {
	
	boolean efeito = false;
	int contador = 1;

	public Harpia(String nome, int vida, int forca, int defesa, int velocidade, String artefatos) {
		super(nome, vida, forca, defesa, velocidade, artefatos);
		
	}
	
	@Override
	public void recebeAtaque(int ataque) {
		if (vida < 21) {
			efeito = true;
		if (efeito == true && contador == 1) {
			ativarFuracaoPenas();
			} 
		}
			super.recebeAtaque(ataque);
	}


	// Metodo exclusivo para todas as Harpias
	private void ativarFuracaoPenas() {
		
		System.out.println(nome + " ativou o efeito especial Furacao de Penas das Harpias!");
		
             forca += 1;
             System.out.println(nome + " teve sua força basica alterada para = " + forca);
             velocidade += 1; 
             System.out.println(nome + " teve sua velocidade basica alterada para = "+ velocidade); 
       
             contador += 3;
	}

}
