package br.org.sudotec.hibernate;

import javax.swing.JOptionPane;

public class Banco {	//grava no banco MySQL utlizando o update get e commit 

	public static void main(String[] args) {
		
		String opc = "1";
		while(!opc.equals("3")){
			opc = JOptionPane.showInputDialog("Digite uma op��o: 1 - Conta Corrente; 2 - Conta Sal�rio; 3 - Sair");
						Conta minhaConta = null;
						String conta = null;
			switch (opc) {
			case "1": //Conta Corrente
				minhaConta = new ContaCorrente();
				//seta para conta corrente o que o usu�rio digitar.
				conta = (JOptionPane.showInputDialog("Digite o n�mero da sua conta corrente:"));
				//System.out.println(minhaCC.getConta());
				
				//verifica se j� possui ou n�o Conta Corrente. Se SIM continua, se N�o 
				
				
				
				
				
				break;
			case "2": //Conta Sal�rio
				ContaSalario minhaCS = new ContaSalario();
				minhaCS.setConta(JOptionPane.showInputDialog("Digite o n�mero da sua Conta Sal�rio:"));
				
				break;
			default:
				break;
			}
			minhaConta.setConta(conta);
		}

	

	}

}
