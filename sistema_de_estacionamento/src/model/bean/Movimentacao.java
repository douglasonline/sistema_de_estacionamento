
package model.bean;


import java.util.Date;
import jdk.jfr.Timestamp;


public class Movimentacao {
    
    private int id;
    
    private String placa;
    
    private String modelo;
    
    private Long data_entrada;
    
    private Long data_saida;
    
    private String tempo;
    
    private double valor_pago;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Long getData_entrada() {
        return data_entrada;
    }

    public void setData_entrada(Long data_entrada) {
        this.data_entrada = data_entrada;
    }

    public Long getData_saida() {
        return data_saida;
    }

    public void setData_saida(Long data_saida) {
        this.data_saida = data_saida;
    }


    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    public double getValor_pago() {
        return valor_pago;
    }

    public void setValor_pago(double valor_pago) {
        this.valor_pago = valor_pago;
    }

    
    
}
