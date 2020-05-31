package br.senac.odissey.combatentes;

import java.util.Random;

public interface Curandeiro {
	
	public Random num = new Random();
	
	default int curar() {
		
		return 5;
			 
	}
	
	default int curaOceanica() {
		
		return (num.nextInt(6)+1);
			 
	}

}
