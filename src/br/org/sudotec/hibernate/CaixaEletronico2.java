package br.org.sudotec.hibernate;

import org.hibernate.Session;

public class CaixaEletronico2 {

	public static void main(String[] args) {
		Session sessao = HibernateUtilConta.getSession();
		sessao.beginTransaction();
		
		ContaCorrente minhaCC = (ContaCorrente) sessao.get(ContaCorrente.class, 1);
		
		
		//System.out.println("Saldo: "+ minhaCC.getSaldo());
		//minhaCC.depositar(200F);
		//System.out.println("Saldo: "+ minhaCC.getSaldo());
		
		//salvou todas as operações no banco
		sessao.update(minhaCC);
		sessao.getTransaction().commit();
		sessao.close();
		
	}

}
