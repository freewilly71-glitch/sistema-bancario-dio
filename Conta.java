public abstract class Conta {
    protected Long numero;
    protected String agencia;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Long numero, String agencia, Cliente cliente) {
        this.numero = numero;
        this.agencia = agencia;
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    public abstract void depositar(double valor);
    public abstract void sacar(double valor);

    public double getSaldo() {
        return saldo;
    }

    public Long getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
