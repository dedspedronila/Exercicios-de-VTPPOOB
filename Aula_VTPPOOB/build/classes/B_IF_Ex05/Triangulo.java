
package B_IF_Ex05;


public class Triangulo {
    private double ladoA, ladoB, ladoC;
    private String resultado;
    
    public String Calculo(double ladoA, double ladoB, double ladoC){
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        
        if((this.ladoA > (this.ladoB + this.ladoC)) && (this.ladoB > (this.ladoA + this.ladoC)) && (this.ladoC > (this.ladoA + this.ladoB))){
            if ((this.ladoA == this.ladoB) && (this.ladoA == this.ladoC)){
                this.resultado = "O triângulo é equilatero!";
                    
                    }
            else if ((this.ladoA == this.ladoB) || (this.ladoA == this.ladoC) ||(this.ladoB == this.ladoC)){
                this.resultado = "O triângulo é isosceles!";
            }
            else {
                this.resultado = "O triângulo é escaleno!";
            }
        }
        else{
            this.resultado = "Os valores informados, não formar um triângulo! ";
        }
        
        return this.resultado;
    
    }
    
}
