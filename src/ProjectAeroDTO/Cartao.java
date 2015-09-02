package ProjectAeroDTO;


public class Cartao {
       
    private int Id;
    private int num_Pontos;
    
    //Modificação dentro de cartao. Testando Pull and Push. Apague isso aqui pra fazer o teste

    public Cartao(int Id, int num_Pontos) {
        this.Id = Id;
        this.num_Pontos = num_Pontos;
    }
    
    public int getNum_Pontos() {
        return num_Pontos;
    }

    public void setNum_Pontos(int num_Pontos) {
        this.num_Pontos = num_Pontos;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

}
