public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Gerson", "123.456.789-00");
        ContaInvestimento conta = new ContaInvestimento(1001L, "0001", cliente);

        conta.depositar(1000.0);
        conta.aplicarInvestimento(500.0);
        conta.resgatarInvestimento(200.0);
        conta.sacar(100.0);

        System.out.println("\nResumo da conta:");
        System.out.println("Saldo disponível: R$" + conta.getSaldo());
        System.out.println("Saldo investido: R$" + conta.getSaldoInvestido());
    }
}
