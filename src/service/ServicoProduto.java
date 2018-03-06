
package service;

import db.dao.DaoInstrumentos;
import java.util.List;
import exceptions.ProdutoException;
import mock.Mock_Produtos;
import exceptions.DataSourceException;
import model.clientes.Produto;
import model.clientes.ValidadorProduto;

public class ServicoProduto {

    //Insere um quarto na fonte de dados
    public static void cadastrarProduto(Produto Produto)
            throws ProdutoException, DataSourceException,Exception {
            ValidadorProduto.validarProduto(Produto);

        try {
           DaoInstrumentos.inserir(Produto);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    public static void atualizarProduto(Produto produto)
            throws ProdutoException, DataSourceException,Exception {
            ValidadorProduto.validarProduto(produto);
        try {
            DaoInstrumentos.atualizar(produto);
            return;
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    public static List<Produto> procurarProduto(String nome)
            throws ProdutoException, DataSourceException {
        try {
            if (nome == null || "Campo de Pesquisa...".equals(nome)) {
                return DaoInstrumentos.listar();
            } else {
                return DaoInstrumentos.procurarNome(nome);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }
    
    public static List<Produto> procurarProdutoTipo(String Tipo)
            throws ProdutoException, DataSourceException {
        try {
            if (Tipo == null) {
                return DaoInstrumentos.listar();
            } else {
                return DaoInstrumentos.procurarTipo(Tipo);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    public static Produto obterProduto(String id)
            throws ProdutoException, DataSourceException {
        try {
            return DaoInstrumentos.obter(Integer.parseInt(id));
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    public static void excluirProduto(Integer id)
            throws ProdutoException, DataSourceException {
        try {
            DaoInstrumentos.excluir(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

}
