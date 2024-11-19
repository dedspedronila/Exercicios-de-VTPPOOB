
package B_IF_Ex05;

import javax.swing.JOptionPane;


public class Calc_Triangulo {
   
    public static void main(String[] args){
        Triangulo triangulo = new Triangulo();
        
        JOptionPane.showMessageDialog(null, "Esse programa irá pedir três valores, definidos pelo usuário, e irá informar se ele pode ser um triângulo"
                + "e qual sua classificação, entre Isosceles, Equilátero, Escaleno!");
    
        double ladoA = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor para o 1º Lado: "));
        double ladoB = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor para o 2º Lado: "));
        double ladoC = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor para o 3º Lado: "));
        
        JOptionPane.showMessageDialog(null,triangulo.Calculo(ladoA, ladoB, ladoC));

    }
}
