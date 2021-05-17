package app_imc;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String tipoDePessoas[] = { "Pessoa Comum", "Atleta" };

        String opcaoUsuario = (String) JOptionPane.showInputDialog(null, "Digite a opção desejada: ", "tipoDePessoas",
                3, null, tipoDePessoas, tipoDePessoas[0]);

        String nome = JOptionPane.showInputDialog(null, "Digite o nome: ", "tipoDePessoas", 3);
        String sobrenome = JOptionPane.showInputDialog(null, "Digite o sobrenome: ", "tipoDePessoas", 3);

        if (opcaoUsuario.equals(tipoDePessoas[0])) {
            Pessoa pessoa = new Pessoa(nome, sobrenome);
            JOptionPane.showMessageDialog(null, "\nNome Completo: " + pessoa, "tipoDePessoas", 1);
        } else {
            double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o peso: ", "tipoDePessoas", 3));
            double altura = Double
                    .parseDouble(JOptionPane.showInputDialog(null, "Digite a altura: ", "tipoDePessoas", 3));
            Atleta atleta = new Atleta(nome, sobrenome, peso, altura);
            JOptionPane.showMessageDialog(null, atleta, "tipoDePessoas", 1);
        }
        System.exit(0);
    }
}