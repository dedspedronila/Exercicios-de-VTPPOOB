
package B_IF_Ex06;

import javax.swing.JOptionPane;

public class Principal_Soma {
    public static void main(String[] args){
    Soma soma = new Soma();
     
    JOptionPane.showMessageDialog(null, 
    soma.operacao(
        Integer.parseInt(JOptionPane.showInputDialog("Informe o valor para o primeiro número: ")),
        Integer.parseInt(JOptionPane.showInputDialog("Informe o valor para o segund número: ")),
        JOptionPane.showInputDialog("Informe a opção \n "
                                    + "A-Adição \n"
                                    + "S-Subtração \n"
                                    + "M-Multiplicação \n"
                                    + "D-Divisão"))
        );                                
}
    }