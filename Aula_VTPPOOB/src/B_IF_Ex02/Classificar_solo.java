
package B_IF_Ex02;

import javax.swing.JOptionPane;

public class Classificar_solo {
    public static void main(String[] args){
        Solo solo = new Solo();
        
       JOptionPane.showMessageDialog(null, "Esse programa irá classificar a qualidade do solo conforme a "
               + "qunatidade de agua registrada na amostra!");
        
        double quantidade = Double.parseDouble(JOptionPane.showInputDialog("Informe a quantidade de água que foi encontrada na amostra!"));
    
        JOptionPane.showMessageDialog(null,"O resultado é que: " + solo.Calculo(quantidade) );
    }
}
