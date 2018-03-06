
package service;

import db.dao.DaoUsuarios;
import exceptions.DataSourceException;
import exceptions.UsuarioException;
import java.util.List;
import model.clientes.Usuario;
import model.clientes.ValidadorUsuario;


public class ServiceUsuario {
    public static void cadastrarUsuario(Usuario usuario)
            throws UsuarioException, DataSourceException {
             ValidadorUsuario.validar(usuario);
        try {
            DaoUsuarios.inserir(usuario);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    public static void atualizarUsuario(Usuario usuario)
            throws UsuarioException, DataSourceException {
        ValidadorUsuario.validar(usuario);
        try {
            DaoUsuarios.atualizar(usuario);
            return;
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    public static List<model.clientes.Usuario> procurarUsuario(String nome)
            throws UsuarioException, DataSourceException {
        try {
            if (nome == null || "".equals(nome) || "Insira o nome do usuario....".equals(nome)) {
                return DaoUsuarios.listar();
            } else {
                return DaoUsuarios.procurarNome(nome);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }
   
    public static List<model.clientes.Usuario> VerificaSenha(String usuario, String senha)
            throws UsuarioException, DataSourceException {
        try {
            if (usuario == null || "".equals(usuario) || "".equals(senha) || senha == null) {
                return null;
            } else {
                return DaoUsuarios.VerificaSenha(usuario,senha);
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    public static model.clientes.Usuario obterUsuario(Integer id)
            throws UsuarioException, DataSourceException {
        try {
            return DaoUsuarios.obter(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }
    public static void excluirUsuario(Integer id)
            throws UsuarioException, DataSourceException {
        try {
            DaoUsuarios.excluir(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }
}
