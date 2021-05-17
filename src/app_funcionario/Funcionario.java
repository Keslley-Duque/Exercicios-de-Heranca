package app_funcionario;

public class Funcionario {
    private String carteiraDeTrabalho, nome;
    private double salarioBase;

    public Funcionario(String nome, String carteiraDeTrabalho) {
        this.setNome(nome);
        this.setCarteiraDeTrabalho(carteiraDeTrabalho);
    }

    public Funcionario(String nome, String carteiraDeTrabalho, double salarioBase) {
        this.setNome(nome);
        this.setCarteiraDeTrabalho(carteiraDeTrabalho);
        this.setSalarioBase(salarioBase);
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCarteiraDeTrabalho() {
        return carteiraDeTrabalho;
    }

    public void setCarteiraDeTrabalho(String carteiraDeTrabalho) {
        this.carteiraDeTrabalho = carteiraDeTrabalho;
    }

    public String dadosFuncionario() {
        return "Dados do Funcionario" + "\nNome: " + nome + "\nNumero da carteira de Trabalho: " + carteiraDeTrabalho
                + "\nSalario Base: " + salarioBase;
    }

}