package com.alexcoimbra12.main;

import com.alexcoimbra12.classes.Fox;
import com.alexcoimbra12.decorator.NewFox;
import com.alexcoimbra12.interfaces.Fabrica;

public class FabricaMain {

	public static void main(String[] args) {

		Fabrica fabrica1 = new NewFox();
		fabrica1.farol("New Fox");

		Fabrica fabrica2 = new Fox();
		fabrica2.farol("Fox");
	}
}
