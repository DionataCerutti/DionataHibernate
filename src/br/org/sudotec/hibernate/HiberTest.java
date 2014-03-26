package br.org.sudotec.hibernate;

import org.hibernate.Session;
import java.util.List;
import javax.swing.JOptionPane;

public class HiberTest {
	
	public static void main(String[] args) {
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		
		List list = session.createCriteria(Funcionario.class).list();
		
		JOptionPane.showMessageDialog(null, list.size());
		
		//Funcionario func = new Funcionario();
		//func.setNome("otro teste");
		//func.setValorHora(1F);
		//session.save(func);
		
		//Funcionario func = (Funcionario) session.get(Funcionario.class, 1);
		//func.setValorHora(12F);
		//session.update(func);
		
		//Funcionario func = (Funcionario) session.get(Funcionario.class, 1);
		//session.delete(func);
		
		session.getTransaction().commit();
		session.close();
	}

}

