
package DAL;

import java.sql.*; //usa todos os metodos e funções do sql
import javax.swing.JOptionPane;



public class ConectBd {
  
    public static Connection conectbd() throws ClassNotFoundException{
        
        try{
           Class.forName("com.mysql.jdbc.Driver"); //conecta com o postgre
           Connection con;
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432","postgres","superb17");
           JOptionPane.showMessageDialog(null, "Conectado com sucesso!");
           return con;
        }
        catch(SQLException error){
            JOptionPane.showMessageDialog(null, error);
            return null;
        }
    }
}
    
