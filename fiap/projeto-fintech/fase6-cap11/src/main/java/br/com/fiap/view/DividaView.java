package br.com.fiap.view;

import br.com.fiap.dao.DividaDao;
import br.com.fiap.exception.EntidadeNaoEncontradaException;
import br.com.fiap.model.Divida;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class DividaView {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DividaDao dao;
        System.out.println("Bem-vindo ao Finança Fácil!");
        try {
            dao = new DividaDao();
            int escolha;
            do {
                System.out.println("Escolha uma opção: 1-Cadastrar  2-Pesquisar por ID  3-Listar  4-Atualizar  5-Remover  0-Sair");
                escolha = scanner.nextInt();
                switch (escolha) {
                    case 1:
                        cadastrar(scanner, dao);
                        break;
                    case 2:
                        pesquisarDivida(scanner, dao);
                        break;
                    case 3:
                        listar(dao);
                        break;
                    case 4:
                        atualizar(scanner, dao);
                        break;
                    case 5:
                        removerDivida(scanner, dao);
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

    private static void cadastrar(Scanner scanner, DividaDao dao) {
        System.out.println("Digite o título da dívida:");
        String titulo = scanner.next();
        System.out.println("Digite o valor inicial:");
        double valorInicial = scanner.nextDouble();
        System.out.println("Digite a data inicial (yyyy-mm-dd):");
        String dataInicial = scanner.next();
        System.out.println("Digite a taxa:");
        double taxa = scanner.nextDouble();
        System.out.println("Digite o ID da conta:");
        int idConta = scanner.nextInt();

        Divida novaDivida = new Divida(titulo, valorInicial, LocalDate.parse(dataInicial), taxa, idConta);
        try {
            dao.insert(novaDivida);
            System.out.println("Dívida cadastrada com sucesso!");
        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar dívida: " + e.getMessage());
        }
    }

    private static void pesquisarDivida(Scanner scanner, DividaDao dao) {
        System.out.println("Digite o ID da dívida:");
        int id = scanner.nextInt();
        try {
            Divida divida = dao.pesquisar(id);
            System.out.println("Dívida encontrada:");
            System.out.println("ID: " + divida.getIdDivida() + ", Título: " + divida.getTitulo() + ", Valor: R$" + divida.getValorInicial() + ", Data: " + divida.getDataInicial() + ", Taxa: " + divida.getTaxa());
        } catch (SQLException | EntidadeNaoEncontradaException e) {
            System.err.println("Erro ao pesquisar dívida: " + e.getMessage());
        }
    }

    private static void listar(DividaDao dao) {
        try {
            List<Divida> dividas = dao.getAll();
            System.out.println("Lista de dívidas:");
            for (Divida divida : dividas) {
                System.out.println("ID: " + divida.getIdDivida() + ", Título: " + divida.getTitulo() + ", Valor: R$" + divida.getValorInicial() + ", Data: " + divida.getDataInicial() + ", Taxa: " + divida.getTaxa());
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar dívidas: " + e.getMessage());
        }
    }

    private static void atualizar(Scanner scanner, DividaDao dao) {
        System.out.println("Digite o ID da dívida que deseja atualizar:");
        int id = scanner.nextInt();
        try {
            Divida divida = dao.pesquisar(id); // Obtemos a dívida pelo ID
            System.out.println("Digite o novo título da dívida:");
            divida.setTitulo(scanner.next());
            System.out.println("Digite o novo valor inicial:");
            divida.setValorInicial(scanner.nextDouble());
            System.out.println("Digite a nova data inicial (yyyy-mm-dd):");
            divida.setDataInicial(LocalDate.parse(scanner.next()));
            System.out.println("Digite a nova taxa:");
            divida.setTaxa(scanner.nextDouble());
            dao.atualizar(divida);
            System.out.println("Dívida atualizada com sucesso!");
        } catch (SQLException | EntidadeNaoEncontradaException e) {
            System.err.println("Erro ao atualizar dívida: " + e.getMessage());
        }
    }

    private static void removerDivida(Scanner scanner, DividaDao dao) {
        System.out.println("Digite o ID da dívida que deseja remover:");
        int id = scanner.nextInt();
        try {
            dao.remover(id);
            System.out.println("Dívida removida com sucesso!");
        } catch (SQLException | EntidadeNaoEncontradaException e) {
            System.err.println("Erro ao remover dívida: " + e.getMessage());
        }
    }
}
