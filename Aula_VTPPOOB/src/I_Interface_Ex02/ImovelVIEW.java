
package I_Interface_Ex02;

import javax.swing.JOptionPane;

public class ImovelVIEW {
    public static void main(String[] args) {
        try {
           CasaDTO casaDTO = new CasaDTO();
           CasaCTR casaCTR = new CasaCTR();
           
           casaDTO.setEndereco(JOptionPane.showInputDialog("Informe o endereço da residência: "));
           casaDTO.setBairro(JOptionPane.showInputDialog("Informe o bairro da residência: "));
           casaDTO.setCidade(JOptionPane.showInputDialog("Informe a cidade em que se localiza a residência: "));
           casaDTO.setProprietario(JOptionPane.showInputDialog("Informe o nome do proprietário da residência: "));
           casaDTO.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Informe o número da residência: ")));
           casaDTO.setN_banheiros(Integer.parseInt(JOptionPane.showInputDialog("Informe o número de banheiros que a residência possui:")));
           casaDTO.setN_quartos(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de quartos que a residência possui: ")));
           
           JOptionPane.showMessageDialog(null, casaCTR.publicarDados(casaDTO));
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"O erro localizado é: " + e.getStackTrace());
        }
    }
  
}
