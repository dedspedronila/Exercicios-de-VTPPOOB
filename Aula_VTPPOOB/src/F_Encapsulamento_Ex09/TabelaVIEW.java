
package F_Encapsulamento_Ex09;

import javax.swing.JOptionPane;

public class TabelaVIEW {
    public static void main(String[] args) {
        try{
            TabelaDTO tabelaDTO = new TabelaDTO();
            TabelaCTR tabelaCTR = new TabelaCTR();
            
            tabelaDTO.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Informe a sua altura: ")));
            tabelaDTO.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Informe o seu peso: ")));
            
            JOptionPane.showMessageDialog(null, tabelaCTR.Exibir(tabelaDTO));
        
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema: " + e.getMessage());
        }
    }
}
