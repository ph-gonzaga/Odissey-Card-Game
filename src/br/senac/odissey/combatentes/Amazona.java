package br.senac.odissey.combatentes;


public abstract class Amazona extends Combatente{

	public Amazona() {
		super("Amazona", 5, 10);
	}
	
	public Amazona(String nome) {
		super(nome, 5, 10);
	}
	
	@Override
	public void recebeAtaque(int forca) {
		if (desviaAtaque()) {
			System.out.println(this.nome + " desviou do ataque.");
		} else {
			super.recebeAtaque(forca);
		}
	}
	
	
	private boolean desviaAtaque() {
		return rand.nextInt(10) == 1;
	}

}
