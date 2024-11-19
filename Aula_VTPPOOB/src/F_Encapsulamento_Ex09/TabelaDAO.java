
package F_Encapsulamento_Ex09;


public class TabelaDAO {
    private String resposta;
    
    public String Exibir(TabelaDTO tabelaDTO){
        if(tabelaDTO.getAltura() <= 1.20){
          if((tabelaDTO.getPeso() > 0) && (tabelaDTO.getPeso() <=60)){
              this.resposta = "Sua classificação é: A";
          }else if((tabelaDTO.getPeso() > 60) && (tabelaDTO.getPeso() <=90)){
              this.resposta = "Sua classificação é: D";
          }else {
              this.resposta = "Sua classificação é: G";
          }
          
      }
      else if((tabelaDTO.getAltura() > 1.20) && (tabelaDTO.getAltura() <= 1.70)){
          if((tabelaDTO.getPeso() > 0) && (tabelaDTO.getPeso() <=60)){
              this.resposta = "Sua classificação é: B";
          }else if((tabelaDTO.getPeso() > 60) && (tabelaDTO.getPeso() <=90)){
              this.resposta = "Sua classificação é: E";
          }else {
              this.resposta = "Sua classificação é: H";
          }
      }
      
      else if(tabelaDTO.getAltura() > 1.70){
          if((tabelaDTO.getPeso() > 0) && (tabelaDTO.getPeso() <=60)){
              this.resposta = "Sua classificação é: C";
          }else if((tabelaDTO.getPeso() > 60) && (tabelaDTO.getPeso() <=90)){
              this.resposta = "Sua classificação é: F";
          }else {
              this.resposta = "Sua classificação é: I";
          }
      }
  
     return this.resposta;
    
    }
}
