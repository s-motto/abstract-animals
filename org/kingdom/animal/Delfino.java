package org.kingdom.animal;

public class Delfino extends Animale implements Nuotante{
	
	@Override
	public String verso() {
		return "Eeeek";
	}
	@Override
	public String mangia() {
		return "Il delfino è carnivoro";
	}

	public void nuota() {
		System.out.println("Sto nuotando!");
	}
	}

