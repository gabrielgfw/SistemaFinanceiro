package br.com.functions;

import br.com.util.Teclado;

public class Conta {

	private int numeroOperacao;
	private String nomeOperacao;
	private double valorOperacao;
	private String dataOperacao;
	private double subtotalEntrada;
	private double subtotalSaida;
	private int contDeOperacao;
	private Conta array[] = new Conta[999];

	static String resposta;
	static int respostaInt;

	public Conta(int numero, String nome, double valor, String data) {
		this.numeroOperacao = numero;
		this.nomeOperacao = nome;
		this.valorOperacao = valor;
		this.dataOperacao = data;
	}

	public String getnomeOperacao() {
		return nomeOperacao;
	}

	public double getvalorOperacao() {
		return valorOperacao;
	}

	public String getdataOperacao() {
		return dataOperacao;
	}

	public double getsubtotalEntrada() {
		return subtotalEntrada;
	}

	public double getsubtotalSaida() {
		return subtotalSaida;
	}

	public int getnumeroOperacao() {
		return numeroOperacao;
	}

	public void setsubtotalEntrada(Double soma) {
		subtotalEntrada = this.getsubtotalEntrada() + soma;
	}

	public void setsubtotalSaida(Double soma) {
		subtotalSaida = this.getsubtotalSaida() + soma;
	}

	public void setnomeOperacao(String nomeOperacao) {
		this.nomeOperacao = nomeOperacao;
	}

	public void setvalorOperacao(double d) {
		this.valorOperacao = d;
	}

	public void setdataOperacao(String dataOperacao) {
		this.dataOperacao = dataOperacao;
	}

	public void setnumeroOperacao(int opNr) {
		this.numeroOperacao = this.contDeOperacao;
	}

	public Conta[] getArray() {
		return array;
	}

	public void setArray(Conta[] array) {
		this.array = array;
	}

	public void Inicio() {
		System.out.println("==============================================");
		System.out.println("   __   __   _____   __      __       _____    ");
		System.out.println("  |  | |  | |   __| |  |    |  |     |  _  |");
		System.out.println("  |  |_|  | |  |__  |  |    |  |    |  | |  |");
		System.out.println("  |   _   | |   __| |  |    |  |    |  | |  |");
		System.out.println("  |  | |  | |  |__  |  |__  |  |__  |  |_|  |");
		System.out.println("  |__| |__| |_____| |_____| |_____|  |_____|");
		System.out.println("");
		System.out.println("==============================================");
		System.out.println("# Bem-vindo ao Controle financeiro!");
		System.out.println("# Digite algumas das op��es abaixo:");
		System.out.println("# [entrada], [saida], [saldo], [consulta]");
		resposta = Teclado.lerTexto("==============================================");

		if (!(resposta.equalsIgnoreCase("entrada") || resposta.equalsIgnoreCase("saida")
				|| resposta.equalsIgnoreCase("saldo") || resposta.equalsIgnoreCase("consulta"))) {
			System.out.println("# Op��o inv�lida:" + "\n" + resposta);
			System.out.println("# Digite novamente algumas das op��es abaixo:");
			System.out.println("# [entrada], [saida], [saldo], [consulta]");
			resposta = Teclado.lerTexto("==============================================");
		}

		if (resposta.equalsIgnoreCase("entrada")) {
			this.Entrada();
		} else if (resposta.equalsIgnoreCase("saida")) {
			this.Saida();
		} else if (resposta.equalsIgnoreCase("saldo")) {
			this.Saldo();
		} else {
			this.Consulta();
		}
	}

	private void Entrada() {
		this.array[contDeOperacao] = new Conta(contDeOperacao, "", 0, "");
		System.out.println("==============================================");
		System.out.println("                   __| |__ ");
		System.out.println("        _         |     __|         _                 ");
		System.out.println("      _| |_      |  || |_         _| |_                    ");
		System.out.println("     |_   _|      |__  _  |      |_   _|                      ");
		System.out.println("       |_|         __| ||  |       |_|            ");
		System.out.println("                  |__   _ |                            ");
		System.out.println("                     |_|");
		System.out.println("==============================================");
		System.out.println("----------------------------------------------");
		System.out.println("@ Digite o nome da entrada!");
		this.array[contDeOperacao].setnomeOperacao(Teclado.lerTexto("----------------------------------------------"));
		System.out.println("----------------------------------------------");
		System.out.println("@ Digite o valor da sua entrada:");
		this.array[contDeOperacao]
				.setvalorOperacao(Teclado.lerDouble("----------------------------------------------"));

		while (array[contDeOperacao].getvalorOperacao() <= 0) {
			System.out.println("# Valor informado � inv�lido:");
			System.out.println(array[contDeOperacao].getvalorOperacao());
			System.out.println("# Digite novamente o valor da sua entrada:");
			this.array[contDeOperacao]
					.setvalorOperacao(Teclado.lerDouble("----------------------------------------------"));
		}

		System.out.println("----------------------------------------------");
		System.out.println("@ Diga a data do lan�amento (dd/mm/aa)");
		this.array[contDeOperacao].setdataOperacao(Teclado.lerTexto("----------------------------------------------"));
		this.setsubtotalEntrada(array[contDeOperacao].getvalorOperacao());
		this.numeroOperacao++;

		System.out.println("==============================================");
		System.out.println("# Cadastro realizado!");
		System.out.println("----------------------------------------------");
		System.out.println("# Opera��o realizada!");
		System.out.println("----------------------------------------------");

		if (this.getnumeroOperacao() < 99) {
			System.out.println("@ N�mero da Opera��o: [ 00" + array[contDeOperacao].getnumeroOperacao() + " ]");
			System.out.println("----------------------------------------------");
		} else {
			System.out.println("@ N�mero da Opera��o: [ 0" + array[contDeOperacao].getnumeroOperacao() + " ]");
			System.out.println("----------------------------------------------");
		}

		System.out.println("@ Nome:  [ " + array[contDeOperacao].getnomeOperacao() + " ]");
		System.out.println("@ Valor: [ R$ " + array[contDeOperacao].getvalorOperacao() + " ]");
		System.out.println("@ Data:  [ " + array[contDeOperacao].getdataOperacao() + " ]");
		System.out.println("==============================================");
		this.contDeOperacao++;
		resposta = null;
		this.MenuRetorno();
	}

	private void Saida() {
		this.array[contDeOperacao] = new Conta(contDeOperacao, "", 0, "");
		System.out.println("==============================================");
		System.out.println("                   __| |__ ");
		System.out.println("                  |     __|                           ");
		System.out.println("      _____      |  || |_         _____                    ");
		System.out.println("     |_____|      |__  _  |      |_____|                      ");
		System.out.println("                   __| ||  |                      ");
		System.out.println("                  |__   _ |                            ");
		System.out.println("                     |_|");
		System.out.println("==============================================");
		System.out.println("----------------------------------------------");
		System.out.println("# Diga o nome da sa�da sem espa�os:");
		this.array[contDeOperacao].setnomeOperacao(Teclado.lerTexto("----------------------------------------------"));
		System.out.println("----------------------------------------------");
		System.out.println("# Diga o valor da sua sa�da:");
		this.array[contDeOperacao]
				.setvalorOperacao(Teclado.lerDouble("----------------------------------------------"));

		while (array[contDeOperacao].getvalorOperacao() <= 0) {
			System.out.println("# Valor informado � inv�lido: ");
			System.out.println(array[contDeOperacao].getvalorOperacao());
			System.out.println("# Digite novamente o valor da sua entrada:");
			this.array[contDeOperacao]
					.setvalorOperacao(Teclado.lerDouble("----------------------------------------------"));
		}

		System.out.println("----------------------------------------------");
		System.out.println("# Diga a data de lan�amento (dd/mm/aa)");
		this.array[contDeOperacao].setdataOperacao(Teclado.lerTexto("----------------------------------------------"));
		this.setsubtotalSaida(array[contDeOperacao].getvalorOperacao());
		this.numeroOperacao++;

		System.out.println("==============================================");
		System.out.println("# Cadastro realizado!");
		System.out.println("----------------------------------------------");
		System.out.println("# Opera��o realizada com sucesso!");

		if (this.getnumeroOperacao() < 99) {
			System.out.println("# N�mero da Opera��o: 00" + array[contDeOperacao].getnumeroOperacao());
		} else {
			System.out.println("# N�mero da Opera��o: 0" + array[contDeOperacao].getnumeroOperacao());
		}

		System.out.println("---------------------------------------------");
		System.out.println("@ Nome:  [ " + array[contDeOperacao].getnomeOperacao() + " ]");
		System.out.println("@ Valor: [ R$ " + array[contDeOperacao].getvalorOperacao() + " ]");
		System.out.println("@ Data:  [ " + array[contDeOperacao].getdataOperacao() + " ]");
		System.out.println("==============================================");
		this.contDeOperacao++;
		resposta = null;
		this.MenuRetorno();
	}

	public void Saldo() {
		System.out.println("==============================================");
		System.out.println("                   __| |__ ");
		System.out.println("        _         |     __|                           ");
		System.out.println("      _| |_      |  || |_         _____                    ");
		System.out.println("     |_   _|      |__  _  |      |_____|                      ");
		System.out.println("       |_|         __| ||  |                      ");
		System.out.println("                  |__   _ |                            ");
		System.out.println("                     |_|");
		System.out.println("==============================================");
		System.out.println("==============================================");
		System.out.println("@ Entradas: [ R$ " + this.getsubtotalEntrada() + " ]");
		System.out.println("@ Sa�das:   [ R$ " + this.subtotalSaida + " ]");
		System.out.println("---------------------------------------------");
		System.out.println("@ Saldo:    [ R$ " + (this.getsubtotalEntrada() - this.getsubtotalSaida()) + " ]");
		System.out.println("==============================================");
		this.MenuRetorno();
	}

	public void Consulta() {
		System.out.println("# Voc� est� na tela de consultas.");
		System.out.println("---------------------------------------------");
		System.out.println("# Estas foram as opera��es j� realizadas: ");

		if (contDeOperacao == 0) {
			System.out.println("# Nenhuma opera��o realizada!");
			this.MenuRetorno();
		} else {
			for (int i = 0; i < contDeOperacao; i++) {
				System.out.println("# N�mero Opera��o:   " + array[i].getnumeroOperacao());
				System.out.println("# Valor Opera��o: R$ " + array[i].getvalorOperacao());
				System.out.println("---------------------------------------------");
			}
		}

		System.out.println(contDeOperacao + " opera��es realizadas.");
		System.out.println("# Digite alguma das op��es abaixo:");
		System.out.println("# [consulta] ou [sair].");
		resposta = Teclado.lerTexto("==============================================");

		if (!(resposta.equalsIgnoreCase("sair") || resposta.equalsIgnoreCase("consulta"))) {

			System.out.println("# Op��o inv�lida:");
			System.out.println(resposta);
			System.out.println("# Digite novamente alguma op��o abaixo:");
			resposta = Teclado.lerTexto("# [consulta] ou [sair].");
		} else if (resposta.equalsIgnoreCase("sair")) {
			this.MenuRetorno();
		} else {
			respostaInt = Teclado.lerInt("# Digite o n�mero da Opera��o ou [-1] para sair.");
			if (respostaInt == -1) {
				this.MenuRetorno();
			} else if (respostaInt > this.contDeOperacao) {
				System.out.println("# Opera��o inv�lida ou inexistente, tente novamente!");
				respostaInt = Teclado.lerInt("# Digite novamente o n�mero da Opera��o ou [-1] para sair");

			} else if (respostaInt == -1) {
				this.MenuRetorno();
			} else {
				System.out.println("==============================================");
				System.out.println("# N�mero da Opera��o:       " + array[respostaInt].getnumeroOperacao());
				System.out.println("# nomeOperacao da Opera��o: " + array[respostaInt].getnomeOperacao());
				System.out.println("# Valor da Opera��o:     R$ " + array[respostaInt].getvalorOperacao());
				System.out.println("# Data da Opera��o:         " + array[respostaInt].getdataOperacao());
				System.out.println("==============================================");
			}
		}
		System.out.println("# Para realizar nova consulta digite: [consulta]");
		System.out.println("# Digite [sair] para voltar ao menu principal.");
		resposta = Teclado.lerTexto("==============================================");

		if (!(resposta.equalsIgnoreCase("consulta") || resposta.equalsIgnoreCase("sair"))) {
			System.out.println("# Resposta inv�lida, tente novamente!");
			System.out.println("# Para realizar nova consulta digite: [consulta]");
			System.out.println("# Digite [sair] para voltar ao menu principal.");
			resposta = Teclado.lerTexto("==============================================");
		} else if (resposta.equalsIgnoreCase("consulta")) {
			this.Consulta();
		} else {
			this.MenuRetorno();
		}
	}

	private void MenuRetorno() {
		System.out.println("# De volta ao menu!");
		System.out.println("# Digite algumas das op��es abaixo:");
		System.out.println("# [entrada], [saida], [saldo], [consulta]");
		resposta = Teclado.lerTexto("==============================================");

		if (!(resposta.equalsIgnoreCase("entrada") || resposta.equalsIgnoreCase("saida")
				|| resposta.equalsIgnoreCase("saldo") || resposta.equalsIgnoreCase("consulta"))) {

			System.out.println("- - - - - - - - - - - - - - - - - - - - - - -");
			System.out.println("# Digite algumas das op��es abaixo:");
			resposta = Teclado.lerTexto("# [entrada], [saida], [saldo], [consulta]");
		}

		if (resposta.equalsIgnoreCase("entrada")) {
			this.Entrada();
		} else if (resposta.equalsIgnoreCase("saida")) {
			this.Saida();
		} else if (resposta.equalsIgnoreCase("saldo")) {
			this.Saldo();
		} else {
			this.Consulta();
		}
	}
}