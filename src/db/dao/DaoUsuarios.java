package db.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.clientes.Usuario;

public class DaoUsuarios {

    public static void inserir(Usuario usuario)
            throws SQLException, Exception {
        String sql = "INSERT INTO USUARIOS (nome, cargo, senha, enabled) VALUES (?, ?, ?, ?)";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = ConnectionUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, usuario.getNome());
            preparedStatement.setString(2, usuario.getCargo());
            preparedStatement.setString(3, usuario.getSenha());
            preparedStatement.setBoolean(4, true);

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

    public static void atualizar(Usuario usuario) throws SQLException, Exception {
        String sql = "UPDATE USUARIOS SET nome = ?, cargo = ?, senha = ? WHERE (usuario_id = ?)";
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, usuario.getNome());
            preparedStatement.setString(2, usuario.getCargo());
            preparedStatement.setString(3, usuario.getSenha());
            preparedStatement.setInt(4, usuario.getId());
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

    public static List<Usuario> procurarNome(String valor) throws SQLException, Exception {
        String sql = "SELECT * FROM USUARIOS WHERE ((UPPER(nome) LIKE UPPER (?)) AND enabled = ?)";
        List<Usuario> listaUsuario = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        try {
            connection = ConnectionUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "%" + valor + "%");
            preparedStatement.setBoolean(2, true);
            result = preparedStatement.executeQuery();
            while (result.next()) {
                if (listaUsuario == null) {
                    listaUsuario = new ArrayList<Usuario>();
                }
                Usuario usuario = new Usuario();
                usuario.setId(result.getInt("usuario_id"));
                usuario.setNome(result.getString("nome"));
                usuario.setCargo(result.getString("cargo"));
                usuario.setSenha(result.getString("senha"));
                listaUsuario.add(usuario);
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
        return listaUsuario;
    }

    public static List<Usuario> listar() throws SQLException, Exception {

        String sql = "SELECT * FROM USUARIOS WHERE (enabled = ?)";
        List<Usuario> listaUsuario = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;

        try {
            connection = ConnectionUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setBoolean(1, true);
            result = preparedStatement.executeQuery();

            while (result.next()) {
                if (listaUsuario == null) {
                    listaUsuario = new ArrayList<Usuario>();
                }
                Usuario usuario = new Usuario();

                usuario.setId(result.getInt("usuario_id"));
                usuario.setNome(result.getString("nome"));
                usuario.setCargo(result.getString("cargo"));
                usuario.setSenha(result.getString("senha"));
                listaUsuario.add(usuario);
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
        return listaUsuario;
    }

    public static void excluir(Integer id) throws SQLException, Exception {
        String sql = "UPDATE USUARIOS SET enabled = ? WHERE (usuario_id = ?)";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = ConnectionUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setBoolean(1, false);
            preparedStatement.setInt(2, id);

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

    public static Usuario obter(Integer id) throws SQLException, Exception {
        String sql = "SELECT * FROM USUARIOS WHERE (usuario_id = ? AND enabled = ?)";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        
        try {
            connection = ConnectionUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt     (1, id);
            preparedStatement.setBoolean (2, true);
            result = preparedStatement.executeQuery();
            
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
    
    public static List<Usuario> VerificaSenha(String usr, String senha) throws SQLException, Exception {
        String sql = "SELECT * FROM USUARIOS WHERE ((UPPER(nome) LIKE UPPER (?) AND UPPER(senha) LIKE UPPER (?)) AND enabled = ?)";
        List<Usuario> listaUsuario = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        try {
            connection = ConnectionUtils.getConnection();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "%" + usr + "%");
            preparedStatement.setString(2, "%" + senha + "%");
            preparedStatement.setBoolean(3, true);
            result = preparedStatement.executeQuery();
            while (result.next()) {
                if (listaUsuario == null) {
                    listaUsuario = new ArrayList<Usuario>();
                }
                Usuario usuario = new Usuario();
                usuario.setId(result.getInt("usuario_id"));
                usuario.setNome(result.getString("nome"));
                usuario.setCargo(result.getString("cargo"));
                usuario.setSenha(result.getString("senha"));
                listaUsuario.add(usuario);
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
        return listaUsuario;
    }
    
    
}
