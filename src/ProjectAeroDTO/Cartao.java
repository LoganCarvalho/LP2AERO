package ProjectAeroDTO;


public class Cartao {       
    private int Id;
    private int num_Pontos;
    
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
