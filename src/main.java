public class main {
    public static void main(String[] args) {
        Cliente wallidSantana = new Cliente("Wallid Santana");


        ContaCorrente cCorrente = new ContaCorrente(wallidSantana);
        Conta cPoupanca = new ContaPoupanca(wallidSantana);
        cCorrente.gerarExtrato();
        cPoupanca.gerarExtrato();
        cCorrente.setChequeEspecial(100d);
        cCorrente.depositar(100d);
        cPoupanca.depositar(200d);
        cPoupanca.sacar(190.50);
        cCorrente.gerarExtrato();
        cPoupanca.gerarExtrato();



    }
}
