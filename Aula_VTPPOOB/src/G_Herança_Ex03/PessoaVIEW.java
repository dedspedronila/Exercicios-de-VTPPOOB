
package G_Herança_Ex03;

import javax.swing.JOptionPane;

public class PessoaVIEW {
    public static void main(String[] args) {
    try{    
     FuncionarioDTO funcionarioDTO = new FuncionarioDTO();
     FuncionarioCTR funcionarioCTR = new FuncionarioCTR();    
     
     funcionarioDTO.setNome(JOptionPane.showInputDialog("Informe o seu nome: "));
     funcionarioDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade: ")));
     funcionarioDTO.setEndereco(JOptionPane.showInputDialog("Informe seu endereço: "));
     funcionarioDTO.setTelefone(JOptionPane.showInputDialog("Informe o seu telefone: "));
     funcionarioDTO.setSiape(JOptionPane.showInputDialog("Informe o seu SIAPE: "));
     funcionarioDTO.setFuncao(JOptionPane.showInputDialog("Informe a sua função: "));
     
     JOptionPane.showMessageDialog(null, funcionarioCTR.MostraDadosFuncionario(funcionarioDTO));
      
     AlunoDTO alunoDTO = new AlunoDTO();
     AlunoCTR alunoCTR = new AlunoCTR();
     
     alunoDTO.setNome(JOptionPane.showInputDialog("Informe o seu nome: "));
     alunoDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade: ")));
     alunoDTO.setEndereco(JOptionPane.showInputDialog("Informe seu endereço: "));
     alunoDTO.setTelefone(JOptionPane.showInputDialog("Informe o seu telefone: "));
     alunoDTO.setProntuario(JOptionPane.showInputDialog("Informe o seu prontuário: "));
     alunoDTO.setCurso(JOptionPane.showInputDialog("Informe o seu curso: "));
     
     JOptionPane.showMessageDialog(null, alunoCTR.MostraDadosAluno(alunoDTO));
     
    }  
    catch(Exception e){
        JOptionPane.showMessageDialog(null, "Erro no sistema!");
    }
    }
    
   
    
    
}
