package br.org.sudotec.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="conta_Corrente")
public class ContaCorrente extends Conta{
	
	//@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	//@Column(name="id")
	//private Integer id;
	
	//@Column(name="conta")
	//private String contaCorrente;
	
	//@Column(name="saldo") //se n�o colocar o (name ) a tabela asume o nome da variavel
	//private Float saldo = 0F;
	
	@Column(name="limite")
	private Float limite = 1000F;
	
	public Float getLimite() {
		return limite;
	}

	public void setLimite(Float limite) {
		this.limite = limite;
	}

	
	public ContaCorrente(){
		
	}

	
	//public void depositar(Float valor){
		
		//saldo = saldo + valor;
		
		
		//Session session = HibernateUtilConta.getSession();
		//session.beginTransaction();
		
		//setId(id);
		//setContaCorrente(JOptionPane.showInputDialog("Digite o n�mero da sua conta corrente: "));
		//setSaldo(Float.valueOf(JOptionPane.showInputDialog("Digite o valor � depositar: ")));
		//session.save(this);
		
		//session.getTransaction().commit();
		//session.close();
		
	//}
	
	public boolean sacar(Float valor){
		if(valor <= (super.getSaldo() + limite)){
		super.setSaldo( super.getSaldo()  - valor);
		return true;
		}else{
			System.out.println("Valor indispon�vel, saldo dispon�vel: "+ (super.getSaldo() + limite));
			return false;
		}
	}
	
	//aula dia 21 de mar�o de 2014
	//criar um limite para adicionar na valida��o do saque. Na conta corrente
	//criar um m�todo ContaSalario com Id, Conta e Saldo. com as op��es de depositar e sacar.
	
	
}
