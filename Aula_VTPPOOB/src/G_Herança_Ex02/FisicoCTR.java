
package G_Herança_Ex02;


public class FisicoCTR {
    FisicoDAO fisicoDAO = new FisicoDAO();
    
    public String MostraDadosFisico(FisicoDTO fisicoDTO){
        return fisicoDAO.MostraDadosFisico(fisicoDTO);
    }
}
