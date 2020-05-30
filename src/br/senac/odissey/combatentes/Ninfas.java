package br.senac.odissey.combatentes;

public class Ninfas extends SeresMitologicos  {
	
	boolean efeito = false;
	int contador = 1;

	public Ninfas(String nome, int vida, int forca, int defesa, int velocidade, String artefatos) {
		super(nome, vida, forca, defesa, velocidade, artefatos);
		
	}
	
	@Override
	public void recebeAtaque(int ataque) {
		if (vida == 3 || vida == 14) {
			efeito = true;
		if (efeito == true && contador == 1) {
			ativarChamadoDaNatureza();
			} 
		}
			super.recebeAtaque(ataque);
	}


	// Metodo exclusivo para todas as Ninfas
	private void ativarChamadoDaNatureza() {
		
		System.out.println(nome + " ativou o efeito especial Elementos da Natureza");
		
             vida += 10;
             System.out.println(nome + " teve sua restaurada para = " + vida);
       
             contador += 3;
	}


}
