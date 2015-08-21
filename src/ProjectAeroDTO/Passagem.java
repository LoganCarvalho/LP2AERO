/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectAeroDTO;

/**
 *
 * @author Logan
 */
public class Passagem {
    
    private double valor_real;
    private int valor_pontos;
    private int cod;

    public double getValor_real() {
        return valor_real;
    }

    public void setValor_real(double valor_real) {
        this.valor_real = valor_real;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getValor_pontos() {
        return valor_pontos;
    }

    public void setValor_pontos(int valor_pontos) {
        this.valor_pontos = valor_pontos;
    }

}
