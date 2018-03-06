package mock;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.clientes.Venda;

public class Mock_Vendas {
    private static int totalVendas = 0;
    
    private static List<Venda> listaVendas = new ArrayList<Venda>();
    
     public static void inserir (Venda vendas)
            throws Exception {
                vendas.setIdVenda(totalVendas++);
                listaVendas.add(vendas);
    }
    public static void excluirVenda(Integer id) throws Exception {
        if (id != null && !listaVendas.isEmpty()) {
            for (int i = 0; i < listaVendas.size(); i++) {
                Venda vendaLi = listaVendas.get(i);
                if (vendaLi != null && vendaLi.getIdVenda() == id) {
                    listaVendas.remove(i);
                    break;
                }
            }
        }
    }
    
     public static List<Venda> listar()
            throws Exception {       
        //Retorna a lista de vendas
        return listaVendas;
    }
     
     public static List<Venda> procurarNomeVendedor(String valor)//procura as vendas feitas por um vendedor,
            throws Exception {//cujo nome é fornecido como parâmetro
        List<Venda> listaResultado = new ArrayList<Venda>();
        
        if (valor != null && !listaVendas.isEmpty()) {
            for (Venda vendaLi : listaVendas) {
                if (vendaLi != null && vendaLi.getVendedorNome() != null) {
                    if (vendaLi.getVendedorNome().toUpperCase().contains(valor.toUpperCase())) {
                        listaResultado.add(vendaLi);
                    }
                }
            }
        }
        return listaResultado;
    }
     
         public static List<Venda> procurarNomeCliente(String valor)//procura as vendas feitas por um cliente,
            throws Exception {//cujo nome é fornecido como parâmetro
        List<Venda> listaResultado = new ArrayList<Venda>();
        
        if (valor != null && !listaVendas.isEmpty()) {
            for (Venda vendaLi : listaVendas) {
                if (vendaLi != null && vendaLi.getClienteNome() != null) {
                    if (vendaLi.getClienteNome().toUpperCase().equals(valor.toUpperCase())) {
                        listaResultado.add(vendaLi);
                    }
                }
            }
        }
        return listaResultado;
    }

    public static List<Venda> procurar(Date data_inicial, Date data_final) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
