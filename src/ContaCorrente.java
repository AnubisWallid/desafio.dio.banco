public class ContaCorrente extends Conta {

    private double chequeEspecial = 0;
    private static final String TIPO_CONTA = "Conta Corrente";
    private double saldoChequeEspecial = chequeEspecial;

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public void setChequeEspecial(double chequeEspecial) {

        this.chequeEspecial = chequeEspecial;
        this.saldoChequeEspecial = chequeEspecial;

    }

    @Override
    public void gerarExtrato() {
        super.extratoComuns(TIPO_CONTA,cliente);
        System.out.printf("Cheque Especial: %.2f%n",this.chequeEspecial);
        System.out.printf("Saldo Cheque Especial: %.2f%n",this.saldoChequeEspecial);
    }

    @Override
    public void sacar(double valor) {
        if(valor <= saldo){
            super.sacar(valor);
        }else if (saldoChequeEspecial >= valor || valor <= (saldoChequeEspecial + saldo)) {
            saldoChequeEspecial -= (valor - saldo);
            saldo = 0;
            System.out.println("- " + valor);

        }else System.out.println("Saque não efetuado por falta de saldo");
        }
    }



