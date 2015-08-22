/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitarios;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Logan
 */
public class ConectaBanco {
 public Statement stm;//reponsável por preparar e realizar pesquisas no BD
 public ResultSet rs;//reponsável por armazenar o resultado de uma pesquisa passada para o statement
 private final  String driver = "org.postgresql.Driver";//responsavel por identificar o serviço de banco de dados
 private final  String caminho = "jdbc:postgresql://localhost:5432/lp2";//responsável por atribuir o local do BD. java database connection do tipo postgre
 private final String usuario= "postgres";//configurados durante a instalação do banco
 private final String senha = "superb17";
 public Connection conn;//responsável por realizar a conecção com o BD
    
    
 public void conectar(){//Método responsável por fazer a conexão com o banco
 
     try {//Tentativa inicial
         System.setProperty("jdbc.Drivers", driver);//atribui a propriedade do driver de conexão
         conn = DriverManager.getConnection(caminho, usuario, senha);//Realiza a conexão com o BD
         //JOptionPane.showMessageDialog(null,"Conectado com Sucesso");//Imprime caixa de mensagem 
     } catch (SQLException ex) {
         JOptionPane.showMessageDialog(null," Erro de conexão\n Erro"+ ex.getMessage() );
     }       
 }   
 
 public void desconectar(){//Método para fechar a conexão com o BD
     try {
         conn.close();
         JOptionPane.showMessageDialog(null,"Desconectado com Sucesso");//Imprime caixa de mensagem 
     } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null," Erro ao fechar a conexão\n Erro"+ ex.getMessage() );
     }
 }
}
