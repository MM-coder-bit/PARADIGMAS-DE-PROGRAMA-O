package material.exemploInterface;

public interface Banco {
    public abstract void manutencaoConta(Conta conta);
    public abstract boolean saque(Conta conta, double valor);
    public abstract boolean deposito(Conta conta, double valor);
    public abstract void extrato(Conta conta);
}
