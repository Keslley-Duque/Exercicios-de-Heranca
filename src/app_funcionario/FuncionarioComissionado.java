package app_funcionario;

public class FuncionarioComissionado extends Funcionario {
    private double totalDeVendas, percentualDeComissao;

    public FuncionarioComissionado(String carteiraDeTrabalho, String nome, double totalDeVendas,
            double percentualDeComissao) {
        super(carteiraDeTrabalho, nome);
        this.setTotalDeVendas(totalDeVendas);
        this.setPercentualDeComissao(percentualDeComissao);
    }

    public double getPercentualDeComissao() {
        return percentualDeComissao;
    }

    public void setPercentualDeComissao(double percentualDeComissao) {
        this.percentualDeComissao = percentualDeComissao;
    }

    public double getTotalDeVendas() {
        return totalDeVendas;
    }

    public void setTotalDeVendas(double totalDeVendas) {
        this.totalDeVendas = totalDeVendas;
    }

    public FuncionarioComissionado(String carteiraDeTrabalho, String nome, double salarioBase, double totalDeVendas,
            double percentualDeComissao) {
        super(carteiraDeTrabalho, nome, salarioBase);
        this.setTotalDeVendas(totalDeVendas);
        this.setPercentualDeComissao(percentualDeComissao);
    }

    public double comissao() {
        return totalDeVendas * percentualDeComissao;
    }

    public double calculaSalarioTotal() {
        return comissao() + getSalarioBase();
    }

    public String dadosFuncionarios() {
        return super.dadosFuncionario() + "\nTotal de vendas: " + totalDeVendas + "\nPercentual de comissao: "
                + percentualDeComissao + "\nComissão: " + comissao() + "\nSalario Total: " + calculaSalarioTotal();
    }

}