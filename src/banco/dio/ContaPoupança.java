package banco.dio;

public class ContaPoupan�a extends Conta {
	
	@Override
	public void imprimirExtrato() {
		System.out.println("Extrato conta poupan�a.");
		super.imprimirInfoComuns();
		
	}


}
