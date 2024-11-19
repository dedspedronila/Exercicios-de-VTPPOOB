
package C_For_Ex03;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        
        JOptionPane.showMessageDialog(null,"Esse programa irá pedir que você informe 10 valores que serão somados na ordem de digitação!");
        
        int num1;
        
        for(int cont = 0; cont < 10; cont++){
            num1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor: "));
            metodos.Soma(num1);
        }
        
        JOptionPane.showMessageDialog(null, "A soma dos números é: " + metodos.Exibir());
    }
}
