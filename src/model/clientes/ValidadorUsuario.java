package model.clientes;
import exceptions.UsuarioException;
import model.clientes.Usuario;

public class ValidadorUsuario {
    
    public static void validar(Usuario Usuario) throws UsuarioException{
            if (Usuario == null) {
            throw new UsuarioException("Não foi informado um usuário");
        }
        else if (Usuario.getNome() == null || "".equals(Usuario.getNome())) {
            throw new UsuarioException("É necessário informar "
                    + "um nome de usuario");
        }
       else  if (Usuario.getCargo() == null
                || "".equals(Usuario.getCargo())) {
            throw new UsuarioException("É necessário informar um "
                    + "cargo para o usuário.");
        }
      else   if (Usuario.getSenha() == null ) {
            throw new UsuarioException("É necessário informar uma "
                    + "senha de acesso.");
        }
    }
}