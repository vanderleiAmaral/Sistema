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
public class EquipamentoMaquina extends Equipamento {
    
    private String processamento;
    private int memoria;
    private EquipamentoVideo monitor;
    private EquipamentoMidia armazenamento;
    private EquipamentoMidia leitor;
    private EquipamentoPrint impressora;

    public EquipamentoMaquina(String processamento, int memoria, EquipamentoVideo monitor, EquipamentoMidia armazenamento, EquipamentoMidia leitor, EquipamentoPrint impressora, int codigo, String descrisao, String marca, boolean ativo, boolean disponivel, Calendar dataInclusao, double valorDiaria, String grupo) {
        super(codigo, descrisao, marca, ativo, disponivel, dataInclusao, valorDiaria, grupo);
        this.processamento = processamento;
        this.memoria = memoria;
        this.monitor = monitor;
        this.armazenamento = armazenamento;
        this.leitor = leitor;
        this.impressora = impressora;
    }
    
    public void alterar(String processamento, int memoria, EquipamentoVideo monitor, EquipamentoMidia armazenamento, EquipamentoMidia leitor, EquipamentoPrint impressora, int codigo, String descrisao, String marca, boolean ativo, boolean disponivel, Calendar dataInclusao, double valorDiaria, String grupo) {
        this.processamento = processamento;
        this.memoria = memoria;
        this.monitor = monitor;
        this.armazenamento = armazenamento;
        this.leitor = leitor;
        this.impressora = impressora;
        super.setCodigo(codigo);
        super.setDescrisao(descrisao);
        super.setMarca(marca);
        super.setDataInclusao(dataInclusao);
        super.setValorDiaria(valorDiaria);
        super.setGrupo(grupo);
        
    }

       
}
