/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Calendar;

/**
 *
 * @author Tiago
 */
public class EquipamentoMidia  extends Equipamento {
   
    private String tamanho; // em MB
    private String tipo; // Interno ou Extreno
    private String velocidade; //ex.:7200 RPM ou 56X
    private String tipoLeitura; //DVD SSD HD

 
    public EquipamentoMidia(String tamanho, String tipo, String velocidade, String tipoLeitura, int codigo, String descrisao, String marca, boolean ativo, boolean disponivel, Calendar dataInclusao, double valorDiaria, String grupo) {
        super(codigo, descrisao, marca, ativo, disponivel, dataInclusao, valorDiaria, grupo);
        this.tamanho = tamanho;
        this.tipo = tipo;
        this.velocidade = velocidade;
        this.tipoLeitura = tipoLeitura;
    }
    
    public void alterar(String tamanho, String tipo, String velocidade, String tipoLeitura, int codigo, String descrisao, String marca, Calendar dataInclusao, double valorDiaria, String grupo){
        this.tamanho = tamanho;
        this.tipo = tipo;
        this.velocidade = velocidade;
        this.tipoLeitura = tipoLeitura;
        super.setCodigo(codigo);
        super.setDescrisao(descrisao);
        super.setMarca(marca);
        super.setDataInclusao(dataInclusao);
        super.setValorDiaria(valorDiaria); 
        super.setGrupo(grupo);
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipoLeitura() {
        return tipoLeitura;
    }

    public void setTipoLeitura(String tipoLeitura) {
        this.tipoLeitura = tipoLeitura;
    }

    public String getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(String velocidade) {
        this.velocidade = velocidade;
    }
    
    
    
}
