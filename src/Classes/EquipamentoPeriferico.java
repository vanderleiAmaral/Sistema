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
public class EquipamentoPeriferico extends Equipamento{
    
    private String tipoConector;

    public EquipamentoPeriferico(String tipoConector, int codigo, String descrisao, String marca, boolean ativo, boolean disponivel, Calendar dataInclusao, double valorDiaria, String grupo) {
        super(codigo, descrisao, marca, ativo, disponivel, dataInclusao, valorDiaria, grupo);
        this.tipoConector = tipoConector;
    }    
    
    public void alterar(String tipoConector, int codigo, String descrisao, String marca, boolean ativo, boolean disponivel, Calendar dataInclusao, double valorDiaria, String grupo){
        this.tipoConector = tipoConector;
        super.setCodigo(codigo);
        super.setDescrisao(descrisao);
        super.setMarca(marca);
        super.setDataInclusao(dataInclusao);
        super.setValorDiaria(valorDiaria);
        super.setGrupo(grupo);
    }

    public String getTipoConector() {
        return tipoConector;
    }

    public void setTipoConector(String tipoConector) {
        this.tipoConector = tipoConector;
    }
    
    
    
}
