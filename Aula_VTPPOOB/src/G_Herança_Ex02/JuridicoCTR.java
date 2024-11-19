
package G_Herança_Ex02;


public class JuridicoCTR {
    JuridicoDAO juridicoDAO = new JuridicoDAO();
    
    public String MostraDadosJuridico(JuridicoDTO juridicoDTO){
        return juridicoDAO.MostraDadosJuridico(juridicoDTO);
    }
    
}
