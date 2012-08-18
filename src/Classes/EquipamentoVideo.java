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
public class EquipamentoVideo extends Equipamento {
    
    private String polegadas;
    private String lumines;
    private String volts;
    private String tela; // LED LCD CRT

    public EquipamentoVideo(String polegadas, String lumines, String volts, String tela, int codigo, String descrisao, String marca, boolean ativo, boolean disponivel, Calendar dataInclusao, double valorDiaria, String grupo) {
        super(codigo, descrisao, marca, ativo, disponivel, dataInclusao, valorDiaria, grupo);
        this.polegadas = polegadas;
        this.lumines = lumines;
        this.volts = volts;
        this.tela = tela;
    }

    public void alterar(String polegadas, String lumines, String volts, String tela, int codigo, String descrisao, String marca, boolean ativo, boolean disponivel, Calendar dataInclusao, double valorDiaria, String grupo){
        this.polegadas = polegadas;
        this.lumines = lumines;
        this.volts = volts;
        this.tela = tela;
        super.setCodigo(codigo);
        super.setDescrisao(descrisao);
        super.setMarca(marca);
        super.setDataInclusao(dataInclusao);
        super.setValorDiaria(valorDiaria);
        super.setGrupo(grupo);
    }

    public String getLumines() {
        return lumines;
    }

    public void setLumines(String lumines) {
        this.lumines = lumines;
    }

    public String getPolegadas() {
        return polegadas;
    }

    public void setPolegadas(String polegadas) {
        this.polegadas = polegadas;
    }

    public String getTela() {
        return tela;
    }

    public void setTela(String tela) {
        this.tela = tela;
    }

    public String getVolts() {
        return volts;
    }

    public void setVolts(String volts) {
        this.volts = volts;
    }
    
    
    
}
