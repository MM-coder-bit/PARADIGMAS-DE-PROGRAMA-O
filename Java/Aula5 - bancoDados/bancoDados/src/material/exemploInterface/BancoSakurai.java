package material.exemploInterface;

public class BancoSakurai implements Banco {
    /**
     * Conta que representa o Banco Sakurai.
     */
    private Conta contaBancoSakurai;

    /**
     * Construtor padrão da classe.
     *
     * Cria uma conta para o banco sakurai.
     */
    public BancoSakurai() {
        this.contaBancoSakurai = new Conta();
        this.contaBancoSakurai.setNomeProprietario("Banco Sakurai");
        this.contaBancoSakurai.setNumero(0);
        this.contaBancoSakurai.setSaldo(0d);
    }

    public void manutencaoConta(Conta conta) {
        boolean temSaldo = conta.getSaldo() >= 0.25;

        //Verifica se tem saldo para realizar a manutenção da conta.
        if(temSaldo) {
            double novoSaldo = conta.getSaldo() - 0.25;
            conta.setSaldo(novoSaldo);

            //Deposita o dinheiro da manutencao na conta do banco sakurai.
            deposito(this.contaBancoSakurai, 0.25);
        } else {
            System.out.println("Não conseguiu cobrar a manutenção da conta" +
                    conta.getNumero() + " !!!");
        }
    }

    public boolean saque(Conta conta, double valor) {
        //Verifica se tem saldo suficiente para fazer o saque
        if(conta.getSaldo() >= valor) {
            //Realiza o saque na conta.
            double novoValor = conta.getSaldo() - valor;
            conta.setSaldo( novoValor );
            System.out.println("Saque efetuado!!!");

            //Toda vez que fizer um saque faz cobra a manutenção da conta.
            manutencaoConta(conta);
            return true;
        } else {
            System.out.println("Não conseguiu fazer o saque!!!");
            //Se não conseguir fazer o saque, mostra o extrato da conta.
            extrato(conta);
            return false;
        }
    }

    public boolean deposito(Conta conta, double valor) {
        //Realiza o deposito na conta.
        double novoValor = conta.getSaldo() + valor;
        conta.setSaldo(novoValor);
        System.out.println("Deposito efetuado!!!");
        return true;
    }

    public void extrato(Conta conta) {
        System.out.println("\n -- BANCO SAKURAI -- \n");
        System.out.println("-> EXTRATO CONTA\n");
        System.out.println("Nome: " + conta.getNomeProprietario());
        System.out.println("Numero: " + conta.getNumero());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("\n---------------------\n");
    }

    public boolean transferencia(Conta contaOrigem, Conta contaDestino, double valor) {
        boolean fezSaque = saque(contaOrigem, valor);
        //Verifica se conseguiu sacar dinheiro na conta de origem.
        if(fezSaque) {
            //Faz o deposito na conta de destino.
            deposito(contaDestino, valor);
            System.out.println("Transferencia efetuada.");
            return true;
        } else {
            System.out.println("Não conseguiu fazer a transferencia.");
            return false;
        }
    }
}
