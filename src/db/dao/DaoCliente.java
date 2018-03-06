package db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.clientes.Cliente;

public class DaoCliente {
    public static void inserir(Cliente cliente)
    throws SQLException, Exception{
        String sql = "INSERT INTO CLIENTE (nome, rg, cpf, data_nascimento, sexo, cep, endereco, numero_casa,"
                + " complemento, bairro, cidade, UF, telefone, celular, email, enabled) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?)";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try{
            connection = ConnectionUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, cliente.getNome());
            preparedStatement.setString(2, cliente.getRG());
            preparedStatement.setString(3, cliente.getCPF());
            preparedStatement.setString(4, cliente.getData_nascimento());
            preparedStatement.setString(5, cliente.getGenero());
 preparedStatement.setString(6, cliente.getCEP());
            preparedStatement.setString(7, cliente.getEndereco());
            preparedStatement.setString(8, cliente.getN_casa());
            preparedStatement.setString(9, cliente.getComplemento());
            preparedStatement.setString(10, cliente.getBairro());
            preparedStatement.setString(11, cliente.getCidade());
            preparedStatement.setString(12, cliente.getUF());
            preparedStatement.setString(13, cliente.getTelefone_casa());
            preparedStatement.setString(14, cliente.getTelefone_celular());
            preparedStatement.setString(15, cliente.getEmail());
            preparedStatement.setBoolean(16, true);
            
            preparedStatement.execute();
        }finally{
            if (preparedStatement != null && !preparedStatement.isClosed()){
                preparedStatement.close();
            }
            if (connection != null && !connection.isClosed()){
                connection.close();
            }
        }
    }
    
    
    public static void atualizar(Cliente cliente)
    throws SQLException, Exception{
        String sql = "UPDATE CLIENTE SET nome = ?, rg = ?, cpf = ?, data_nascimento = ?, sexo = ?, endereco = ?, numero_casa = ?, complemento = ?, "
                + "bairro = ?, cidade = ?, UF = ?, telefone = ?, celular = ?, email = ?, cep = ? WHERE (cliente_id = ?)";
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try{
        connection = ConnectionUtils.getConnection();
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString (1, cliente.getNome());
        preparedStatement.setString (2, cliente.getRG());
        preparedStatement.setString (3, cliente.getCPF());
        preparedStatement.setString (4, cliente.getData_nascimento());
        preparedStatement.setString (5, cliente.getGenero());
        preparedStatement.setString(6, cliente.getCEP());
        preparedStatement.setString(7, cliente.getEndereco());
        preparedStatement.setString(8, cliente.getN_casa());
        preparedStatement.setString(9, cliente.getComplemento());
        preparedStatement.setString(10, cliente.getBairro());
        preparedStatement.setString(11, cliente.getCidade());
        preparedStatement.setString(12, cliente.getUF());
        preparedStatement.setString(13, cliente.getTelefone_casa());
        preparedStatement.setString(14, cliente.getTelefone_celular());
        preparedStatement.setString(15, cliente.getEmail());
        preparedStatement.setInt    (16, cliente.getId());
        
        preparedStatement.execute();
        
        }finally{
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }
    
    public static List<Cliente> procurarNome (String valor)
            throws SQLException, Exception{
        String sql = "SELECT * FROM CLIENTE WHERE ((UPPER(nome) LIKE UPPER(?)) "
            + " AND enabled=?)";
        List<Cliente> listaClientes = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        try{
           connection = ConnectionUtils.getConnection();
           preparedStatement = connection.prepareStatement(sql);
           preparedStatement.setString  (1, "%" + valor + "%");
           preparedStatement.setBoolean (2, true);
           
           result = preparedStatement.executeQuery();
           
           while (result.next()){
               if(listaClientes == null){
                  listaClientes = new ArrayList<Cliente>();
               }
               
               Cliente cliente = new Cliente();
               cliente.setId(result.getInt("cliente_id"));
               cliente.setNome(result.getString("nome"));
               cliente.setRG(result.getString("rg"));
               cliente.setCPF(result.getString("cpf"));
               cliente.setData_nascimento(result.getString("data_nascimento"));
               cliente.setGenero(result.getString("sexo"));
               cliente.setCEP(result.getString("cep"));
               cliente.setEndereco(result.getString("endereco"));
               cliente.setN_casa(result.getString("numero_casa"));
               cliente.setComplemento(result.getString("complemento"));
               cliente.setBairro(result.getString("bairro"));
               cliente.setCidade(result.getString("cidade"));
               cliente.setUF(result.getString("UF"));
               cliente.setTelefone_casa(result.getString("telefone"));
               cliente.setTelefone_celular(result.getString("celular"));
               cliente.setEmail(result.getString("email"));
               listaClientes.add(cliente);
           }
        }finally{
        
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
     return listaClientes;    
    }
    
    public static List<Cliente> listar()
            throws SQLException, Exception{
    
        String  sql = "SELECT * FROM CLIENTE WHERE (enabled = ?)";
        List<Cliente> listaClientes = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        
        try {
        
            connection = ConnectionUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setBoolean(1, true);
            result = preparedStatement.executeQuery();
            
            while (result.next()){
            if (listaClientes == null){
                listaClientes = new ArrayList<Cliente>();
            }
               Cliente cliente = new Cliente();
               cliente.setId(result.getInt("cliente_id"));
               cliente.setNome(result.getString("nome"));
               cliente.setRG(result.getString("rg"));
               cliente.setCPF(result.getString("cpf"));
               cliente.setData_nascimento(result.getString("data_nascimento"));
               cliente.setGenero(result.getString("sexo"));
               cliente.setCEP(result.getString("cep"));
               cliente.setEndereco(result.getString("endereco"));
               cliente.setN_casa(result.getString("numero_casa"));
               cliente.setComplemento(result.getString("complemento"));
               cliente.setBairro(result.getString("bairro"));
               cliente.setCidade(result.getString("cidade"));
               cliente.setUF(result.getString("UF"));
               cliente.setTelefone_casa(result.getString("telefone"));
               cliente.setTelefone_celular(result.getString("celular"));
               cliente.setEmail(result.getString("email"));
               listaClientes.add(cliente);
            }
        } finally{
        
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
        return listaClientes;
    }
    
    public static void excluir (Integer id)throws SQLException, Exception{
        String sql = "UPDATE CLIENTE SET enabled = ? WHERE (cliente_id = ? )";
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try{
            connection = ConnectionUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setBoolean (1, false);
            preparedStatement.setInt (2, id);
            
            preparedStatement.execute();
        }finally{
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }
    
    public static Cliente obter (Integer id) throws SQLException, Exception {
        
        String sql = "SELECT * FROM CLIENTE WHERE (cliente_id = ? AND enabled = ?)";
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        
        try {
            
            connection = ConnectionUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt     (1, id);
            preparedStatement.setBoolean (2, true);
            result = preparedStatement.executeQuery();
            if (result.next()){
               Cliente cliente = new Cliente();
               cliente.setId(result.getInt("cliente_id"));
               cliente.setNome(result.getString("nome"));
               cliente.setRG(result.getString("rg"));
               cliente.setCPF(result.getString("cpf"));
               cliente.setData_nascimento(result.getString("data_nascimento"));
               cliente.setGenero(result.getString("sexo"));
               cliente.setCEP(result.getString("cep"));
               cliente.setEndereco(result.getString("endereco"));
               cliente.setN_casa(result.getString("numero_casa"));
               cliente.setComplemento(result.getString("complemento"));
               cliente.setBairro(result.getString("bairro"));
               cliente.setCidade(result.getString("cidade"));
               cliente.setUF(result.getString("UF"));
               cliente.setTelefone_casa(result.getString("telefone"));
               cliente.setTelefone_celular(result.getString("celular"));
               cliente.setEmail(result.getString("email"));
                
            return cliente;
            
            }
        } finally{
        if (result != null && !result.isClosed()) {
                result.close();
            }
            //Se o statement ainda estiver aberto, realiza seu fechamento
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            //Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    return null;
    }
    
    public static List<Cliente> procurarCPF (String valor)
            throws SQLException, Exception{
        String sql = "SELECT * FROM CLIENTE WHERE (cpf) LIKE (?)"
                + "AND enabled = ?";
        List<Cliente> listaClientes = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        try{
           connection = ConnectionUtils.getConnection();
           preparedStatement = connection.prepareStatement(sql);
           preparedStatement.setString  (1, "%" + valor + "%");
           preparedStatement.setBoolean (2, true);
           
           result = preparedStatement.executeQuery();
           
           while (result.next()){
               if(listaClientes == null){
                  listaClientes = new ArrayList<Cliente>();
               }
               
               Cliente cliente = new Cliente();
               cliente.setId(result.getInt("cliente_id"));
               cliente.setNome(result.getString("nome"));
               cliente.setRG(result.getString("rg"));
               cliente.setCPF(result.getString("cpf"));
               cliente.setData_nascimento(result.getString("data_nascimento"));
               cliente.setGenero(result.getString("sexo"));
               cliente.setCEP(result.getString("cep"));
               cliente.setEndereco(result.getString("endereco"));
               cliente.setN_casa(result.getString("numero_casa"));
               cliente.setComplemento(result.getString("complemento"));
               cliente.setBairro(result.getString("bairro"));
               cliente.setCidade(result.getString("cidade"));
               cliente.setUF(result.getString("UF"));
               cliente.setTelefone_casa(result.getString("telefone"));
               cliente.setTelefone_celular(result.getString("celular"));
               cliente.setEmail(result.getString("email"));
               listaClientes.add(cliente);
           }
        }finally{
        
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
     return listaClientes;    
    }
    
    
}