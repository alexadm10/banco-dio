package banco.dio;

public class ContaPoupanša extends Conta {
	
	@Override
	public void imprimirExtrato() {
		System.out.println("Extrato conta poupanša.");
		super.imprimirInfoComuns();
		
	}


}
