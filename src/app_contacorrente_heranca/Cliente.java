package app_contacorrente_heranca;

public class Cliente {
    private String nome, sobrenome, cpf;

    public Cliente(String nome, String sobrenome, String cpf) {
        this.setNome(nome);
        this.setSobrenome(sobrenome);
        this.setCpf(cpf);
    }

    public Cliente(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String toString() {// metodo herdado da classe object
        String dados = nome + " " + sobrenome;
        if (cpf != null) {
            dados += "\nCPF: " + cpf;
        }
        return dados;
    }

}