package com.alexcoimbra12.bridge.classes;

import java.io.FileNotFoundException;
import java.io.PrintStream;

import com.alexcoimbra12.bridge.interfaces.GeradorDeArquivo;

public class GeradorArquivoTxt implements GeradorDeArquivo {

	@Override
	public void criarArquivo(String dados) {
		try {
			PrintStream arquivo = new PrintStream("arquivo.txt");
			arquivo.println(dados);
			arquivo.close();
			System.out.println("Arquivo gerado com sucesso");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
