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
public class Aeronave {
    
    private String prefixo;
    private int capacidade;
    private int qntd_prim_clas;
    private int qntd_clas_econ;

    public String getPrefixo() {
        return prefixo;
    }

    public void setPrefixo(String prefixo) {
        this.prefixo = prefixo;
    }

    public int getQntd_prim_clas() {
        return qntd_prim_clas;
    }

    public void setQntd_prim_clas(int qntd_prim_clas) {
        this.qntd_prim_clas = qntd_prim_clas;
    }

    public int getQntd_clas_econ() {
        return qntd_clas_econ;
    }

    public void setQntd_clas_econ(int qntd_clas_econ) {
        this.qntd_clas_econ = qntd_clas_econ;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

}
