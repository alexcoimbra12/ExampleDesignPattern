package com.alexcoimbra12.main;

import com.alexcoimbra12.bridge.classes.GeradorArquivoTxt;
import com.alexcoimbra12.classes.Recibo;

public class TesteRecibo {

	public static void main(String[] args) {
		
		GeradorArquivoTxt arquivoTxt = new GeradorArquivoTxt();
		Recibo reciboAbril = new Recibo("XPTO", "Alex", 50.00, arquivoTxt);
		reciboAbril.geraArquivo();

	}

}
