package model.clientes;



public class Cliente {
    //atributdos do cliente
    private Integer id;
    private String nome;
    private String RG;
    private String CPF;
    private String endereco;
    private String n_casa;
    private String CEP;
    private String complemento;
    private String bairro;
    private String cidade;
    private String UF;
    private String telefone_casa;
    private String telefone_celular;
    private String email;
    private String data_nascimento;
    private String genero;
    
    //métodos de acesso
    //getters
    public Integer getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
    public String getRG(){
        return RG;
    }
    public String getCPF(){
        return CPF;
    }
    public String getEndereco(){
        return endereco;
    }
    public String getN_casa(){
        return n_casa;
    }
    public String getCEP(){
        return CEP;
    }
    public String getComplemento(){
        return complemento;
    }
    public String getBairro(){
        return bairro;
    }
    public String getCidade(){
        return cidade;
    }
    public String getUF(){
        return UF;
    }
    public String getTelefone_casa(){
        return telefone_casa;
    }
    public String getTelefone_celular(){
        return telefone_celular;
    }
    public String getEmail(){
        return email;
    }
    public String getGenero(){
        return genero;
    }
    public String getData_nascimento(){
        return data_nascimento;
    }
    //--------------------fim dos getters--------------------------
    //--------------------setters----------------------------------
    public void setId(Integer id){
        this.id = id;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setRG(String RG){
        this.RG = RG;
    }
    public void setCPF(String CPF){
        this.CPF = CPF;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public void setN_casa(String n_casa){
        this.n_casa = n_casa;
    }
    public void setCEP(String CEP){
        this.CEP = CEP;
    }
    public void setComplemento(String complemento){
        this.complemento = complemento;
    }
    public void setBairro (String bairro){
        this.bairro = bairro;
    }
    public void setCidade (String cidade){
        this.cidade = cidade;
    }
    public void setUF (String UF){
        this.UF = UF;
    }
    public void setTelefone_casa (String telefone_casa){
        this.telefone_casa = telefone_casa;
    }
    public void setTelefone_celular (String telefone_celular){
        this.telefone_celular = telefone_celular;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setGenero (String genero){
        this.genero = genero;
    }
    public void setData_nascimento (String data_nascimento){
        this.data_nascimento = data_nascimento;
    }
}
