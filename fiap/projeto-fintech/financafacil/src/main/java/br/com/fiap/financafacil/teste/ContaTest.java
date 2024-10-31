package br.com.fiap.financafacil.teste;

import br.com.fiap.financafacil.dao.ContaDao;
import br.com.fiap.financafacil.exception.EntidadeNaoEncontradaException;
import br.com.fiap.financafacil.model.Conta;

import java.sql.SQLException;
import java.util.List;


public class ContaTest {
    public static void main(String[] args) throws EntidadeNaoEncontradaException {
        try {
            ContaDao contaDao = new ContaDao();

            for (int i = 1; i <= 5; i++) {
                Conta conta = new Conta();
                conta.setSaldo(1000.00 + (i * 100));
                conta.setIdUsuario(1);
                contaDao.insert(conta);
                System.out.println("Conta cadastrada: " + conta);
            }

            List<Conta> contas = contaDao.getAll();
            System.out.println("Contas cadastradas:");
            for (Conta c : contas) {
                System.out.println(
                        "ID: " + c.getIdConta() + ", Saldo: " + c.getSaldo() + ", ID Usuário: " + c.getIdUsuario());
            }

            contaDao.fecharConexao();
        } catch (SQLException e) {
            System.err.println("Ocorreu um erro de SQL: " + e.getMessage());
        }
    }
}
