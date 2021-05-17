package app_imc;

public class Pessoa {
    private String nome, sobrenome;

    public Pessoa(String nome, String sobrenome) {
        this.setNome(nome);
        this.setSobrenome(sobrenome);
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString() {
        return nome + " " + sobrenome;
    }

}