package br.org.sudotec.hibernate;

import javax.swing.JOptionPane;

public class CaixaEletronico {

	public static void main(String[] args) {
		String opc = "1";
		while(!opc.equals("3")){
			opc = JOptionPane.showInputDialog("Digite uma opção: 1 - Depositar; 2 - Sacar; 3 - Sair");
			ContaCorrente conta = new ContaCorrente();
			
			switch (opc) {
			case "1": 
				//conta.depositar();
				break;
			case "2": 
				//conta.sacar
				break;
			default:
				break;
			}
		}

	}

}
