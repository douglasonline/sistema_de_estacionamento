
package model.bean;

import java.util.Date;


public class Valor {
    
    private int id;
    
    private double valor_primeira_hora;  
    
    private double valor_demais_horas;
    
    private Date data_fim;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValor_primeira_hora() {
        return valor_primeira_hora;
    }

    public void setValor_primeira_hora(double valor_primeira_hora) {
        this.valor_primeira_hora = valor_primeira_hora;
    }

    public double getValor_demais_horas() {
        return valor_demais_horas;
    }

    public void setValor_demais_horas(double valor_demais_horas) {
        this.valor_demais_horas = valor_demais_horas;
    }

    public Date getData_fim() {
        return data_fim;
    }

    public void setData_fim(Date data_fim) {
        this.data_fim = data_fim;
    }
    
    
}
