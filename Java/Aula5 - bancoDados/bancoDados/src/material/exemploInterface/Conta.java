package material.exemploInterface;

public class Conta {
    /**
     * Nome do proprietario da Conta.
     */
    private String nomeProprietario;

    /**
     * Número da Conta.
     */
    private int numero;

    /**
     * Saldo da Conta.
     */
    private double saldo;

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
