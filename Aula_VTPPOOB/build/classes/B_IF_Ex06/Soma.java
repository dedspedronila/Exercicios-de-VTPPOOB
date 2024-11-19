
package B_IF_Ex06;


public class Soma {
    private int n1, n2;
    private String op;
    public String operacao(int n1, int n2, String op){
        this.n1 = n1;
        this.n2 = n2;
        this.op = op;
        
       switch(this.op){
           case "A":
               return "A soma é " + (this.n1+ this.n2);
           case "S":
               return "A subtração é " + (this.n1 - this.n2);
           case "M":
               return "A multiplicação é " + (this.n1 * this.n2);
           case "D":
               return "A divisão é " + (this.n1 * this.n2);
           default:
               return "A operação selecionada é inválida!!";
               
               
       }
    
    }
}
