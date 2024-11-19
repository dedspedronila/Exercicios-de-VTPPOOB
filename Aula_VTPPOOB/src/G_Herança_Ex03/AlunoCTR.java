
package G_Herança_Ex03;


public class AlunoCTR {
    AlunoDAO alunoDAO = new AlunoDAO();
    
    public String MostraDadosAluno(AlunoDTO alunoDTO){
        return alunoDAO.MostraDadosAluno(alunoDTO);
    }
}
