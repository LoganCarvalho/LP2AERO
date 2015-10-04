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
            String sql = "insert into bd_cia_aerea.cliente "
                    + "(nome, cpf,data_nasc) "
                    + "values(" + cliente.getNome() + ",'" + cliente.getCPF() + "','" + cliente.getDataNascimento() + "')";
            resposta = sentence.executeUpdate(sql);
        } catch (SQLException error) {
        } finally {
            return resposta;
        }

    }

}
