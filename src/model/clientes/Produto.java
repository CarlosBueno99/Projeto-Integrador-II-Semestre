package model.clientes;



//Classe de negócio do produto
public class Produto {
    private Integer id;
    private String nome;
    private String marca;
    private String modelo;
    private String categoria;
    private String descricao;
    private String ano_fabricacao;
    private int quantidade;
    private double preco;
    private int cod_barras;
    
    //Métodos de acesso 
    // --------------getters-------------
    
    public Integer getId(){
        return id;
    }
    public int getCod_barras(){
        return cod_barras;
    }
    public String getNome(){
        return nome;
    }
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public String getCategoria(){
        return categoria;
    }
    public String getDescricao(){
        return descricao;
    }
    public String getAno_fabricacao(){
        return ano_fabricacao;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public double getPreco(){
        return preco;
    }
    //-----------------------fim-dos-getters-------------
    //-----------------------setters---------------------
    public void setId(Integer id){
        this.id = id;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setcod_barras(int cod_barras){
        this.cod_barras = cod_barras;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    public void setDescricao (String descricao){
        this.descricao = descricao;
    }
    public void setAno_fabricacao(String ano_fabricacao){
        this.ano_fabricacao = ano_fabricacao;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
}
