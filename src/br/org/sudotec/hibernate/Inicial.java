package br.org.sudotec.hibernate;

import javax.swing.JOptionPane;

public class Inicial {

	public static void main(String[] args) {
		String opc = "1";
		while(!opc.equals("3")){
			opc = JOptionPane.showInputDialog("Digite opção: 1 - Novo; 2 - Pesquisa; 3 - Sair");
			Funcionario func = new Funcionario();
			
			switch (opc) {
			case "1": 
				func.gravaFuncionario();
				break;
			case "2": 
				func.pesquisaFuncionario();
				break;
			default:
				break;
			}
		}

	}

}

