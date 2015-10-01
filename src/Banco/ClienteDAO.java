/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import ProjectAeroDTO.Cliente;
import java.sql.Statement;
import java.sql.Connection;

/**
 *
 * @author Logan
 */
public class ClienteDAO {
    
    public void incluir (Cliente cliente){
    
    
        Connection conexao = ConectaBanco.getConnection();
        Statement sentence = conexao.createStatement();
        String sql= "insert into banco.tabela values ("+cliente.get+,")";
        int reposta = sentence.executeUpdate(sql);
        
        
    }
    
}
