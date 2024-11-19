
package H_Polimorfismo_Ex02;


public class NotasDAO {
    private String resp;
  public void calcularMedia(NotasDTO notasDTO){
      if(notasDTO.getTipo() == 1){
         calcularMedia(notasDTO.getNota1(), notasDTO.getNota2());
      }
      else if(notasDTO.getTipo() == 2){
          calcularMedia(notasDTO.getNota1(),notasDTO.getNota2(),notasDTO.getNota3());
      }
      else if(notasDTO.getTipo() == 3){
          calcularMedia(notasDTO.getNota1(),notasDTO.getNota2(),notasDTO.getNota3(),notasDTO.getNota4());
      }
      else{
          this.resp = "O tipo de cálculo escolhido está errado!";
      }
  }

    private void calcularMedia(double Nota1, double Nota2){
        this.resp = "A media é:" + (Nota1 + Nota2) / 2;
    }
    private void calcularMedia(double Nota1, double Nota2, double Nota3){
        this.resp = "A media é: " + (Nota1 + Nota2 + Nota3) / 3;
    }
    private void calcularMedia(double Nota1, double Nota2, double Nota3, double Nota4){
        this.resp = "A média é: " + (Nota1 + Nota2 + Nota3 + Nota4) / 4;
    }
    
    public String imprimir(){
        return this.resp;
    }
}
