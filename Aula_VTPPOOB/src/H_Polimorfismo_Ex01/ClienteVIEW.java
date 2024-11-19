
package H_Polimorfismo_Ex01;

import javax.swing.JOptionPane;

public class ClienteVIEW {
    public static void main(String[] args) {
        ClienteDTO clienteDTO = new ClienteDTO();
        ClienteCTR clienteCTR = new ClienteCTR();
        
        clienteDTO.setNome(JOptionPane.showInputDialog("Informe o seu nome: "));
        clienteDTO.setRg(JOptionPane.showInputDialog("Informe o seu RG:"));
        clienteDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade: ")));
        clienteDTO.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Informe a altura: ")));
        
      JOptionPane.showMessageDialog(null, clienteCTR.mostrarInformações(clienteDTO)); 
    }
   
}
