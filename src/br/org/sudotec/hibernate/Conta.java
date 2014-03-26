package br.org.sudotec.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.Session;

@Entity
@Table(name="Conta")
public abstract class Conta {
	
	
		
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private Integer id;
	
	@Column
	private String conta;
	
	@Column
	private Float saldo = 0F;
	
	public abstract boolean sacar(Float valor);
	
	public Conta(){
		
	}
	
	public Conta(String conta){
		this.conta = conta;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public Float getSaldo() {
		return saldo;
	}

	public void setSaldo(Float saldo) {
		this.saldo = saldo;
	}
	
	public void depositar(Float valor){
		
		saldo = saldo + valor;
		
		Session session = HibernateUtilConta.getSession();
		session.beginTransaction();
		
	}
	
}
