
package H_Polimorfismo_Ex02;


public class NotasCTR {
    NotasDAO notasDAO = new NotasDAO();
    public void calcularMedia(NotasDTO notasDTO){
        notasDAO.calcularMedia(notasDTO);
    }
    public String imprimir(){
        return notasDAO.imprimir();
    }
}
