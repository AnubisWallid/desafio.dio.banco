public abstract class Conta implements InterfaceConta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }


    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            this.saldo -= valor;
            System.out.println("- " + valor);
        }
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("+ " + valor);


    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.saldo -= valor;
        contaDestino.depositar(valor);
        System.out.println("- " + valor);

    }

    protected void extratoComuns(String tipoConta,Cliente cliente) {
        System.out.printf("----- Extrato %s -----\n", tipoConta);
        System.out.println("Titular: " + this.cliente.getNome());
        System.out.println("Agencia: " + this.getAgencia());
        System.out.println(String.format("%s : %d", tipoConta, this.numero));
        System.out.printf("Saldo da %s: %.2f%n", tipoConta, this.saldo);
    }
}
