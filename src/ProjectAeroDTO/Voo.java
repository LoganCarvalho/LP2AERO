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
public class Voo {
    
    private String city_orig;
    private int identificacao;
    private String city_dest;

    public String getCity_orig() {
        return city_orig;
    }

    public void setCity_orig(String city_orig) {
        this.city_orig = city_orig;
    }

    public String getCity_dest() {
        return city_dest;
    }

    public void setCity_dest(String city_dest) {
        this.city_dest = city_dest;
    }

    public int getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(int identificacao) {
        this.identificacao = identificacao;
    }

}
