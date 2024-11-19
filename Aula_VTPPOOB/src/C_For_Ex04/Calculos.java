
package C_For_Ex04;

import javax.swing.JOptionPane;
public class Calculos {
    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        
        JOptionPane.showMessageDialog(null,"Esse programa irá pedir que você informe 20 alturas, todas em formatos de metros(1.80) e será calculada as médias"
                + "das alturas, e exibidas para o usuario");
        
        double altura;
        
        for(int cont = 0; cont < 2; cont++){
            altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura : "));
            metodos.Soma(altura);
        }
        
        JOptionPane.showMessageDialog(null, metodos.mostrar_informacoes());
}}
