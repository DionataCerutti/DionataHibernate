package br.org.sudotec.hibernate;

import javax.persistence.Table;
import javax.persistence.Entity;

@Entity
@Table(name="conta_Salario")
public class ContaSalario extends Conta{
	
	//@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	//@Column
	//private Integer id;
	
	//@Column
	//private String conta;
	
	//@Column
	//private Float saldo = 0F;

	public boolean sacar(Float valor){
		if(valor <= super.getSaldo()){
			super.setSaldo(super.getSaldo() - valor);
			return true;
		}else{
			System.out.println("valor indisponível para saque, você tem apenas: R$ "+ super.getSaldo());
			return false;
		}
	}

}
