package app_contacorrente_heranca;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String tipoDeConta[] = { "Conta Comum", "Conta Especial" };
        String opcoes[] = { "Consultar Saldo", "Realizar Saque", "Realizar Deposito", "Sair" };

        String nome = JOptionPane.showInputDialog(null, "Digite o nome usuario da conta: ");
        String sobrenome = JOptionPane.showInputDialog(null, "Digite o sobrenome do usuario: ");
        String numeroConta = JOptionPane.showInputDialog(null, "Digite o numero da conta: ");

        Cliente titular;
        if (JOptionPane.showConfirmDialog(null, "Deseja informar o cpf do Titular?", "Conta Corrente",
                JOptionPane.YES_NO_OPTION) == 0) {
            String cpf = JOptionPane.showInputDialog(null, "Digite o cpf do usuario: ");
            titular = new Cliente(nome, sobrenome, cpf);
        } else {
            titular = new Cliente(nome, sobrenome);
        }

        String tipoConta = (String) JOptionPane.showInputDialog(null, "Selecione o tipo de conta", "tipoConta", 1, null,
                tipoDeConta, tipoDeConta[0]);

        float deposito = 0;
        float saque = 0;
        String menu = "";

        if (tipoConta.equals(tipoDeConta[0])) {
            ContaCorrente conta = new ContaCorrente(titular, numeroConta);
            JOptionPane.showMessageDialog(null, conta);

            while (!menu.equals("Sair")) {

                menu = (String) JOptionPane.showInputDialog(null, "Selecione a operaçao desejada", "Cadastro", 3, null,
                        opcoes, opcoes[0]);
                switch (menu) {
                    case "Consultar Saldo":
                        JOptionPane.showMessageDialog(null, "Saldo disponivel: " + conta, "Saldo da conta: ", 1);
                        break;

                    case "Realizar Saque":
                        do {
                            saque = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o valor a ser sacado: ",
                                    "Realizando Saque" + conta.titular, 1));
                        } while (saque <= 0);
                        if (conta.realizaSaque(saque)) {
                            JOptionPane.showMessageDialog(null, "Valor sacado: " + saque);
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Saldo insuficiente para sacar o valor de: " + saque + " Reais");
                        }
                        break;
                    case "Realizar Deposito":
                        do {
                            deposito = Float.parseFloat(JOptionPane.showInputDialog(null,
                                    "Informe o valor a ser depositado: ", "Realizando Deposito" + conta.titular, 1));
                        } while (deposito <= 0);
                        conta.deposito(deposito);
                        JOptionPane.showMessageDialog(null, "Valor Depositado: " + deposito);

                }// fim shitch...case
            } // fim while if
              // conta especial

        } else {
            ContaEspecial contaEspecial;
            if (JOptionPane.showConfirmDialog(null, "Deseja atualizar o limite?", "Conta Corrente",
                    JOptionPane.YES_NO_OPTION) == 0) {
                float limite = Float
                        .parseFloat(JOptionPane.showInputDialog(null, "Digite o limite da conta especial: ", 3));
                contaEspecial = new ContaEspecial(titular, numeroConta, limite);
            } else {
                contaEspecial = new ContaEspecial(titular, numeroConta);
            }

            JOptionPane.showMessageDialog(null, contaEspecial);
            saque = 0;
            deposito = 0;
            menu = "";
            while (!menu.equals("Sair")) {

                menu = (String) JOptionPane.showInputDialog(null, "Selecione a operaçao desejada", "Cadastro", 3, null,
                        opcoes, opcoes[0]);
                switch (menu) {

                    case "Consultar Saldo":
                        JOptionPane.showMessageDialog(null, "Saldo disponivel: " + contaEspecial, "Saldo da conta: ",
                                1);
                        break;

                    case "Realizar Saque":
                        do {
                            saque = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o valor a ser sacado: ",
                                    "Realizando Saque" + contaEspecial.titular, 1));
                        } while (saque <= 0);
                        if (contaEspecial.realizaSaque(saque)) {
                            JOptionPane.showMessageDialog(null, "Valor sacado: " + saque);
                        } else {
                            JOptionPane.showMessageDialog(null,
                                    "Saldo insuficiente para sacar o valor de: " + saque + " Reais");
                        }
                        break;
                    case "Realizar Deposito":
                        do {
                            deposito = Float
                                    .parseFloat(JOptionPane.showInputDialog(null, "Informe o valor a ser depositado: ",
                                            "Realizando Deposito" + contaEspecial.titular, 1));
                        } while (deposito <= 0);
                        contaEspecial.deposito(deposito);
                        JOptionPane.showMessageDialog(null, "Valor Depositado: " + deposito);
                }
            }
        }
    }
}