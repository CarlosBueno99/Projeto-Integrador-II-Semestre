package service;

import db.dao.DaoCliente;
import java.util.List;
import mock.Mock_Clientes;
import model.clientes.ValidadorCliente;
import exceptions.ClienteException;
import exceptions.DataSourceException;
import model.clientes.Cliente;

public class ServicoCliente {
     public static void cadastrarCliente(Cliente cliente)
            throws ClienteException, DataSourceException, Exception {
             ValidadorCliente.validar(cliente);
        try {
            DaoCliente.inserir(cliente);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    public static void atualizarCliente(Cliente cliente)
            throws ClienteException, DataSourceException,Exception {
        ValidadorCliente.validar(cliente);
        try {
            DaoCliente.atualizar(cliente);
            return;
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    public static List<Cliente> procurarClienteCPF(String CPF)
            throws ClienteException, DataSourceException {
        try {
            if (CPF == null || "   .   .   -  ".equals(CPF)) {
                return DaoCliente.listar();
            } else {
                return DaoCliente.procurarCPF(CPF);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }
    public static List<Cliente> procurarCliente(String Nome)
            throws ClienteException, DataSourceException {
        try {
            if (Nome == null || "".equals(Nome) || "Campo de pesquisa...".equals(Nome)) {
                return DaoCliente.listar();
            } else {
                return DaoCliente.procurarNome(Nome);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }
    public static Cliente obterCliente(Integer id)
            throws ClienteException, DataSourceException {
        try {
            return DaoCliente.obter(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }
    public static void excluirCliente(Integer id)
            throws ClienteException, DataSourceException {
        try {
            DaoCliente.excluir(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }
}
