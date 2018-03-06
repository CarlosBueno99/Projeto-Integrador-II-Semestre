package mock;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import model.clientes.Usuario;


public class Mock_Usuario {
    private static int totalUsuarios = 0;
    
    private static List<Usuario> listaUsuarios = new ArrayList<Usuario>();
    
    public static void inserir (Usuario usuario)
            throws Exception {
                usuario.setId(totalUsuarios++);
                listaUsuarios.add(usuario);
    }
    
      public static void excluir(Integer id) throws Exception {
        if (id != null && !listaUsuarios.isEmpty()) {
            for (int i = 0; i < listaUsuarios.size(); i++) {
                Usuario lista = listaUsuarios.get(i);
                if (lista != null && lista.getId() == id) {
                    listaUsuarios.remove(i);
                    break;
                }
            }
        }
    }
      public static void atualizar(Usuario usuarioProcura)
            throws Exception {
        if (usuarioProcura != null && usuarioProcura.getId() != null && !listaUsuarios.isEmpty()) {
            for (Usuario lista : listaUsuarios) {
                if (lista != null && Objects.equals(lista.getId(), usuarioProcura.getId())) {
                    lista.setNome(usuarioProcura.getNome());
                    lista.setCargo(usuarioProcura.getCargo());
                    lista.setSenha(usuarioProcura.getSenha());
                    break;
                }
            }
        }
    }

    public static List<Usuario> listar()
            throws Exception {       
        return listaUsuarios;
    }
    public static List<Usuario> procurar(String valor)
            throws Exception {
        List<Usuario> listaResultado = new ArrayList<Usuario>();
        
        if (valor != null && !listaUsuarios.isEmpty()) {
            for (Usuario lista : listaUsuarios) {
                if (lista != null && lista.getNome() != null) {
                    if (lista.getNome().toUpperCase().contains(valor.toUpperCase())) {
                        listaResultado.add(lista);
                    }
                }
            }
        }
        return listaResultado;
    }
 public static List<Usuario> procurarID(String valor)
            throws Exception {
        List<Usuario> listaResultado = new ArrayList<Usuario>();
        
        if (valor != null && !listaUsuarios.isEmpty()) {
            for (Usuario lista : listaUsuarios) {
                if (lista != null && lista.getNome() != null) {
                    if (lista.getId() == Integer.parseInt(valor)) {
                        listaResultado.add(lista);
                    }
                }
            }
        }
        return listaResultado;
    }
    public static Usuario obter(Integer id)
            throws Exception {
        if (id != null && !listaUsuarios.isEmpty()) {
            for (int i = 0; i < listaUsuarios.size(); i++) {
                if (listaUsuarios.get(i) != null && listaUsuarios.get(i).getId() == id) {
                    return listaUsuarios.get(i);
                }                
            }
        }
        return null;
    }
}
