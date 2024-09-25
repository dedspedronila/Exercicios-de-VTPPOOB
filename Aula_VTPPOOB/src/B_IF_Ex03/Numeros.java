
package B_IF_Ex03;


public class Numeros {
    private int n1, n2, n3, n4;
    private String resultado;
    
    public String Calculo(int n1, int n2, int n3, int n4){
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        
        if((this.n4 < this.n1)){
            this.resultado = this.n3 + "  " +this.n2 + "  " + this.n1 + "  " + this.n4;
        } else if((this.n4 > this.n1) && (this.n4 <= this.n2)){
            this.resultado = this.n3 + "  " +this.n2 + "  " +this.n4 + "  " + this.n1;
        } else if((this.n4 > this.n2) && (this.n4 <= this.n3)){
            this.resultado = this.n3 + "  " +this.n4 + "  " +this.n2 + "  " +this. n1;
        } else if((this.n4 >= this.n3)){
            this.resultado = this.n4 + "  " + this.n3 + "  " + this.n2 + "  " +this.n1;
        }else{
            this.resultado = "Inválido";
        }
        
       return this.resultado;
        
}
    
}
