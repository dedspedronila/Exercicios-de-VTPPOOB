
package G_Herança_Ex03;


public class FuncionarioCTR {
    FuncionarioDAO funcionarioDAO = new FuncionarioDAO();
    
    public String MostraDadosFuncionario(FuncionarioDTO funcionarioDTO){
        return funcionarioDAO.MostraDadosFuncionario(funcionarioDTO);
    }
   
}
