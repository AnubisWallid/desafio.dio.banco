public class ContaPoupanca extends Conta {
    private static final String TIPO_CONTA = "Conta Poupanca";


    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void gerarExtrato() {
        super.extratoComuns(TIPO_CONTA,cliente);

    }



}
