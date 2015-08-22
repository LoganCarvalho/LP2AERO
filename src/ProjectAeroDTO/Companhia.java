package ProjectAeroDTO;

public class Companhia {
    
    private String cnpj;
    private String nome;

    public Companhia(String cnpj, String nome) {
        this.cnpj = cnpj;
        this.nome = nome;
    }
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
