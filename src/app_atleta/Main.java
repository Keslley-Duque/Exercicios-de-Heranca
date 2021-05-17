package app_atleta;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
        String tipoDeAtleta[] = { "Atleta", "Lutador" };

        String opcaoUsuario = (String) JOptionPane.showInputDialog(null, "Selecione a categoria: ", "Atletas", 3, null,
                tipoDeAtleta, tipoDeAtleta[0]);

        String nome = JOptionPane.showInputDialog(null, "Digite o nome do atleta: ", "Atletas", 3);
        float peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o peso do atleta: ", "Atletas", 3));

        if (opcaoUsuario.equals(tipoDeAtleta[0])) {
            Atleta atleta = new Atleta(nome, peso);
            JOptionPane.showMessageDialog(null, "Dados do Atleta: " + "\nNome: " + atleta.getNome() + "\nPeso: "
                    + atleta.getPeso() + "\nCategoria: " + atleta.defineCategoria(), "Atletas", 1);
        } else {
            Lutador lutador = new Lutador(nome, peso);
            JOptionPane.showMessageDialog(null, "Dados do Atleta: " + "\nNome: " + lutador.getNome() + "\nPeso: "
                    + lutador.getPeso() + "\nCategoria: " + lutador.defineCategoria(), "Atletas", 1);
        }
        System.exit(0);
    }
}
