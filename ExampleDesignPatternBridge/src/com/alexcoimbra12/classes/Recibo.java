package com.alexcoimbra12.classes;

import com.alexcoimbra12.bridge.interfaces.Arquivo;
import com.alexcoimbra12.bridge.interfaces.GeradorDeArquivo;

public class Recibo implements Arquivo {

	private String emissor;
	private String favorecido;
	private double valor;
	private GeradorDeArquivo geradorDeArquivo;

	public Recibo(String emissor, String favorecido, double valor, GeradorDeArquivo tipoDoArquivo) {
		super();
		this.emissor = emissor;
		this.favorecido = favorecido;
		this.valor = valor;
		this.geradorDeArquivo = tipoDoArquivo;
	}

	@Override
	public void geraArquivo() {
		StringBuilder dados = new StringBuilder();
		dados.append("Recibo: ");
		dados.append("\n");
		dados.append("Empresa: " + this.emissor);
		dados.append("\n");
		dados.append("Cliente: " + this.favorecido);
		dados.append("\n");
		dados.append("Valor: " + this.valor);
		this.geradorDeArquivo.criarArquivo(dados.toString());
	}
}
