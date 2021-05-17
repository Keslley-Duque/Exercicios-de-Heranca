package app_atleta;

public class Atleta {
    private String nome;
    private float peso;

    public Atleta(float peso) {
        this.setPeso(peso);
    }

    public Atleta(String nome) {
        this.setNome(nome);
    }

    public Atleta(String nome, float peso) {
        this.setNome(nome);
        this.setPeso(peso);
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String defineCategoria() {
        if (peso <= 50) {
            return "Infantil";
        } else if (peso <= 65) {
            return "Juvenil";
        } else {
            return "Adulto";
        }
    }

}