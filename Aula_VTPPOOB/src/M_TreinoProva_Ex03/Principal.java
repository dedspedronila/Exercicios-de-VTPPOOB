
package M_TreinoProva_Ex03;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        
       
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número!"));
        
        JOptionPane.showMessageDialog(null, metodos.Numero(numero));
    }
  
}
