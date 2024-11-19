
package B_IF_Ex03;

import javax.swing.JOptionPane;

public class Calculo_Numeros {
    
        public static void main(String[] args){
            Numeros numeros = new Numeros();
            
            JOptionPane.showMessageDialog(null, "Nesse programa será pedido 4 números, dentre eles teremos as seguintes regras:"
                    + "Os três primeiros números serão necessáriamente em ordem crescente, \nsendo o primeiro número o menor e o terceiro número"
                    + " o maior dos três primeiros, já o quarto número é um número totalmente fora da ordem, pode informar qualquer um deles!");
            
            int n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número: "));
            int n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número: "));
            int n3 = Integer.parseInt(JOptionPane.showInputDialog("Informe o terceiro número: "));
            int n4 = Integer.parseInt(JOptionPane.showInputDialog("Informe o quarto número: "));
            
            JOptionPane.showMessageDialog(null, numeros.Calculo(n1, n2, n3, n4));
        
        }
    
}
