package br.org.sudotec.hibernate;

public class Atendente {

	public static void main(String[] args) {
		
		ContaSalario minhaCS = new ContaSalario();
		
		minhaCS.depositar(80F);
		System.out.println("saldo atual da conta salario de R$ "+ minhaCS.getSaldo());
		
		minhaCS.sacar(35F);
		System.out.println("Saldo atual conta salario R$ "+ minhaCS.getSaldo());
		
		minhaCS.sacar(200F);
		System.out.println("Saldo atual conta salario R$ "+ minhaCS.getSaldo());
		
		
		ContaCorrente minhaCC = new ContaCorrente();
		minhaCC.depositar(50F);		
		
		ContaCorrente c1 = new ContaCorrente();
		
		ContaCorrente c2 = new ContaCorrente();
		
		//minhaCC.sacar(20000F);
		
		//boolean saqueEfetuado = minhaCC.sacar(50F);
		
		//if(saqueEfetuado){
			System.out.println(minhaCC.getSaldo());
		///}else{
			System.out.println("Não foi possivel sacar");
			System.out.println("voce só tem "+ minhaCC.getSaldo() +" seu quebrado");
		//}
		
		//System.out.println("josé: "+ c1.getSaldo());
		
	}

}
