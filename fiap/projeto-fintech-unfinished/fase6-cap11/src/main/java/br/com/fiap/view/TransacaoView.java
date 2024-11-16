package br.com.fiap.view;

import br.com.fiap.dao.TransacaoDao;
import br.com.fiap.exception.EntidadeNaoEncontradaException;
import br.com.fiap.model.Transacao;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class TransacaoView {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TransacaoDao dao;
        System.out.println("Bem-vindo ao Finança Fácil!");
        try {
            dao = new TransacaoDao();
            int escolha;
            do {
                System.out.println("Escolha uma opção: 1-Cadastrar  2-Pesquisar por ID  3-Listar  4-Atualizar  5-Remover  0-Sair");
                escolha = scanner.nextInt();
                switch (escolha) {
                    case 1:
                        cadastrar(scanner, dao);
                        break;
                    case 2:
                        pesquisarTransacao(scanner, dao);
                        break;
                    case 3:
                        listar(dao);
                        break;
                    case 4:
                        atualizar(scanner, dao);
                        break;
                    case 5:
                        removerTransacao(scanner, dao);
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

    private static void cadastrar(Scanner scanner, TransacaoDao dao) {
        System.out.println("Digite o valor da transação:");
        double valor = scanner.nextDouble();
        System.out.println("Digite o tipo da transação:");
        String tipo = scanner.next();
        System.out.println("Digite o método da transação:");
        String metodo = scanner.next();
        System.out.println("Digite a categoria da transação:");
        String categoria = scanner.next();
        System.out.println("Digite a descrição da transação:");
        String descricao = scanner.next();
        System.out.println("Digite o ID da conta:");
        int idConta = scanner.nextInt();

        Transacao novaTransacao = new Transacao(valor, tipo, metodo, categoria, descricao, idConta);
        try {
            dao.insert(novaTransacao);
            System.out.println("Transação cadastrada com sucesso!");
        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar transação: " + e.getMessage());
        }
    }

    private static void pesquisarTransacao(Scanner scanner, TransacaoDao dao) {
        System.out.println("Digite o ID da transação:");
        int id = scanner.nextInt();
        try {
            Transacao transacao = dao.pesquisar(id);
            System.out.println("Transação encontrada:");
            System.out.println("ID: " + transacao.getIdTransacao() + ", Valor: R$" + transacao.getValor() + ", Tipo: " + transacao.getTipo() + ", Método: " + transacao.getMetodo() + ", Categoria: " + transacao.getCategoria() + ", Descrição: " + transacao.getDescricao());
        } catch (SQLException | EntidadeNaoEncontradaException e) {
            System.err.println("Erro ao pesquisar transação: " + e.getMessage());
        }
    }

    private static void listar(TransacaoDao dao) {
        try {
            List<Transacao> transacoes = dao.getAll();
            System.out.println("Lista de transações:");
            for (Transacao transacao : transacoes) {
                System.out.println("ID: " + transacao.getIdTransacao() + ", Valor: R$" + transacao.getValor() + ", Tipo: " + transacao.getTipo() + ", Método: " + transacao.getMetodo() + ", Categoria: " + transacao.getCategoria() + ", Descrição: " + transacao.getDescricao());
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar transações: " + e.getMessage());
        }
    }

    private static void atualizar(Scanner scanner, TransacaoDao dao) {
        System.out.println("Digite o ID da transação que deseja atualizar:");
        int id = scanner.nextInt();
        try {
            Transacao transacao = dao.pesquisar(id);
            System.out.println("Digite o novo valor da transação:");
            transacao.setValor(scanner.nextDouble());
            System.out.println("Digite o novo tipo da transação:");
            transacao.setTipo(scanner.next());
            System.out.println("Digite o novo método da transação:");
            transacao.setMetodo(scanner.next());
            System.out.println("Digite a nova categoria da transação:");
            transacao.setCategoria(scanner.next());
            System.out.println("Digite a nova descrição da transação:");
            transacao.setDescricao(scanner.next());
            System.out.println("Digite o novo ID da conta:");
            transacao.setIdConta(scanner.nextInt());

            dao.atualizar(transacao);
            System.out.println("Transação atualizada com sucesso!");
        } catch (SQLException | EntidadeNaoEncontradaException e) {
            System.err.println("Erro ao atualizar transação: " + e.getMessage());
        }
    }

    private static void removerTransacao(Scanner scanner, TransacaoDao dao) {
        System.out.println("Digite o ID da transação que deseja remover:");
        int id = scanner.nextInt();
        try {
            dao.remover(id);
            System.out.println("Transação removida com sucesso!");
        } catch (SQLException | EntidadeNaoEncontradaException e) {
            System.err.println("Erro ao remover transação: " + e.getMessage());
        }
    }
}
