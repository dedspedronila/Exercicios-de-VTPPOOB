
package A_Introducao_Ex02;

//import javax.swing.JOptionPane;

import javax.swing.JOptionPane;


public class PrincipalMedia {
        
    public static void main(String[] args){
            
            Media media = new Media();
            
            System.out.println("Informe os números para calcular a média: \n");
            double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a primeira nota: ")); 
            double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a segunda nota: "));
            double nota3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a terceira nota: "));
            int peso1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro peso: "));
            int peso2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo peso: "));
            int peso3 = Integer.parseInt(JOptionPane.showInputDialog("Informe o terceiro peso: "));
            
            
             JOptionPane.showMessageDialog(null,"A média final é: " + media.Calculo(nota1, nota2, nota3, peso1, peso2, peso3));
        }
    
}