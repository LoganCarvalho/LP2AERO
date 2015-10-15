/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import ProjectAeroDTO.Cliente;
import java.sql.Statement;
import java.sql.Connection;
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
            String sql = "insert into AeroSystem.Cliente "+
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

}
