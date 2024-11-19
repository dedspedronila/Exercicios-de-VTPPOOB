
package H_Polimorfismo_Ex02;

import javax.swing.JOptionPane;

public class NotasVIEW {
    public static void main(String[] args) {
        try {
            NotasDTO notasDTO = new NotasDTO();
            NotasCTR notasCTR = new NotasCTR();
            
            
            notasDTO.setNota1(Double.parseDouble(JOptionPane.showInputDialog("Informe a Nota1 :")));
            notasDTO.setNota2(Double.parseDouble(JOptionPane.showInputDialog("Informe a Nota2 :")));
            notasDTO.setNota3(Double.parseDouble(JOptionPane.showInputDialog("Informe a Nota3 :")));
            notasDTO.setNota4(Double.parseDouble(JOptionPane.showInputDialog("Informe a Nota4 :")));
            
            notasDTO.setTipo(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de notas" + 
                    "Que será utilizado para calcular a média: " + 
                    "\n 1 - para usar as notas Nota1 e Nota2" +
                    "\n 2 - para usar as notas Nota1, Nota2 e Nota3" +
                    "\n 3 - para usar as notas Nota1, Nota2,  Nota3 e Nota4")));
            
            notasCTR.calcularMedia(notasDTO);

            JOptionPane.showMessageDialog(null, notasCTR.imprimir());
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro no sistema: "+e.getMessage());
        }
    }
  
}
