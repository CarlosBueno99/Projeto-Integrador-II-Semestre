package service;

import db.dao.DaoVendas;
import java.util.Date;
import java.util.List;
import model.clientes.Produto;
import model.clientes.Venda;

public class ServicoVendas {

    public static List<Venda> procurarVenda_N_cliente(String nome) {
        try {
            if (nome.isEmpty() || nome.equals("") || "Insira o nome do cliente...".equals(nome)) {
                return DaoVendas.listar();
            } else {
                return DaoVendas.procurarNomeCliente(nome);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public static List<Venda> procurarVendaData(Date data_inicial, Date data_final) {

        try {
            return DaoVendas.procurarDataVenda(data_inicial, data_final);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void cadastrarVenda(Venda venda) {
        try {
            DaoVendas.inserir(venda);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void adicionarItens(Venda venda) {
        try {
            DaoVendas.inserirItens(venda);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void AtualizarEstoque(Produto produto) {
        try {
            DaoVendas.atualizar(produto);
        } catch (Exception e) {
        }
    }
}
