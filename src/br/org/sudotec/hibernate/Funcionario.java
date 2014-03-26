package br.org.sudotec.hibernate;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.swing.JOptionPane;

import org.hibernate.Session;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;

@Entity
@Table(name="funcionario")
public class Funcionario {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="valorHora")
	private Float valorHora;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Float getValorHora() {
		return valorHora;
	}	
	public void setValorHora(Float valorHora) {
		this.valorHora = valorHora;
	}	

	public void gravaFuncionario(){
		Session session = HibernateUtil.getSession();
		session.beginTransaction();
		
		setNome(JOptionPane.showInputDialog("Digite nome: "));
		setValorHora(Float.valueOf(JOptionPane.showInputDialog("Digite valor da Hora: ")));
		session.save(this);
		
		session.getTransaction().commit();
		session.close();
	}
	
	public void pesquisaFuncionario(){
		Session session = HibernateUtil.getSession();
		String pesq = JOptionPane.showInputDialog("Digite nome para pesquisa: ");
		
		List list = session.createCriteria(Funcionario.class).
					add(Restrictions.ilike(nome, pesq, MatchMode.ANYWHERE)).
					list();
		
		for (Object lista : list) {
			System.out.println(lista);
		}
		
		session.close();
	}
}
