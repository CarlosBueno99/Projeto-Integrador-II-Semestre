/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.clientes;
import exceptions.ProdutoException;
import model.clientes.Produto;

public class ValidadorProduto {
    public static void validarProduto(Produto Produto) throws ProdutoException {
        if (Produto == null){
            throw new ProdutoException("Não foi informado um produto.");
        }
        else if (Produto.getNome()== null || Produto.getNome().equals("")){
            throw new ProdutoException("Não foi informado um nome.");
        }
        else if (Produto.getMarca()== null || Produto.getMarca().equals("")){
            throw new ProdutoException("Não foi informada uma marca para o produto");
        }
        else if (Produto.getModelo()==null || Produto.getModelo().equals("")){
            throw new ProdutoException("Não foi informado um modelo para o produto.");
        }
        else if (Produto.getCategoria() == null || Produto.getCategoria().equals("Selecione")){
            throw new ProdutoException("Não foi informada uma categoria para o produto.");
        }
        else if (Produto.getAno_fabricacao()== null || Produto.getAno_fabricacao().equals("    .")){
            throw new ProdutoException("Não foi informado um ano de fabricação.");
        }
        else if (Produto.getDescricao()== null || Produto.getDescricao().equals("")){
            throw new ProdutoException("Não foi informada uma descrição para o produto.");
        }
        else if (Produto.getQuantidade() <= 0){
            throw new ProdutoException("Não foi informado uma quantidade para o produto.");
        }
        else if(Produto.getPreco()<= 0){
            throw new ProdutoException("Não foi informado um preço para o produto.");
        }
        
        
    }
}
