package org.kingdom.animal;

public class Passerotto extends Animale implements Volante{
	
	@Override
	public String verso() {
		return "Cip cip";
	}
	@Override
	public String mangia() {
		return "Il passerotto è granivoro";
	}
	
	public void vola() {
		System.out.println("Sto volando!");
	}
}
