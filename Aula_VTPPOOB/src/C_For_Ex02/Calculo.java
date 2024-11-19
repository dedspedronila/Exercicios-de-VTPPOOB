
package C_For_Ex02;


public class Calculo {
    private int num1, num2;
    private String imprimir ="";
    public String Lista_de_Numeros(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
        
        
        for(int cont = this.num1; cont <= this.num2;cont++){
            this.imprimir += cont;
           
        }
    return this.imprimir;
    }
}
