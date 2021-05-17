package app_contacorrente_heranca;

public class ContaCorrente {
    protected String numeroDaConta;
    protected Cliente titular;
    protected float saldo;

    public ContaCorrente(Cliente titular, String numeroDaConta) {
        this.setNumeroDaConta(numeroDaConta);
        this.setTitular(titular);
        saldo = 0;
    }

    public float getSaldo() {
        return saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String toString() {
        java.text.DecimalFormat mascara = new java.text.DecimalFormat("#,##0.00");
        return "Extrato: \n" + "\nNumero da conta: " + numeroDaConta + "\nTitular: " + titular + "\nSaldo: "
                + mascara.format(saldo);
    }

    public boolean realizaSaque(float saque) {
        if (getSaldo() >= saque) {
            saldo -= saque;
            return true;
        }
        return false;
    }

    public void deposito(float deposito) {
        saldo += deposito;
    }

}