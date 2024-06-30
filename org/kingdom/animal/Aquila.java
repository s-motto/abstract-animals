package org.kingdom.animal;

public class Aquila extends Animale implements Volante{
	
	@Override
	public String verso() {
		return "Screeech";
	}
	@Override
	public String mangia() {
		return "L'aquila è carnivora";
	}

	public void vola() {
		System.out.println("Sto volando!");
	}
	
}
