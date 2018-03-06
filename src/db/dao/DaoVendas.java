package db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.clientes.Produto;
import model.clientes.Venda;

public class DaoVendas {

    public static void inserirItens(Venda venda)
            throws SQLException, Exception {
        String sql = "INSERT INTO ITENS_VENDA (instrumento_id, nome_produto, quantidade, valor_total, venda_id) VALUES (?, ?, ?, ?, ?)";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = ConnectionUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setInt(1, venda.getInstrumento_id());
            preparedStatement.setString(2, venda.getNomeProduto());
            preparedStatement.setInt(3, venda.getQuantidade());
            preparedStatement.setDouble(4, venda.getValorTotal());
            preparedStatement.setInt(5, venda.getNumero_venda());
            System.out.println(venda.getNumero_venda());
            preparedStatement.execute();
        }finally {
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }

    }

    public static void inserir(Venda venda)
            throws SQLException, Exception {
        String sql = "INSERT INTO VENDA (cliente_id, usuario_id, nome_cliente, total_venda, data_venda, hora_venda) VALUES (?, ?, ?, ?, ?, ?)";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = ConnectionUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, venda.getCliente_id());
            preparedStatement.setInt(2, venda.getUsuario_id());
            preparedStatement.setString(3, venda.getClienteNome());
            preparedStatement.setDouble(4, venda.getValorTotal());
            preparedStatement.setDate(5, new java.sql.Date(venda.getData().getTime()));
            preparedStatement.setString(6, venda.getHora());

            preparedStatement.execute();

        } finally {
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    public static void atualizar(Produto produto) throws SQLException, Exception {

        String sql = "UPDATE INSTRUMENTO SET quantidade_estoque = ? WHERE (instrumento_id = ?)";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = ConnectionUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, produto.getQuantidade());
            preparedStatement.setInt(2, produto.getId());

            preparedStatement.execute();
        } finally {
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    public static List<Venda> numeroVenda() throws SQLException, Exception {
        List<Venda> listaVenda = null;
        Connection connection = ConnectionUtils.getConnection();
        String sql = "SELECT venda_id FROM venda";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        ResultSet result = preparedStatement.executeQuery();
        while (result.next()) {
            if (listaVenda == null) {
                listaVenda = new ArrayList<Venda>();
            }
            Venda venda = new Venda();
            venda.setNumero_venda(result.getInt("venda_id"));
            listaVenda.add(venda);
        }
        if (result != null && !result.isClosed()) {
            result.close();
        }
        if (preparedStatement != null && !preparedStatement.isClosed()) {
            preparedStatement.close();
        }
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
        return listaVenda;
    }

    public static List<Venda> listar() throws SQLException, Exception {

        String sql = "SELECT * FROM VENDA";

        List<Venda> listaVenda = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;

        try {

            connection = ConnectionUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            result = preparedStatement.executeQuery();

            while (result.next()) {
                if (listaVenda == null) {
                    listaVenda = new ArrayList<Venda>();
                }
                Venda venda = new Venda();

                venda.setClienteNome(result.getString("nome_cliente"));
                venda.setNumero_venda(result.getInt("venda_id"));
                venda.setData(result.getDate("data_venda"));
                venda.setValorTotal(result.getDouble("total_venda"));
                venda.setCliente_id(result.getInt("cliente_id"));
                venda.setHora(result.getString("hora_venda"));
                listaVenda.add(venda);
            }

        } finally {

            if (result != null && !result.isClosed()) {
                result.close();
            }
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
        return listaVenda;
    }

    public static List<Venda> listarITens() throws SQLException, Exception {
        String sql = "SELECT * FROM ITENS_VENDA";
        List<Venda> listaVenda = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        try {
            connection = ConnectionUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            result = preparedStatement.executeQuery();

            while (result.next()) {
                if (listaVenda == null) {
                    listaVenda = new ArrayList<Venda>();
                }
                Venda venda = new Venda();
                venda.setNomeProduto(result.getString("nome_produto"));
                venda.setQuantidade(result.getInt("quantidade"));
                venda.setValorTotal(result.getDouble("valor_total"));
                listaVenda.add(venda);
            }

        } finally {
            if (result != null && !result.isClosed()) {
                result.close();
            }
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
        return listaVenda;
    }

    public static List<Venda> procurarNomeCliente(String valor) throws SQLException, Exception {
        String sql = "SELECT * FROM VENDA WHERE ((UPPER(nome_cliente) LIKE UPPER (?)))";

        List<Venda> listaVenda = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        try {
            connection = ConnectionUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "%" + valor + "%");
            result = preparedStatement.executeQuery();

            while (result.next()) {
                if (listaVenda == null) {
                    listaVenda = new ArrayList<Venda>();
                }
                Venda venda = new Venda();
                venda.setClienteNome(result.getString("nome_cliente"));
                venda.setNumero_venda(result.getInt("venda_id"));
                venda.setData(result.getDate("data_venda"));
                venda.setValorTotal(result.getDouble("total_venda"));
                venda.setCliente_id(result.getInt("cliente_id"));
                venda.setHora(result.getString("hora_venda"));
                listaVenda.add(venda);
            }
        } catch (Exception ex) {
            ex.printStackTrace();

        } finally {
            if (result != null && !result.isClosed()) {
                result.close();
            }
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
        return listaVenda;
    }

    public static List<Venda> procurarDataVenda(Date data_inicial, Date data_final) throws SQLException, Exception {
        String sql = "SELECT * FROM VENDA WHERE (data_venda) BETWEEN '" + data_inicial + "' AND '" + data_final + "'";

        List<Venda> listaVenda = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        try {
            connection = ConnectionUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            result = preparedStatement.executeQuery();

            while (result.next()) {
                if (listaVenda == null) {
                    listaVenda = new ArrayList<Venda>();
                }
                Venda venda = new Venda();
                venda.setClienteNome(result.getString("nome_cliente"));
                venda.setNumero_venda(result.getInt("venda_id"));
                venda.setData(result.getDate("data_venda"));
                venda.setValorTotal(result.getDouble("total_venda"));
                venda.setCliente_id(result.getInt("cliente_id"));
                venda.setHora(result.getString("hora_venda"));
                listaVenda.add(venda);
            }
        } catch (Exception ex) {
            ex.printStackTrace();

        } finally {
            if (result != null && !result.isClosed()) {
                result.close();
            }
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
        return listaVenda;
    }

}
