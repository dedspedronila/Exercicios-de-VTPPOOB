
package A_Introducao_Ex04;

import javax.swing.JOptionPane;

public class Calculo_Salfinal {
    
    
    public static void main(String[] args){
        Salario salario = new Salario();
        
        JOptionPane.showMessageDialog(null, "Nesse programa, você deverá informar o valor de suas vendas mensais,"
                + "e seu salario fixo mensal, após isso ele irá calcular seu salario final e quanto você teve de comissão!");
        
        double sal = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu salário mensal: "));
        double vendas = Double.parseDouble(JOptionPane.showInputDialog("Informe quanto você vendeu no mês em reais: "));
        
        
       
        JOptionPane.showMessageDialog(null, salario.Calculo(sal, vendas));
    }
}
