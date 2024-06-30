package org.kingdom.animal;

public class Main {
	
	public static void faiVolare(Volante animale) {
		animale.vola();
	}
	
	public static void faiNuotare(Nuotante animale) {
		animale.nuota();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aquila aquila=new Aquila();
		System.out.println(aquila.dormi());
		System.out.println(aquila.mangia());
		System.out.println(aquila.verso());
		faiVolare(aquila);

	}

}
