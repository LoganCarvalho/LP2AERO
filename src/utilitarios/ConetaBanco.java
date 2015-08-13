/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilitarios;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Logan
 */
public class ConetaBanco {
 public Statement stm;
 public ResultSet rs;
 private  String driver = "org.postgresql.Driver";
 private  String caminho;
 private String usuario;
 private String senha;
 public Connection conn;
    
    
    
}
