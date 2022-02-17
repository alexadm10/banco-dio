package banco.dio;

public class Main {

	public static void main(String[] args) {
		
		Conta cc = new ContaCorrente();
		cc.depositar(100);
		
		Conta poupanca = new ContaPoupanša();
		
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
