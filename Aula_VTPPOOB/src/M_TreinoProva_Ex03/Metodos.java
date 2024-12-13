
package M_TreinoProva_Ex03;


public class Metodos {
    private int numero;
    private String resultado;
    
    public String Numero(int numero){
        this.numero = numero;
        this.resultado = "";
        
        if(this.numero > 0){
           this.resultado = "O número: " + this.numero + " É positivo";
        }
        else if(this.numero < 0 ){
            this.resultado = "O número: " + this.numero + " É negativo";
        }
        else if(this.numero == 0){
            this.resultado = "O número: " + this.numero + " É zero";
        }
       return this.resultado; 
    }
}
