
package F_Encapsulamento_Ex08;

import javax.swing.JOptionPane;

public class Tres_numerosVIEW {
 
    public static void main(String[] args) {
        try{
            Tres_numerosDTO tres_numerosDTO = new Tres_numerosDTO();
            Tres_numerosCTR tres_numerosCTR = new Tres_numerosCTR();
            
            tres_numerosDTO.setNum1(Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número:")));
            tres_numerosDTO.setNum2(Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número:")));
            tres_numerosDTO.setNum3(Integer.parseInt(JOptionPane.showInputDialog("Informe o terceiro número:")));
            JOptionPane.showMessageDialog(null, tres_numerosCTR.Calculo(tres_numerosDTO));

        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema: " + e.getMessage());
        }
    }
}
