
package M_TreinoProva_Ex04;

import javax.swing.JOptionPane;

public class ClienteVIEW {
    
    public static void main(String[] args) {
        try {
            ClienteDTO clienteDTO = new ClienteDTO();
            ClienteCTR clienteCTR = new ClienteCTR();
            
          clienteDTO.setNome(JOptionPane.showInputDialog("Informe o seu nome:"));
          clienteDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:")));
          clienteDTO.setRg(JOptionPane.showInputDialog("Informe o seu RG:"));
          clienteDTO.setCpf(JOptionPane.showInputDialog("Informe o seu CPF: "));
          clienteDTO.setTelefone(JOptionPane.showInputDialog("Informe o seu telefone:"));
          clienteDTO.setEndereço(JOptionPane.showInputDialog("Informe o seu endereço:"));
          
          JOptionPane.showMessageDialog(null, clienteCTR.Cadastro(clienteDTO));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
}
