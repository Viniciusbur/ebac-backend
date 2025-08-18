package domain;

import dao.ClienteMapDAO;
import dao.IClienteDAO;
import domain.Cliente;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        ClienteMapDAO dao = new ClienteMapDAO();
        int opcao;

        do {
            String menu = """
                    Escolha uma opção:
                    1 - Cadastrar
                    2 - Consultar
                    3 - Excluir
                    4 - Alterar
                    5 - Sair
                    """;

            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opcao) {
                case 1 -> {
                    long cpf = Long.parseLong(JOptionPane.showInputDialog("CPF:"));
                    String nome = JOptionPane.showInputDialog("Nome:");
                    long tel = Long.parseLong(JOptionPane.showInputDialog("Telefone:"));
                    String end = JOptionPane.showInputDialog("Endereço:");
                    int numero = Integer.parseInt(JOptionPane.showInputDialog("Número:"));
                    String cidade = JOptionPane.showInputDialog("Cidade:");
                    String estado = JOptionPane.showInputDialog("Estado:");

                    Cliente cliente = new Cliente(cpf, nome, tel, end, numero, cidade, estado);
                    boolean sucesso = dao.cadastrar(cliente);
                    JOptionPane.showMessageDialog(null, sucesso ? "Cadastrado com sucesso!" : "CPF já cadastrado.");
                }
                case 2 -> {
                    long cpf = Long.parseLong(JOptionPane.showInputDialog("CPF para consultar:"));
                    Cliente cliente = dao.consultar(cpf);
                    if (cliente != null) {
                        JOptionPane.showMessageDialog(null,
                                "Nome: " + cliente.getNome() + "\n" +
                                        "Telefone: " + cliente.getTel() + "\n" +
                                        "Endereço: " + cliente.getEnd() + ", " + cliente.getNumero() + "\n" +
                                        "Cidade: " + cliente.getCidade() + "\n" +
                                        "Estado: " + cliente.getEstado()
                        );
                    } else {
                        JOptionPane.showMessageDialog(null, "Cliente não encontrado.");
                    }
                }
                case 3 -> {
                    long cpf = Long.parseLong(JOptionPane.showInputDialog("CPF para excluir:"));
                    dao.excluir(cpf);
                    JOptionPane.showMessageDialog(null, "Exclusão realizada.");
                }
                case 4 -> {
                    long cpf = Long.parseLong(JOptionPane.showInputDialog("CPF do cliente:"));
                    Cliente clienteExistente = dao.consultar(cpf);
                    if (clienteExistente != null) {
                        String nome = JOptionPane.showInputDialog("Novo nome:", clienteExistente.getNome());
                        long tel = Long.parseLong(JOptionPane.showInputDialog("Novo telefone:", clienteExistente.getTel()));
                        String end = JOptionPane.showInputDialog("Novo endereço:", clienteExistente.getEnd());
                        int numero = Integer.parseInt(JOptionPane.showInputDialog("Novo número:", clienteExistente.getNumero()));
                        String cidade = JOptionPane.showInputDialog("Nova cidade:", clienteExistente.getCidade());
                        String estado = JOptionPane.showInputDialog("Novo estado:", clienteExistente.getEstado());

                        Cliente clienteNovo = new Cliente(cpf, nome, tel, end, numero, cidade, estado);
                        dao.alterar(clienteNovo);
                        JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Cliente não encontrado.");
                    }
                }
                case 5 -> JOptionPane.showMessageDialog(null, "Encerrando...");
                default -> JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        } while (opcao != 5);
    }

}
