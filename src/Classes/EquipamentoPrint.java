/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Tiago
 */
public class EquipamentoPrint extends Equipamento{
    
    private String resolucao;
    private String tipo; // lazer, jato, matri
    private String volts;
    private String tamanhoMaxPloter;
    private String tamanhoMinPloter;

    public EquipamentoPrint(String resolucao, String tipo, String volts, String tamanhoMaxPloter, String tamanhoMinPloter, int codigo, String descrisao, String marca, boolean ativo, boolean disponivel, Calendar dataInclusao, double valorDiaria, String grupo) {
        super(codigo, descrisao, marca, ativo, disponivel, dataInclusao, valorDiaria, grupo);
        this.resolucao = resolucao;
        this.tipo = tipo;
        this.volts = volts;
        this.tamanhoMaxPloter = tamanhoMaxPloter;
        this.tamanhoMinPloter = tamanhoMinPloter;
    }   
    
    public void alterar(String resolucao, String tipo, String volts, String tamanhoMaxPloter, String tamanhoMinPloter, int codigo, String descrisao, String marca, boolean ativo, boolean disponivel, Calendar dataInclusao, double valorDiaria, String grupo){
        this.resolucao = resolucao;
        this.tipo = tipo;
        this.volts = volts;
        this.tamanhoMaxPloter = tamanhoMaxPloter;
        this.tamanhoMinPloter = tamanhoMinPloter;
        super.setCodigo(codigo);
        super.setDescrisao(descrisao);
        super.setMarca(marca);
        super.setDataInclusao(dataInclusao);
        super.setValorDiaria(valorDiaria);
        super.setGrupo(grupo);
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    public String getTamanhoMaxPloter() {
        return tamanhoMaxPloter;
    }

    public void setTamanhoMaxPloter(String tamanhoMaxPloter) {
        this.tamanhoMaxPloter = tamanhoMaxPloter;
    }

    public String getTamanhoMinPloter() {
        return tamanhoMinPloter;
    }

    public void setTamanhoMinPloter(String tamanhoMinPloter) {
        this.tamanhoMinPloter = tamanhoMinPloter;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getVolts() {
        return volts;
    }

    public void setVolts(String volts) {
        this.volts = volts;
    }
    
    
}
