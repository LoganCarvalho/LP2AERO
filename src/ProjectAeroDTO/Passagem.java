package ProjectAeroDTO;

public class Passagem {
    
    double valor_real;
    int valor_pontos;
    int cod;

    public Passagem(double valor_real, int valor_pontos, int cod) {
        this.valor_real = valor_real;
        this.valor_pontos = valor_pontos;
        this.cod = cod;
    }
  
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
