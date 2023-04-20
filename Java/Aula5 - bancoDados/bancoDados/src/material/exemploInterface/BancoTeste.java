package material.exemploInterface;

public class BancoTeste {
    public static void main(String[] args) {
        Banco bancoCristiano = new BancoCristiano();
        Conta contaC = new Conta();
        contaC.setNomeProprietario("Cristiano Camilo");
        contaC.setNumero(1);
        contaC.setSaldo(1000);

        bancoCristiano.deposito(contaC, 150.50);
        bancoCristiano.saque(contaC, 500);
        bancoCristiano.extrato(contaC);

        Banco bancoSakurai = new BancoSakurai();
        Conta contaS = new Conta();
        contaS.setNomeProprietario("Rafael Sakurai");
        contaS.setNumero(1);
        contaS.setSaldo(500);

        bancoSakurai.deposito(contaS, 40.99);
        bancoSakurai.saque(contaS, 300);
        bancoSakurai.extrato(contaS);

        Banco bancoMarques = new BancoMarques();
        Conta contaM = new Conta();
        contaM.setNomeProprietario("Mateus Marques");
        contaM.setNumero(55);
        contaM.setSaldo(450);

        bancoMarques.deposito(contaM, 42.9);
        if (bancoMarques.saque(contaM, 400)) {
            bancoMarques.extrato(contaM);
        }
        ;

    }
}
