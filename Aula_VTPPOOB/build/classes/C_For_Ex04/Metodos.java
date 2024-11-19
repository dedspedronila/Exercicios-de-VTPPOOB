
package C_For_Ex04;


public class Metodos {
    private double altura,soma,media,maior;
    
    public void Soma(double altura){
        this.altura = altura;
        
        
        this.soma += this.altura;
        
        if(this.altura > 2.00){
           this.maior += 1;
        }
    }
    
    private double Media(){
        this.media = this.soma / 20;
        return this.media;
    }
    
    public String mostrar_informacoes(){
        return "A média das alturas é: " + Media() + " A quantidade de alturas maior que dois metros é: " + this.maior;
    }
}
