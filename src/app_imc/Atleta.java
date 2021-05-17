package app_imc;

import java.text.DecimalFormat;

public class Atleta extends Pessoa {
    private double altura, peso;

    public Atleta(String nome, String sobrenome, double peso) {
        super(nome, sobrenome);
        this.peso = peso;
    }

    public Atleta(String nome, String sobrenome, double peso, double altura) {
        super(nome, sobrenome);
        this.peso = peso;
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double imc() {
        return peso / (altura * altura);
    }

    public String mensagemIMC() {
        if (imc() < 18.6) {
            return "Abaixo do peso";
        } else if (imc() <= 24.9) {
            return "O peso normal";
        } else if (imc() <= 30) {
            return "Excesso de peso";
        } else {
            return "Obesidade";
        }
    }

    public String toString() {
        DecimalFormat mascara = new DecimalFormat("0.0");
        return super.toString() + "\nPeso: " + peso + "\nAltura: " + altura + "\nIMC: " + mascara.format(imc())
                + "\nVocê esta com: " + mensagemIMC();
    }

}