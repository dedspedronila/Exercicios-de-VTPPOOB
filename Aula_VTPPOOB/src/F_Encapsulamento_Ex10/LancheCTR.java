
package F_Encapsulamento_Ex10;


public class LancheCTR {
    LancheDAO lancheDAO = new LancheDAO();
    
    public void Soma(LancheDTO lancheDTO){
        lancheDAO.Soma(lancheDTO);
    }
    
    public String Exibir(LancheDTO lancheDTO){
        return lancheDAO.Exibir(lancheDTO);
    }
}
