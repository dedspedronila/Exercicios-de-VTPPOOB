
package M_TreinoProva_Ex02;


public class Metodos {
    private String imprimir;
    
    public String Calcular(){
        this.imprimir = "";
        for(int cont = 1; cont <= 10; cont++){
            this.imprimir +=  cont + "\n";
        }
        return this.imprimir;
    }


}
