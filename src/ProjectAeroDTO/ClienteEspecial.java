package ProjectAeroDTO;

public class ClienteEspecial extends Cliente{
    
     private Cartao cartao;

  public ClienteEspecial(String nome, String dataNascimento, String CPF, Cartao cartao) {
       super(nome, dataNascimento, CPF);
       this.cartao = cartao;     
    }

    public Cartao getCartao() {
        return cartao;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }

}

    

