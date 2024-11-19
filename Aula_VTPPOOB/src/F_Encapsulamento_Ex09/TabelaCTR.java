
package F_Encapsulamento_Ex09;


public class TabelaCTR {
    TabelaDAO tabelaDAO = new TabelaDAO();
    
    public String Exibir(TabelaDTO tabelaDTO){
        return tabelaDAO.Exibir(tabelaDTO);
    }
}
