
package G_Herança_Ex02;

import javax.swing.JOptionPane;

public class ClienteVIEM {
    public static void main(String[] args) {
     
        try{
        FisicoDTO fisicoDTO = new FisicoDTO();
        FisicoCTR fisicoCTR = new FisicoCTR();
        
        fisicoDTO.setNome(JOptionPane.showInputDialog("Informe o seu nome: "));
        fisicoDTO.setEndereco(JOptionPane.showInputDialog("Informe o seu endereço: "));
        fisicoDTO.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Informe o número da residência: ")));
        fisicoDTO.setCidade(JOptionPane.showInputDialog("Informe a sua cidade; "));
        fisicoDTO.setEstado(JOptionPane.showInputDialog("Informe o seu Estado: "));
        fisicoDTO.setCpf(JOptionPane.showInputDialog("Informe o seu CPF: "));
        fisicoDTO.setRg(JOptionPane.showInputDialog("Informe o seu RG: "));
        
        JOptionPane.showMessageDialog(null, fisicoCTR.MostraDadosFisico(fisicoDTO));
        
        JuridicoDTO juridicoDTO = new JuridicoDTO();
        JuridicoCTR juridicoCTR = new JuridicoCTR();
        
        juridicoDTO.setNome(JOptionPane.showInputDialog("Informe o seu nome: "));
        juridicoDTO.setEndereco(JOptionPane.showInputDialog("Informe o seu endereço: "));
        juridicoDTO.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Informe o número da residência: ")));
        juridicoDTO.setCidade(JOptionPane.showInputDialog("Informe a sua cidade; "));
        juridicoDTO.setEstado(JOptionPane.showInputDialog("Informe o seu Estado: "));
        juridicoDTO.setCnpj(JOptionPane.showInputDialog("Informe o seu CNPJ: "));
        juridicoDTO.setIe(JOptionPane.showInputDialog("Informe o seu IE: "));
        
        JOptionPane.showMessageDialog(null, juridicoCTR.MostraDadosJuridico(juridicoDTO));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no Sistema");
        }
    }
}
