package app_contacorrente_heranca;

public class ContaEspecial extends ContaCorrente {
    private float limite;

    public ContaEspecial(Cliente titular, String numeroDaConta, float limite) {
        super(titular, numeroDaConta);
        this.limite = limite;
    }

    public ContaEspecial(Cliente titular, String numeroDaConta) {
        super(titular, numeroDaConta);
        this.limite = 2000;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    @Override
    public float getSaldo() {
        return super.getSaldo() + limite;
    }

    public String toString() {
        java.text.DecimalFormat mascara = new java.text.DecimalFormat("#,##0.00");
        return super.toString() + "\nLimite de: R$ " + limite + "\nSaldo disponivel:" + mascara.format(getSaldo());
    }

}