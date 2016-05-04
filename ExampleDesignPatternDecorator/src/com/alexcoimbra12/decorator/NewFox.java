package com.alexcoimbra12.decorator;

public class NewFox extends NewFarol {

	@Override
	public void farol(String message) {

		System.out.println("Adicionando Farol de Neon");
		System.out.println(this.farolNeon() + " ao " + message);

	}

	public String farolNeon() {
		String neonSuccess = "Farol de Neon Adicionado com Sucesso";
		return neonSuccess;
	}

}
