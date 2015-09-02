/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectAeroDTO;

public class PassagemPrimeiraClasse extends Passagem {
    
    private double constAdicional;
    private boolean bebidaAlcolica;
    private String alimentacao;

    public PassagemPrimeiraClasse(double valor_real, int valor_pontos,int cod, double constAdicional, boolean bebidaAlcolica, String alimentacao) {
        
        super(valor_real, valor_pontos ,cod);
        
        this.constAdicional = constAdicional;
        this.bebidaAlcolica = bebidaAlcolica;
        this.alimentacao = alimentacao;
    } 

    public double getConstAdicional() {
        return constAdicional;
    }

    public void setConstAdicional(double constAdicional) {
        this.constAdicional = constAdicional;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }  

    public boolean isBebidaAlcolica() {
        return bebidaAlcolica;
    }

    public void setBebidaAlcolica(boolean bebidaAlcolica) {
        this.bebidaAlcolica = bebidaAlcolica;
    }

}
