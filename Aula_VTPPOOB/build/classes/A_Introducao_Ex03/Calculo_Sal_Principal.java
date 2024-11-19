
package A_Introducao_Ex03;

import javax.swing.JOptionPane;

public class Calculo_Sal_Principal 
{
    public static void main(String[] args){
        Salario salario = new Salario();
        
           JOptionPane.showMessageDialog(null,"Informe os valores correspondentes! \n" +
                  "Ao informar a porcentagem do aumento, por gentileza informar em forma decimal! \n");
           
           double sal = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu salário: "));
           double porcentagem = Double.parseDouble(JOptionPane.showInputDialog("Informe a porcentagem do aumento: "));
           
            JOptionPane.showMessageDialog(null,"O salário já acrescido do aumento é de: " + salario.Calculo(sal, porcentagem));
   
    
    }
    
}