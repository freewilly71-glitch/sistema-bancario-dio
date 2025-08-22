import java.util.HashMap;
import java.util.Map;

public class RepositorioContas {
    private Map<Long, Conta> contas = new HashMap<>();

    public void adicionarConta(Conta conta) {
        contas.put(conta.numero, conta);
    }

    public Conta buscarConta(Long numero) {
        return contas.get(numero);
    }

    public Map<Long, Conta> listarContas() {
        return contas;
    }
}
