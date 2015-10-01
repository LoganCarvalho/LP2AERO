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
 * @author Logan
 */



public class ConectaBanco {
 public Statement stm;//reponsável por preparar e realizar pesquisas no BD
 public ResultSet rs;//reponsável por armazenar o resultado de uma pesquisa passada para o statement
 private static final  String driver = "com.mysql.jdbc.Driver";//responsavel por identificar o serviço de banco de dados
 private static final  String caminho = "jdbc:mysql://localhost:5432/lp2";//responsável por atribuir o local do BD. java database connection do tipo postgre
 private static final String usuario= "root";//configurados durante a instalação do banco
 private static final String senha = "123456";

    
 public static Connection getConnection(){
 
 Connection conexao = null;
     try {
         Class.forName(driver).newInstance();//atribui a propriedade do driver de conexão
         conexao = DriverManager.getConnection(caminho, usuario, senha);//Realiza a conexão com o BD
     } 
     
     catch (SQLException error) {
         System.out.println("Erro, verifique sua conexão com o banco!");
     }
 
 
 finally{
 return conexao;
     }
 }   
 
 
 public void desconectar(){//Método para fechar a conexão com o BD
     try {
         conexao.close();
         JOptionPane.showMessageDialog(null,"Desconectado com Sucesso");//Imprime caixa de mensagem 
     } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null," Erro ao fechar a conexão\n Erro"+ ex.getMessage() );
     }
 }
}
