/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mock;

import interfaces.Gerenciamento_vendas;
import java.util.ArrayList;
import java.util.List;
import model.clientes.Produto;

public class Mock_Produtos {
    private static int totalQuartos = 0;
    private static List<Produto> listaProdutos = new ArrayList<Produto>();

    //Insere um quarto no mock "quarto"
    public static void inserir(Produto quarto)
            throws Exception {
        quarto.setId(totalQuartos++);
        listaProdutos.add(quarto);
    }

    //Realiza a atualização dos dados de um quarto, com ID e dados
    //fornecidos como parâmetro através de um objeto da classe "Quarto"
    public static void atualizar(Produto produtoProcura)
            throws Exception {
        if (produtoProcura != null && produtoProcura.getId() != null && !listaProdutos.isEmpty()) {
            for (Produto produtoCli : listaProdutos) {
                if (produtoCli != null && produtoCli.getId() == produtoProcura.getId()) {
                    produtoCli.setMarca(produtoProcura.getMarca());
                    produtoCli.setModelo(produtoProcura.getModelo());
                    produtoCli.setCategoria(produtoProcura.getCategoria());
                    produtoCli.setDescricao(produtoProcura.getDescricao());
                    produtoCli.setQuantidade(produtoProcura.getQuantidade());
                    produtoCli.setPreco(produtoProcura.getPreco());
                    break;
                }
            }
        }
    }
    public static void excluir(Integer id) throws Exception {
        if (id != null && !listaProdutos.isEmpty()) {
            for (int i = 0; i < listaProdutos.size(); i++) {
                Produto quartoLi = listaProdutos.get(i);
                if (quartoLi != null && quartoLi.getId() == id) {
                    listaProdutos.remove(i);
                    break;
                }
            }
        }
    }
    
    public static List<Produto> listar()
            throws Exception {        
        return listaProdutos;
    }
    
    public static List<Produto> procurar(String valor)
            throws Exception {
        List<Produto> listaResultado = new ArrayList<Produto>();
        if (valor != null && !listaProdutos.isEmpty()) {
            for (Produto produtoLi : listaProdutos) {
                if (produtoLi != null && produtoLi.getId()!= null &&
                    produtoLi.getNome() != null && produtoLi.getCategoria() != null) {
                    if (produtoLi.getNome() == valor ||
                        produtoLi.getNome().toUpperCase().contains(valor.toUpperCase()) ){
                        listaResultado.add(produtoLi);
                    }
                }
            }
        }
        return listaResultado;
    }
    
    public static List<Produto> procurarTipo(String valor)
            throws Exception {
        List<Produto> listaResultado = new ArrayList<Produto>();
        if (valor != null && !listaProdutos.isEmpty()) {
            for (Produto produtoLi : listaProdutos) {
                if (produtoLi != null && produtoLi.getId()!= null &&
                    produtoLi.getNome() != null && produtoLi.getCategoria() != null) {
                    if (produtoLi.getCategoria() == valor ||produtoLi.getCategoria().toLowerCase().equals(valor.toLowerCase()) ){
                        listaResultado.add(produtoLi);
                    }
                }
            }
        }
        return listaResultado;
    }
    
    public static List<Produto> procurarId(String v)
            throws Exception {
        Integer valor = Integer.parseInt(v);
        List<Produto> listaResultado = new ArrayList<Produto>();
        if (valor != null && !listaProdutos.isEmpty()) {
            for (Produto produtoLi : listaProdutos) {
                if (produtoLi != null && produtoLi.getId()!= null &&
                    produtoLi.getNome() != null && produtoLi.getCategoria() != null) {
                    if (produtoLi.getId() == valor ){
                        listaResultado.add(produtoLi);
                    }
                }
            }
        }
        return listaResultado;
    }
    public static Produto obter(Integer id)
            throws Exception {
        if (id != null && !listaProdutos.isEmpty()) {
            for (int i = 0; i < listaProdutos.size(); i++) {
                if (listaProdutos.get(i) != null && listaProdutos.get(i).getId() == id) {
                    return listaProdutos.get(i);
                }                
            }
        }
        return null;
    }
}
