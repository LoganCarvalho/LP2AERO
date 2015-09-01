package ProjectAeroDTO;

import java.util.ArrayList;

public class Programacao {
    
    private String date_chegada;
    private String hora_saida;
    private String date_saida;
    private String hora_chegada;
    private ArrayList<Passagem> passagem = new ArrayList<Passagem>();


    public Programacao(String date_chegada, String hora_saida, String date_saida, String hora_chegada) {
        this.date_chegada = date_chegada;
        this.hora_saida = hora_saida;
        this.date_saida = date_saida;
        this.hora_chegada = hora_chegada;
    }
    
    public String getDate_chegada() {
        return date_chegada;
    }

    public void setDate_chegada(String date_chegada) {
        this.date_chegada = date_chegada;
    }

    public String getDate_saida() {
        return date_saida;
    }

    public void setDate_saida(String date_saida) {
        this.date_saida = date_saida;
    }

    public String getHora_chegada() {
        return hora_chegada;
    }

    public void setHora_chegada(String hora_chegada) {
        this.hora_chegada = hora_chegada;
    }    

    public String getHora_saida() {
        return hora_saida;
    }

    public void setHora_saida(String hora_saida) {
        this.hora_saida = hora_saida;
    }

}
