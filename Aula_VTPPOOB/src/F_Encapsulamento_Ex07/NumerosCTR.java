
package F_Encapsulamento_Ex07;


public class NumerosCTR {
    NumerosDAO numerosDAO = new NumerosDAO();
    
    public String Calculo(NumerosDTO numerosDTO){
        return numerosDAO.Calculo(numerosDTO);
    }
}
