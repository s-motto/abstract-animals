package org.kingdom.animal;

public class Cane extends Animale implements Nuotante{

	@Override
	public String verso() {
		return "Bau bau";
	}
	@Override
	public String mangia() {
		return "Il cane è principalmente carnivoro";
	}
	
	public void nuota() {
		System.out.println("Sto nuotando!");
	}
}
