package app_atleta;

public class Lutador extends Atleta {

    public Lutador(String nome, float peso) {
        super(nome, peso);
    }

    public Lutador(float peso) {
        super(peso);
    }

    public String defineCategoria() {
        if (getPeso() <= 54) {
            return "Pluma";
        } else if (getPeso() <= 60) {
            return "Leve";
        } else if (getPeso() <= 75) {
            return "Meio-Leve";
        } else {
            return "Pesado";
        }
    }
}