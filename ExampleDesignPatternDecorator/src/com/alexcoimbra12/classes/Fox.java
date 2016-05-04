package com.alexcoimbra12.classes;

import com.alexcoimbra12.interfaces.Fabrica;

public class Fox implements Fabrica {

	@Override
	public void farol(String message) {

		System.out.println("Adicionando farois comuns ao " + message);

	}

}
