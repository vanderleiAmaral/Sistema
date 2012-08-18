/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author vanderlei
 */
public class Aluguel implements Serializable{
    
    private int codigo;
    private Calendar dataInicial;
    private Calendar dataFinal;
    private Calendar dataEntrega=null;
    private int quantdias=0;
    private Cliente cliente;
    private double valorTotal = 0;
    private List<Equipamento> equipamento = null;

    public Aluguel(int codigo, Calendar dataInicial, Calendar dataFinal, Cliente cliente, double valorTotal) {
        this.codigo = codigo;
        this.dataInicial = dataInicial;
        this.dataFinal = dataFinal;        
        this.cliente = cliente;
        this.valorTotal = valorTotal;
    }
    
    
    public Object[] getDados(){
    DateFormat df= DateFormat.getDateInstance(DateFormat.MEDIUM);
    Calendar in = Calendar.getInstance(), fi = Calendar.getInstance();
    in.setTime(dataInicial.getTime());
    fi.setTime(dataFinal.getTime());
    String dtinicial= df.format(in.getTime());
    String dtfinal= df.format(fi.getTime());
    String NomeCliente = cliente.getNome();
    int CodigoCliente = cliente.getCodigo();
    Object vet[]= {codigo,dtinicial,dtfinal,CodigoCliente,NomeCliente,valorTotal};
    return vet;
    }
    
    public void CalcularQuantDias(){
       quantdias = (int) (dataFinal.getTimeInMillis()-dataInicial.getTimeInMillis())/86400000;
       
    }

    public Calendar GetDataFinal(Calendar dtinicial,int dias){
        Calendar dtfinal = Calendar.getInstance();
        dtfinal.add(Calendar.DATE, dias);        
        return dtfinal;       
    }
    
    public void CalculaValorTotal (int diaria,double valorDiaria){       
     valorTotal = diaria * valorDiaria;   
    }
    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Calendar getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Calendar dataFinal) {
        this.dataFinal = dataFinal;
    }

    public Calendar getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(Calendar dataInicial) {
        this.dataInicial = dataInicial;
    }

    public List<Equipamento> getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(List<Equipamento> equipamento) {
        this.equipamento = equipamento;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    
    
}
