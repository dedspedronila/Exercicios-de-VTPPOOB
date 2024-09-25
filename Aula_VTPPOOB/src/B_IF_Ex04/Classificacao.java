package B_IF_Ex04;


public class Classificacao {
  private double altura, peso;
  private String resposta;
  
  public String Calculo(double altura, double peso){
      this.altura = altura;
      this.peso = peso;
      
      if(this.altura <= 1.20){
          if((this.peso > 0) && (this.peso <=60)){
              this.resposta = "Sua classificação é: A";
          }else if((this.peso > 60) && (this.peso <=90)){
              this.resposta = "Sua classificação é: D";
          }else {
              this.resposta = "Sua classificação é: G";
          }
          
      }
      else if((this.altura > 1.20) && (this.altura <= 1.70)){
          if((this.peso > 0) && (this.peso <=60)){
              this.resposta = "Sua classificação é: B";
          }else if((this.peso > 60) && (this.peso <=90)){
              this.resposta = "Sua classificação é: E";
          }else {
              this.resposta = "Sua classificação é: H";
          }
      }
      
      else if(this.altura > 1.70){
          if((this.peso > 0) && (this.peso <=60)){
              this.resposta = "Sua classificação é: C";
          }else if((this.peso > 60) && (this.peso <=90)){
              this.resposta = "Sua classificação é: F";
          }else {
              this.resposta = "Sua classificação é: I";
          }
      }
  
     return this.resposta;
  }
}
