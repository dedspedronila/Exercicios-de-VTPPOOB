
package F_Encapsulamento_Ex08;


public class Tres_numerosCTR {
    Tres_numerosDAO tres_numerosDAO = new Tres_numerosDAO();
    
    public String Calculo(Tres_numerosDTO tres_numerosDTO){
        return tres_numerosDAO.Calculo(tres_numerosDTO);
    }
}
