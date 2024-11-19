
package G_Herança_Ex03;


public class AlunoDAO extends PessoaDAO{
    public String MostraDadosAluno(AlunoDTO alunoDTO){
        return MostraDadosPessoa(alunoDTO) + 
                "\n o prontuário é: " + alunoDTO.getProntuario() +
                "\n o curso é : " + alunoDTO.getCurso();
    }
}
