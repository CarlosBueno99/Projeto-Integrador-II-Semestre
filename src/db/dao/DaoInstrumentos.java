package db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.clientes.Produto;

public class DaoInstrumentos {
    public static void inserir(Produto produto)
    throws SQLException, Exception{
    
        String sql = "INSERT INTO INSTRUMENTO (nome, marca, modelo, categoria, ano_fabricacao, "
                + "descricao, quantidade_estoque, valor_unitario, cod_barras, enabled) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
        
        connection = ConnectionUtils.getConnection();
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, produto.getNome());
        preparedStatement.setString(2, produto.getMarca());
        preparedStatement.setString(3, produto.getModelo());
        preparedStatement.setString(4, produto.getCategoria());
        preparedStatement.setString(5, produto.getAno_fabricacao());
        preparedStatement.setString(6, produto.getDescricao());
        preparedStatement.setInt   (7, produto.getQuantidade());
        preparedStatement.setDouble(8, produto.getPreco());
        preparedStatement.setInt   (9, produto.getCod_barras());       
        preparedStatement.setBoolean(10, true);
        preparedStatement.execute();
        
        }finally{
            if(preparedStatement != null && !preparedStatement.isClosed()){
                preparedStatement.close();
            }if (connection != null && !connection.isClosed()){
                connection.close();
            }
         }
     }
    public static void excluir (Integer id) throws SQLException, Exception{
    
        String sql = "UPDATE INSTRUMENTO SET enabled = ? WHERE (instrumento_id = ?)";
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = ConnectionUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setBoolean(1, false);
            preparedStatement.setInt(2, id);
            
            preparedStatement.execute();
        } finally{
             if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    public static Produto obter (Integer id) throws SQLException, Exception{
        String sql = "SELECT * FROM INSTRUMENTO WHERE (instrumento_id = ? AND enabled = ?)";
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        
        try {
        connection = ConnectionUtils.getConnection();
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        preparedStatement.setBoolean (2, true);
        result = preparedStatement.executeQuery();
        if(result.next()){
            Produto produto = new Produto();
            produto.setId(result.getInt("instrumento_id"));
            produto.setNome(result.getString("nome"));
            produto.setMarca(result.getString("marca"));
            produto.setModelo(result.getString("modelo"));
            produto.setCategoria(result.getString("categoria"));
            produto.setAno_fabricacao(result.getString("ano_fabricacao"));
            produto.setDescricao(result.getString("descricao"));
            produto.setQuantidade(result.getInt("quantidade_estoque"));
            produto.setPreco(result.getDouble("valor_unitario"));
        
            return produto;
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
    return null;
    }

    public static List<Produto> procurarTipo (String valor)
    throws SQLException,Exception{
        String sql = "SELECT * FROM INSTRUMENTO WHERE ((UPPER(categoria) LIKE UPPER(?))AND enabled = ?)";
        List<Produto> listaProdutos = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        
        try {
           connection = ConnectionUtils.getConnection();
           preparedStatement = connection.prepareStatement(sql);
           preparedStatement.setString  (1, "%" + valor + "%");
           preparedStatement.setBoolean (2, true);
           
           result = preparedStatement.executeQuery();
           while (result.next()){
               if (listaProdutos == null){
                   listaProdutos = new ArrayList<Produto>();
               }
            Produto produto = new Produto();
            produto.setId(result.getInt("instrumento_id"));
            produto.setNome(result.getString("nome"));
            produto.setMarca(result.getString("marca"));
            produto.setModelo(result.getString("modelo"));
            produto.setCategoria(result.getString("categoria"));
            produto.setAno_fabricacao(result.getString("ano_fabricacao"));
            produto.setDescricao(result.getString("descricao"));
            produto.setQuantidade(result.getInt("quantidade_estoque"));
            produto.setPreco(result.getDouble("valor_unitario"));
            
            listaProdutos.add(produto);
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
        return listaProdutos;
    }
    
    public static List<Produto> procurarNome (String valor)
    throws SQLException,Exception{
        String sql = "SELECT * FROM INSTRUMENTO WHERE ((UPPER(nome) LIKE UPPER(?)) AND enabled = ?)";
        List<Produto> listaProdutos = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        
        try {
           connection = ConnectionUtils.getConnection();
           preparedStatement = connection.prepareStatement(sql);
           preparedStatement.setString  (1, "%" + valor + "%");
           preparedStatement.setBoolean (2,true);
           
           result = preparedStatement.executeQuery();
           while (result.next()){
               if (listaProdutos == null){
                   listaProdutos = new ArrayList<Produto>();
               }
            
            Produto produto = new Produto();
            produto.setId(result.getInt("instrumento_id"));
            produto.setNome(result.getString("nome"));
            produto.setMarca(result.getString("marca"));
            produto.setModelo(result.getString("modelo"));
            produto.setCategoria(result.getString("categoria"));
            produto.setAno_fabricacao(result.getString("ano_fabricacao"));
            produto.setDescricao(result.getString("descricao"));
            produto.setQuantidade(result.getInt("quantidade_estoque"));
            produto.setPreco(result.getDouble("valor_unitario"));
            
            listaProdutos.add(produto);
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
    
        return listaProdutos;
    }
    
    public static List<Produto> listar() throws SQLException, Exception{
    
        String sql = "SELECT * FROM INSTRUMENTO WHERE (enabled = ?)";
        List<Produto> listaProdutos = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        
      try{
            connection = ConnectionUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setBoolean(1, true);
            result = preparedStatement.executeQuery();
            
           while (result.next()){
           
               if (listaProdutos == null){
                   listaProdutos = new ArrayList<Produto>();
               }
            
            Produto produto = new Produto();
            produto.setId(result.getInt("instrumento_id"));
            produto.setNome(result.getString("nome"));
            produto.setMarca(result.getString("marca"));
            produto.setModelo(result.getString("modelo"));
            produto.setCategoria(result.getString("categoria"));
            produto.setAno_fabricacao(result.getString("ano_fabricacao"));
            produto.setDescricao(result.getString("descricao"));
            produto.setQuantidade(result.getInt("quantidade_estoque"));
            produto.setPreco(result.getDouble("valor_unitario"));
            
            listaProdutos.add(produto);
           
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
      return listaProdutos;
      }
    
   public static void atualizar (Produto produto) throws SQLException, Exception{
   
       String sql = "UPDATE INSTRUMENTO SET nome = ?, marca = ?, modelo = ?, categoria = ?, ano_fabricacao = ?, descricao = ?, quantidade_estoque = ?, valor_unitario = ?"
               + "WHERE (instrumento_id = ?)";
       Connection connection = null;
       PreparedStatement preparedStatement = null;
       try{
        connection = ConnectionUtils.getConnection();
        preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, produto.getNome());
        preparedStatement.setString(2, produto.getMarca());
        preparedStatement.setString(3, produto.getModelo());
        preparedStatement.setString(4, produto.getCategoria());
        preparedStatement.setString(5, produto.getAno_fabricacao());
        preparedStatement.setString(6, produto.getDescricao());
        preparedStatement.setInt   (7, produto.getQuantidade());
        preparedStatement.setDouble(8, produto.getPreco());
        preparedStatement.setBoolean(9, true);       
        
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
   
   
   public static List<Produto> procurarID (int valor)
    throws SQLException,Exception{
        String sql = "SELECT * FROM INSTRUMENTO WHERE ((instrumento_id) LIKE UPPER(?) AND enabled = ?)";
        List<Produto> listaProdutos = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        
        try {
           connection = ConnectionUtils.getConnection();
           preparedStatement = connection.prepareStatement(sql);
           preparedStatement.setString  (1, "%" + valor + "%");
           preparedStatement.setBoolean (2,true);
           
           result = preparedStatement.executeQuery();
           while (result.next()){
               if (listaProdutos == null){
                   listaProdutos = new ArrayList<Produto>();
               }
            
            Produto produto = new Produto();
            produto.setId(result.getInt("instrumento_id"));
            produto.setNome(result.getString("nome"));
            produto.setMarca(result.getString("marca"));
            produto.setModelo(result.getString("modelo"));
            produto.setCategoria(result.getString("categoria"));
            produto.setAno_fabricacao(result.getString("ano_fabricacao"));
            produto.setDescricao(result.getString("descricao"));
            produto.setQuantidade(result.getInt("quantidade_estoque"));
            produto.setPreco(result.getDouble("valor_unitario"));
            
            listaProdutos.add(produto);
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
    
        return listaProdutos;
    }
   
   
   
   
   
   
   
   
   
}
    

