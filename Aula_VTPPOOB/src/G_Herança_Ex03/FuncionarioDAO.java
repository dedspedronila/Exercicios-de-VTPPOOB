
package G_Herança_Ex03;


public class FuncionarioDAO extends PessoaDAO{
    private int resultado;

    public String MostraDadosFuncionario(FuncionarioDTO funcionarioDTO){
        return MostraDadosPessoa(funcionarioDTO) + 
                "\nO siape é: " + funcionarioDTO.getSiape() +
                "\na função é: " + funcionarioDTO.getFuncao() +
                 CalculoAposentadoria(funcionarioDTO) ;
        
}
    private String CalculoAposentadoria(FuncionarioDTO funcionarioDTO){
        if(funcionarioDTO.getIdade() >= 60){
            return "\nVocê já pode se aposentar";
        }
        else{
            this.resultado = 60 - funcionarioDTO.getIdade();
            
            return "\nFaltam " + this.resultado + " anos para você se aposentar";
        }
    }
}
