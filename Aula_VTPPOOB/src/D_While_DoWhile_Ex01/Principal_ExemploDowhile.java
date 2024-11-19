
package D_While_DoWhile_Ex01;

import javax.swing.JOptionPane;

public class Principal_ExemploDowhile {
    public static void main(String[] args) {
        int numero;
        ExemploDowhile exemploDowhile = new ExemploDowhile();
        
        
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Informe o número: "));
            exemploDowhile.somar(numero);
        
        
        }while(numero != 0);
        
        
        JOptionPane.showMessageDialog(null, exemploDowhile.mostra());
    }
}
