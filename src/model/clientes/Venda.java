package model.clientes;

import java.util.Date;

public class Venda {

    private String vendedorNome;
    private String clienteNome;
    private String statusVenda;
    private int idVenda;
    private double valorTotal;
    private String cpf;
    private String nomeProduto;
    private String modeloProduto;
    private int quantidade;
    private int numero_venda;
    private Date data;
    private String hora;
    private int usuario_id;
    private int cliente_id;
    private int instrumento_id;

    //---------------------começo dos getters
    public Date getData() {
        return data;
    }

    public int getInstrumento_id() {
        return instrumento_id;
    }

    public int getCliente_id() {
        return cliente_id;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public String getHora() {
        return hora;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public int getNumero_venda() {
        return numero_venda;
    }

    public String getModeloProduto() {
        return modeloProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Integer getIdVenda() {
        return idVenda;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public String getVendedorNome() {
        return vendedorNome;
    }

    public String getClienteNome() {
        return clienteNome;
    }

    public String getStatusVenda() {
        return statusVenda;
    }
    //-----------começo dos setters

    public void setData(Date data) {
        this.data = data;
    }

    public void setInstrumento_id(int instrumento_id) {
        this.instrumento_id = instrumento_id;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public void setNumero_venda(int numero_venda) {
        this.numero_venda = numero_venda;
    }

    public void setVendedorNome(String vendedorNome) {
        this.vendedorNome = vendedorNome;
    }

    public void setClienteNome(String clienteNome) {
        this.clienteNome = clienteNome;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }

    public void setStatusVenda(String statusVenda) {
        this.statusVenda = statusVenda;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setModeloProduto(String modeloProduto) {
        this.modeloProduto = modeloProduto;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
