package br.senac.odissey.combatentes;

public class SeresMitologicos extends Combatente {
	
	protected String artefatos;
	private boolean efeito = false;
	private int contador = 1;


	public SeresMitologicos(String nome, int vida, int forca, int defesa, int velocidade, String artefatos) {
		super(nome, vida, forca, defesa, velocidade);
		this.artefatos = artefatos;
	}

	public String getEquipameto() {
		return artefatos;
	}

	public void setEquipamento(String artefatos) {
		this.artefatos = artefatos;
	}
	
	@Override
	public void recebeAtaque(int ataque) {
		if (vida == 10 || vida == 15 || vida == 20) {
			efeito = true;
			if (efeito == true && contador == 1) {
				ativarJoia();
				super.recebeAtaque(ataque);
			} 
		}
			super.recebeAtaque(ataque);
	}

	
	// Metodo exclusivo para os Seres Mistico
	private void ativarJoia() {
		
		System.out.println(nome + " ativou o efeito especial dos Seres Mitologicos!");
		
		 switch(artefatos){
         case "Dracma":
             forca = defesa + 2;
             defesa = forca + 2;
             velocidade -= 1;
             System.out.println(nome + " adquiriu o item raro Dracma de Ouro ");
             System.out.println("Sua força basica foi alterada para: " + forca);
             System.out.println("Sua defesa basica foi alterada para: " + defesa);
             System.out.println("Sua velocidade basica foi reduzida para: " + velocidade);
             break;
         case "Pena de Icarus":
        	 forca += 1;
             defesa += 2;
             System.out.println(nome + " adquiriu o item raro Pena de Icarus ");
             System.out.println("Sua força basica aumentou para: " + forca);
             System.out.println("Sua defesa basica aumentou para: " + defesa);
             break;
         case "Ambrósia":
             vida = 30;
             System.out.println(nome + " adquiriu o item raro Ambrósia (Comida dos Deuses) /n Sua energia foi restaurada: " + vida);
             break;
         case "Caixa de Pandora":
             velocidade += 1; 
             forca += 1;
             defesa += 1;
             System.out.println(nome + " adquiriu o item raro Caixa de Pandora");     
             System.out.println("Sua força basica aumentou para: " + forca);
             System.out.println("Sua defesa basica aumentou para: " + defesa);
             System.out.println("Sua velocidade basica aumentou para: " + velocidade); 
             break;
         case "Concha das Ondas":
             velocidade += 2; 
             forca += 1;
             System.out.println(nome + " adquiriu o item raro Concha das Ondas " + vida);
             System.out.println("Sua força basica aumentou para: " + forca);
             System.out.println("Sua velocidade basica aumentou para: " + velocidade); 
             break;
         case "Casco Dourado":
             velocidade += 1; 
             forca += 1;
             defesa += 1;
             System.out.println(nome + " adquiriu o item raro Casco Dourado da Floresta dos Centauros");     
             System.out.println("Sua força basica aumentou para: " + forca);
             System.out.println("Sua defesa basica aumentou para: " + defesa);
             System.out.println("Sua velocidade basica aumentou para: " + velocidade); 
             break;
		 }
		 
		 contador += 1;
		 
		
	}
 
}
