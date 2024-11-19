
package E_Excecao_Ex01;

import javax.swing.JOptionPane;

public class Principal_Tabuada {
    public static void main(String[] args) {
        try{
        Tabuada tabuada = new Tabuada();
        
        JOptionPane.showMessageDialog(null, 
                tabuada.calcular(
                       Integer.parseInt(
                       JOptionPane.showInputDialog("Informe o número: ")
                       )
                
                ));
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro 001 - Deve ser informado somente números!");
            System.out.println("Erro: " + e.getMessage());
        }
        finally{
            JOptionPane.showMessageDialog(null, "Fim do sistema");
        }
    }
   
}
