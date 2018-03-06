package mock;

import model.clientes.Cliente;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Mock_Clientes {
    private static int totalClientes = 0;
    
    private static List<Cliente> listaClientes = new ArrayList<Cliente>();
    
    public static void inserir (Cliente cliente)
            throws Exception {
                cliente.setId(totalClientes++);
                listaClientes.add(cliente);
    }
    
    //Realiza a exclusão de um cliente no mock, com ID fornecido
    //como parâmetro.
      public static void excluir(Integer id) throws Exception {
        if (id != null && !listaClientes.isEmpty()) {
            for (int i = 0; i < listaClientes.size(); i++) {
                Cliente clienteLi = listaClientes.get(i);
                if (clienteLi != null && clienteLi.getId() == id) {
                    listaClientes.remove(i);
                    break;
                }
            }
        }
    }
      
    //Realiza a atualização dos dados de um cliente, com ID e dados
    //fornecidos como parâmetro através de um objeto da classe "Cliente"
      public static void atualizar(Cliente clienteProcura)
            throws Exception {
        if (clienteProcura != null && clienteProcura.getId() != null && !listaClientes.isEmpty()) {
            for (Cliente clienteLi : listaClientes) {
                if (clienteLi != null && Objects.equals(clienteLi.getId(), clienteProcura.getId())) {
                    clienteLi.setGenero(clienteProcura.getGenero());
                    clienteLi.setData_nascimento(clienteProcura.getData_nascimento());
                    clienteLi.setNome(clienteProcura.getNome());
                    clienteLi.setEmail(clienteProcura.getEmail());
                    clienteLi.setTelefone_celular(clienteProcura.getTelefone_celular());
                    clienteLi.setTelefone_casa(clienteProcura.getTelefone_casa());
                    clienteLi.setBairro(clienteProcura.getBairro());
                    clienteLi.setCEP(clienteProcura.getCEP());
                    clienteLi.setCPF(clienteProcura.getCPF());
                    clienteLi.setCidade(clienteProcura.getCidade());
                    clienteLi.setComplemento(clienteProcura.getComplemento());
                    clienteLi.setEndereco(clienteProcura.getEndereco());
                    clienteLi.setN_casa(clienteProcura.getN_casa());
                    clienteLi.setUF(clienteProcura.getUF());                  
                    break;
                }
            }
        }
    }

    public static List<Cliente> listar()
            throws Exception {       
        //Retorna a lista de clientes
        return listaClientes;
    }
    public static List<Cliente> procurar(String valor)
            throws Exception {
        List<Cliente> listaResultado = new ArrayList<Cliente>();
        
        if (valor != null && !listaClientes.isEmpty()) {
            for (Cliente clienteLi : listaClientes) {
                if (clienteLi != null && clienteLi.getCPF() != null) {
                    if (clienteLi.getCPF().toUpperCase().contains(valor.toUpperCase())) {
                        listaResultado.add(clienteLi);
                    }
                }
            }
        }
        return listaResultado;
    }
    public static List<Cliente> procurarNome(String valor)
            throws Exception {
        List<Cliente> listaResultado = new ArrayList<Cliente>();
        
        if (valor != null && !listaClientes.isEmpty()) {
            for (Cliente clienteLi : listaClientes) {
                if (clienteLi != null && clienteLi.getNome() != null) {
                    if (clienteLi.getNome().toUpperCase().contains(valor.toUpperCase())) {
                        listaResultado.add(clienteLi);
                    }
                }
            }
        }
        return listaResultado;
    }

    //Obtém um cliente da lista
    public static Cliente obter(Integer id)
            throws Exception {
        if (id != null && !listaClientes.isEmpty()) {
            for (int i = 0; i < listaClientes.size(); i++) {
                if (listaClientes.get(i) != null && listaClientes.get(i).getId() == id) {
                    return listaClientes.get(i);
                }                
            }
        }
        return null;
    }
}
 