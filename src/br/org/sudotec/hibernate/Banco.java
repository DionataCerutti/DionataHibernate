package br.org.sudotec.hibernate;

import javax.swing.JOptionPane;

public class Banco {	//grava no banco MySQL utlizando o update get e commit 

	public static void main(String[] args) {
		
		String opc = "1";
		while(!opc.equals("3")){
			opc = JOptionPane.showInputDialog("Digite uma opção: 1 - Conta Corrente; 2 - Conta Salário; 3 - Sair");
						Conta minhaConta = null;
						String conta = null;
			switch (opc) {
			case "1": //Conta Corrente
				minhaConta = new ContaCorrente();
				//seta para conta corrente o que o usuário digitar.
				conta = (JOptionPane.showInputDialog("Digite o número da sua conta corrente:"));
				//System.out.println(minhaCC.getConta());
				
				//verifica se já possui ou não Conta Corrente. Se SIM continua, se Não 
				
				
				
				
				
				break;
			case "2": //Conta Salário
				ContaSalario minhaCS = new ContaSalario();
				minhaCS.setConta(JOptionPane.showInputDialog("Digite o número da sua Conta Salário:"));
				
				break;
			default:
				break;
			}
			minhaConta.setConta(conta);
		}

	

	}

}
