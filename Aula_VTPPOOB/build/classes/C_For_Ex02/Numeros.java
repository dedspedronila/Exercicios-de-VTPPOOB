
package C_For_Ex02;

import javax.swing.JOptionPane;
public class Numeros {
    public static void main(String[] args) {
        Calculo calculo = new Calculo();
        
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor para o número 1: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor para o número 2: "));
        
       JOptionPane.showMessageDialog(null,calculo.Lista_de_Numeros(num1, num2));
    }
}
