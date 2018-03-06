/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.clientes;

/**
 *
 * @author I864970
 */
public class Usuario {
    private String nome;
    private String cargo;
    private String senha;
    private Integer id;
    
    
    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }
            
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCargo(){
        return cargo;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    public String getSenha(){
        return senha;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
}
