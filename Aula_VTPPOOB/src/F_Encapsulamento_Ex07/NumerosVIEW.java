
package F_Encapsulamento_Ex07;

import javax.swing.JOptionPane;

public class NumerosVIEW {
    public static void main(String[] args) {
        try{
            NumerosDTO numerosDTO = new NumerosDTO();
            NumerosCTR numerosCTR = new NumerosCTR();
            
            JOptionPane.showMessageDialog(null, "Esse programa irá pedir 3 números em ordem crescente, porém o quarto número não segue essa regra"
                    + "ao final serão exibidos os números de maneira decrescente");
            
            numerosDTO.setNum1(Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número:")));
            numerosDTO.setNum2(Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número:")));
            numerosDTO.setNum3(Integer.parseInt(JOptionPane.showInputDialog("Informe o terceiro número:")));
            numerosDTO.setNum4(Integer.parseInt(JOptionPane.showInputDialog("Informe o quarto número:")));
            
            
            JOptionPane.showMessageDialog(null, numerosCTR.Calculo(numerosDTO));
            
            

        
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema: " + e.getMessage());
        }
    }
  
}
