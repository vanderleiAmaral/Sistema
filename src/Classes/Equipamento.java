/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import java.text.DateFormat;
import java.util.Calendar;


/**
 *
 * @author Tiago
 */
public class Equipamento {
    
    private int codigo;
    private String descrisao;
    private String marca;
    private boolean ativo = true;
    private boolean disponivel  = true;
    private Calendar dataInclusao;
    private double valorDiaria;
    private String grupo;

    public Equipamento(int codigo, String descrisao, String marca, boolean ativo, boolean disponivel, Calendar dataInclusao, double valorDiaria, String grupo) {
        this.codigo = codigo;
        this.descrisao = descrisao;
        this.marca = marca;
        this.ativo = ativo;
        this.disponivel = disponivel;
        this.dataInclusao = dataInclusao;
        this.valorDiaria = valorDiaria;
        this.grupo = grupo;
    }   
    
    public Object[] getDados(){
    DateFormat df= DateFormat.getDateInstance(DateFormat.MEDIUM);
    Calendar i = Calendar.getInstance();
    i.setTime(dataInclusao.getTime());
    String Inclusao = df.format(i.getTime());        
    Object vet[]= {codigo,descrisao,marca,ativo,disponivel,Inclusao,valorDiaria,grupo};
        
        return vet;
    }
    
    public void DarBaixa() {
        ativo = false;
    }

    public void Alugar(){
        disponivel = false;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

  
    public String getDescrisao() {
        return descrisao;
    }

    public void setDescrisao(String descrisao) {
        this.descrisao = descrisao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
    
    public Calendar getDataInclusao() {
        return dataInclusao;
    }

    public void setDataInclusao(Calendar dataInclusao) {
        this.dataInclusao = dataInclusao;
    }
        
}
