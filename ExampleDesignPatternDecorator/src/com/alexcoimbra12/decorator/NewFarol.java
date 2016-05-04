package com.alexcoimbra12.decorator;

import com.alexcoimbra12.interfaces.Fabrica;

public abstract class NewFarol implements Fabrica{
	
	@Override
	public abstract void farol (String message);
}
