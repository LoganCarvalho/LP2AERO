/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Logan e Stephanie
 */
public class ConectaBanco {

    private static final String driver = "com.mysql.jdbc.Driver";//responsavel por identificar o serviço de banco de dados
    private static final String caminho = "jdbc:mysql://localhost";//responsável por atribuir o local do BD. java database connection do tipo postgre
    private static final String usuario = "root";//configurados durante a instalação do banco
    private static final String senha = "123456";

    public static Connection getConnection() {

        Connection conexao = null;
        try {
            Class.forName(driver).newInstance();//atribui a propriedade do driver de conexão
            conexao = DriverManager.getConnection(caminho, usuario, senha);//Realiza a conexão com o BD
        } catch (SQLException error) {
            System.out.println("erro, verifique se o driver foi incluido como biblioteca do projeto");
        } finally {
            return conexao;
        }
    }

    public void desconectar(Connection conexao) {//Método para fechar a conexão com o BD
        try {
            conexao.close();
            JOptionPane.showMessageDialog(null, "Desconectado com Sucesso");//Imprime caixa de mensagem 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Erro ao fechar a conexão\n Erro" + ex.getMessage());
        }
    }
}
