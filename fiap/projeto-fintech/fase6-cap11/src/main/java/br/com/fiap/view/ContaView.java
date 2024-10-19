package br.com.fiap.view;

import br.com.fiap.dao.ContaDao;
import br.com.fiap.exception.EntidadeNaoEncontradaException;
import br.com.fiap.model.Conta;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class ContaView {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaDao dao;
        System.out.println("Bem vindo ao Finança Facil!");
        try {
            dao = new ContaDao();
            int escolha;
            do {
                System.out.println(
                        "Escolha uma opção: 1-Cadastrar  2-Pesquisar por ID  3-Listar  4-Atualizar  5-Remover  0-Sair");
                escolha = scanner.nextInt();
                switch (escolha) {
                    case 1:
                        cadastrar(scanner, dao);
                        break;
                    case 2:
                        pesquisarConta(scanner, dao);
                        break;
                    case 3:
                        listar(dao);
                        break;
                    case 4:
                        atualizar(scanner, dao);
                        break;
                    case 5:
                        removerConta(scanner, dao);
                        break;
                    case 0:
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                }
            } while (escolha != 0);
            dao.fecharConexao();
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }

    private static void cadastrar(Scanner scanner, ContaDao dao) {
        System.out.println("Digite o saldo da conta:");
        double saldo = scanner.nextDouble();

        System.out.println("Digite o ID do usuário:");
        int idUsuario = scanner.nextInt();
        
        Conta novaConta = new Conta(idUsuario, saldo);
        try {
            dao.insert(novaConta);
            System.out.println("Conta cadastrada com sucesso!");
        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar conta: " + e.getMessage());
        }
    }

    private static void pesquisarConta(Scanner scanner, ContaDao dao) {
        System.out.println("Digite o ID da conta:");
        int id = scanner.nextInt();
        try {
            Conta conta = dao.getAll().stream()
                    .filter(c -> c.getIdConta() == id)
                    .findFirst()
                    .orElseThrow(() -> new EntidadeNaoEncontradaException("Conta não encontrada."));
            System.out.println("Conta encontrada:");
            System.out.println("ID: " + conta.getIdConta() + ", Saldo: R$" + conta.getSaldo() + ", ID do Usuário: "
                    + conta.getIdUsuario());
        } catch (SQLException | EntidadeNaoEncontradaException e) {
            System.err.println("Erro ao pesquisar conta: " + e.getMessage());
        }
    }

    private static void listar(ContaDao dao) {
        try {
            List<Conta> contas = dao.getAll();
            System.out.println("Lista de contas:");
            for (Conta conta : contas) {
                System.out.println("ID: " + conta.getIdConta() + ", Saldo: R$" + conta.getSaldo() + ", ID do Usuário: "
                        + conta.getIdUsuario());
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar contas: " + e.getMessage());
        }
    }

    private static void atualizar(Scanner scanner, ContaDao dao) {
        System.out.println("Digite o ID da conta que deseja atualizar:");
        int id = scanner.nextInt();
        try {
            Conta conta = dao.getAll().stream()
                    .filter(c -> c.getIdConta() == id)
                    .findFirst()
                    .orElseThrow(() -> new EntidadeNaoEncontradaException("Conta não encontrada."));
            System.out.println("Digite o novo saldo da conta:");

            double saldo = scanner.nextDouble();
            conta.setSaldo(saldo);
            dao.insert(conta);
            System.out.println("Conta atualizada com sucesso!");
        } catch (SQLException | EntidadeNaoEncontradaException e) {
            System.err.println("Erro ao atualizar conta: " + e.getMessage());
        }
    }

    private static void removerConta(Scanner scanner, ContaDao dao) {
        System.out.println("Digite o ID da conta que deseja remover:");
        int id = scanner.nextInt();
        try {
            dao.remover(id);
            System.out.println("Conta removida com sucesso!");
        } catch (SQLException | EntidadeNaoEncontradaException e) {
            System.err.println("Erro ao remover conta: " + e.getMessage());
        }
    }
}
