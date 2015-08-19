
package projetoaerolp2;

import interfaces.TelaInicial;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author Logan
 */
public class ProjetoAeroLP2 {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String[] args) throws ClassNotFoundException {
        //Criando objeto e tornando-o visivel no main
        TelaInicial ti = new TelaInicial();
        ti.setVisible(true);
        //CadastroCliente cadCli = new CadastroCliente();
        //cadCli.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //cadCli.setVisible(true);
    }
    
}
