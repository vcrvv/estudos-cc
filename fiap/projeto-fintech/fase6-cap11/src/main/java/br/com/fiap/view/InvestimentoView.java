package br.com.fiap.view;

import br.com.fiap.dao.InvestimentoDao;
import br.com.fiap.exception.EntidadeNaoEncontradaException;
import br.com.fiap.model.Investimento;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class InvestimentoView {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InvestimentoDao dao;
        System.out.println("Bem-vindo ao Finança Fácil!");
        try {
            dao = new InvestimentoDao();
            int escolha;
            do {
                System.out.println("Escolha uma opção: 1-Cadastrar  2-Pesquisar por ID  3-Listar  4-Atualizar  5-Remover  0-Sair");
                escolha = scanner.nextInt();
                switch (escolha) {
                    case 1:
                        cadastrar(scanner, dao);
                        break;
                    case 2:
                        pesquisarInvestimento(scanner, dao);
                        break;
                    case 3:
                        listar(dao);
                        break;
                    case 4:
                        atualizar(scanner, dao);
                        break;
                    case 5:
                        removerInvestimento(scanner, dao);
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

    private static void cadastrar(Scanner scanner, InvestimentoDao dao) {
        System.out.println("Digite o título do investimento:");
        String titulo = scanner.next();
        System.out.println("Digite o valor investido:");
        double valorInvestido = scanner.nextDouble();
        System.out.println("Digite a data inicial (yyyy-mm-dd):");
        String dataInicial = scanner.next();
        System.out.println("Digite a taxa:");
        double taxa = scanner.nextDouble();
        System.out.println("Digite o ID da conta:");
        int idConta = scanner.nextInt();

        Investimento novoInvestimento = new Investimento(titulo, valorInvestido, LocalDate.parse(dataInicial), taxa, idConta);
        try {
            dao.insert(novoInvestimento);
            System.out.println("Investimento cadastrado com sucesso!");
        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar investimento: " + e.getMessage());
        }
    }

    private static void pesquisarInvestimento(Scanner scanner, InvestimentoDao dao) {
        System.out.println("Digite o ID do investimento:");
        int id = scanner.nextInt();
        try {
            Investimento investimento = dao.pesquisar(id);
            System.out.println("Investimento encontrado:");
            System.out.println("ID: " + investimento.getIdInvestimento() + ", Título: " + investimento.getTitulo() + ", Valor: R$" + investimento.getValorInvestido() + ", Data: " + investimento.getDataInicial() + ", Taxa: " + investimento.getTaxa());
        } catch (SQLException | EntidadeNaoEncontradaException e) {
            System.err.println("Erro ao pesquisar investimento: " + e.getMessage());
        }
    }

    private static void listar(InvestimentoDao dao) {
        try {
            List<Investimento> investimentos = dao.getAll();
            System.out.println("Lista de investimentos:");
            for (Investimento investimento : investimentos) {
                System.out.println("ID: " + investimento.getIdInvestimento() + ", Título: " + investimento.getTitulo() + ", Valor: R$" + investimento.getValorInvestido() + ", Data: " + investimento.getDataInicial() + ", Taxa: " + investimento.getTaxa());
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar investimentos: " + e.getMessage());
        }
    }

    private static void atualizar(Scanner scanner, InvestimentoDao dao) {
        System.out.println("Digite o ID do investimento que deseja atualizar:");
        int id = scanner.nextInt();
        try {
            Investimento investimento = dao.pesquisar(id); // Obtemos o investimento pelo ID
            System.out.println("Digite o novo título do investimento:");
            investimento.setTitulo(scanner.next());
            System.out.println("Digite o novo valor investido:");
            investimento.setValorInvestido(scanner.nextDouble());
            System.out.println("Digite a nova data inicial (yyyy-mm-dd):");
            investimento.setDataInicial(LocalDate.parse(scanner.next()));
            System.out.println("Digite a nova taxa:");
            investimento.setTaxa(scanner.nextDouble());

            dao.atualizar(investimento);
            System.out.println("Investimento atualizado com sucesso!");
        } catch (SQLException | EntidadeNaoEncontradaException e) {
            System.err.println("Erro ao atualizar investimento: " + e.getMessage());
        }
    }

    private static void removerInvestimento(Scanner scanner, InvestimentoDao dao) {
        System.out.println("Digite o ID do investimento que deseja remover:");
        int id = scanner.nextInt();
        try {
            dao.remover(id);
            System.out.println("Investimento removido com sucesso!");
        } catch (SQLException | EntidadeNaoEncontradaException e) {
            System.err.println("Erro ao remover investimento: " + e.getMessage());
        }
    }
}
