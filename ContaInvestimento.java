public class ContaInvestimento extends Conta {
    private double saldoInvestido;

    public ContaInvestimento(Long numero, String agencia, Cliente cliente) {
        super(numero, agencia, cliente);
        this.saldoInvestido = 0.0;
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    public void aplicarInvestimento(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            saldoInvestido += valor;
            System.out.println("Aplicação de R$" + valor + " realizada com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para investir.");
        }
    }

    public void resgatarInvestimento(double valor) {
        if (valor > 0 && valor <= saldoInvestido) {
            saldoInvestido -= valor;
            saldo += valor;
            System.out.println("Resgate de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido ou saldo investido insuficiente.");
        }
    }

    public double getSaldoInvestido() {
        return saldoInvestido;
    }
}
