
package D_While_DoWhile_Ex02;

import javax.swing.JOptionPane;

public class Principal_Ex02 {
    public static void main(String[] args) {
        String letra = "";
        Metodos_Ex02 metodos_Ex02 = new Metodos_Ex02();
        JOptionPane.showMessageDialog(null,"Esse programa irá pedir letras, para para-lo basta digitar o número 0 (zero)");
        
        
        
        
        do{
            letra = JOptionPane.showInputDialog("Informe uma letra qualquer: ");
            metodos_Ex02.Verificar(letra);
            

        }while(!letra.equalsIgnoreCase("0"));
        
        JOptionPane.showMessageDialog(null, metodos_Ex02.retornar());
    }
   
}
