/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Calendar;

/**
 *
 * @author vanderlei
 */
public class Cliente implements Serializable{
    private int codigo;
    private String nome;
    private String cpf;
    private String identidade;
    private String rua;
    private String numero;
    private String bairro;
    private String municipio;
    private String cep;
    private String uf;
    private String telefone;
    private String email;
    private Calendar dataInclusao;
    private Calendar dataNascimento;
    private boolean ativo;

    public Cliente(int codigo, String nome, String cpf, String identidade, String rua, String numero, String bairro, String municipio, String cep, String uf, String telefone, String email, Calendar dataInclusao, Calendar dataNascimento, boolean ativo) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.identidade = identidade;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.municipio = municipio;
        this.cep = cep;
        this.uf = uf;
        this.telefone = telefone;
        this.email = email;
        this.dataInclusao = dataInclusao;
        this.dataNascimento = dataNascimento;
        this.ativo = ativo;
    }

    public Object[] getDados(){
    DateFormat df= DateFormat.getDateInstance(DateFormat.MEDIUM);
    Calendar c = Calendar.getInstance(), i = Calendar.getInstance();
    c.setTime(dataNascimento.getTime());
    i.setTime(dataInclusao.getTime());
    String Nascimento= df.format(c.getTime());
    String Inclusao= df.format(i.getTime());        
    Object vet[]= {codigo,nome,cpf,identidade,Nascimento,telefone,email,Inclusao,rua,bairro,municipio,uf};
        
        return vet;
    }
    
    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Calendar getDataInclusao() {
        return dataInclusao;
    }

    public void setDataInclusao(Calendar dataInclusao) {
        this.dataInclusao = dataInclusao;
    }

    public Calendar getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Calendar dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdentidade() {
        return identidade;
    }

    public void setIdentidade(String identidade) {
        this.identidade = identidade;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

}
