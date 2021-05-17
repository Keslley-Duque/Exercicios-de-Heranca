package app_funcionario;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
        String tipoDeFuncionario[] = { "Funcionario", "Funcionario Comissado" };

        String opcUsuario = (String) JOptionPane.showInputDialog(null, "Selecione a Categoria: ", "opcUsuario", 3, null,
                tipoDeFuncionario, tipoDeFuncionario[0]);

        String nome = JOptionPane.showInputDialog(null, "Digite o nome do funcionario: ");
        String carteiraDeTrabalho = JOptionPane.showInputDialog(null, "Digite os dados da carteira de trabalho: ");
        double salarioBase = Double
                .parseDouble(JOptionPane.showInputDialog(null, "Digite o salario base do funcionario: "));

        if (opcUsuario.equals(tipoDeFuncionario[0])) {
            Funcionario funcionario = new Funcionario(nome, carteiraDeTrabalho, salarioBase);
            JOptionPane.showMessageDialog(null, funcionario.dadosFuncionario());
        } else {
            double vendas = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o total vendido: "));
            double comissao = Double
                    .parseDouble(JOptionPane.showInputDialog(null, "Digite o percentual de Comissão: "));
            FuncionarioComissionado funcionarioComissionado = new FuncionarioComissionado(nome, carteiraDeTrabalho,
                    salarioBase, vendas, comissao);
            JOptionPane.showMessageDialog(null, funcionarioComissionado.dadosFuncionarios());
        }
        System.exit(0);

    }
}
