/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import ProjectAeroDTO.Cliente;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Logan e Stephanie
 */
public class ClienteDAO {

    public int incluir(Cliente cliente) {

        Connection conexao = ConectaBanco.getConnection();
        int resposta = 0;
        try {
            Statement sentence = conexao.createStatement();
            String sql = "insert into projeto_aereo.cliente "+
                     "(nome,dt_nascimento, cpf) "+
                     "values('" + cliente.getNome() + "','" + cliente.getCPF() + "','" + cliente.getDataNascimento() + "')";
            resposta = sentence.executeUpdate(sql);
        } catch (SQLException error) {
        
            
          } 
        
        finally {
            return resposta;
        }

    }
    
     public int alterar(Cliente cliente) {

        Connection conexao = ConectaBanco.getConnection();
        int resposta = 0;
        try {
            Statement sentence = conexao.createStatement();
             String sql = "update AeroSystem.Cliente "+
                     "set nome='"+cliente.getNome()+ "',dt_nascimento='"+cliente.getDataNascimento()+ "',cpf='" +cliente.getCPF()+"' "+
                     "where idCliente = 1";
            resposta = sentence.executeUpdate(sql);
        } catch (SQLException error) {
        
            
          } 
        
        finally {
            return resposta;
        }

    }
     
     public int excluir (Cliente cliente){
      Connection conexao = ConectaBanco.getConnection();
      int resposta=0;
      try{
      Statement sentenca = conexao.createStatement();
      String sql = "delete from AeroSystem.Cliente "+
                   "where idCliente = 1";
      resposta = sentenca.executeUpdate(sql);
      }catch(SQLException erro){
          
      }
      finally{
          return resposta;
      }
  }
     
     public boolean consultar (Cliente cliente){
      Connection conexao = ConectaBanco.getConnection();
      ResultSet resposta=null;
      boolean ok=false;
      try{
      Statement sentenca = conexao.createStatement();
      String sql = "select nome, cpf, dt_nascimento from projeto_aereo.cliente "+
                   "where cpf=" +"'" + cliente.getCPF() + "'";
      resposta = sentenca.executeQuery(sql);
      while (resposta.next()){
          cliente.setNome(resposta.getString("nome"));
          cliente.setCPF(resposta.getString("cpf"));
          cliente.setDataNascimento(resposta.getString("dt_nascimento"));
          
          ok=true;
      }
      }catch(SQLException erro){
          
      }
      finally{
          return ok;
      }
  }

}
