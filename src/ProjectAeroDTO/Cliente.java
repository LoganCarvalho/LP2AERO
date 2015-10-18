/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectAeroDTO;

import Banco.ClienteDAO;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;

/**
 *
 * @author Logan CARVALHO
 */
public class Cliente {

    private String nome;
    private String dataNascimento;
    private String CPF;
    private ArrayList<Passagem> passagens = new ArrayList<Passagem>();

    public Cliente(String nome, String dataNascimento, String CPF) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.CPF = CPF;
    }
    
     public Cliente(String CPF) {
        this.CPF = CPF;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public static final String PROP_NOME = "nome";

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        propertyChangeSupport.firePropertyChange(PROP_NOME, oldNome, nome);
    }

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    public static final String PROP_CPF = "CPF";

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        String oldCPF = this.CPF;
        this.CPF = CPF;
        propertyChangeSupport.firePropertyChange(PROP_CPF, oldCPF, CPF);
    }

    public int incluir() {

        ClienteDAO cli = new ClienteDAO();
        int resposta = cli.incluir(this);
        return resposta;
    }
    
      public int alterar() {

        ClienteDAO cli = new ClienteDAO();
        int resposta = cli.alterar(this);
        return resposta;
    }
      
      public int excluir() {

        ClienteDAO cli = new ClienteDAO();
        int resposta = cli.excluir(this);
        return resposta;
    }
      
      public boolean consultar(){
      
        ClienteDAO cli = new ClienteDAO();
        boolean resposta = cli.consultar(this);
        return resposta;
  }

}
