
package A_Introducao_Ex02;


public class Media {
    
    
    private double nota1, nota2, nota3, media;
    private int peso1, peso2, peso3;
    
    
    public double Calculo (double nota1, double nota2, double nota3,int peso1, int peso2, int peso3)
    {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.peso1 = peso1;
        this.peso2 = peso2;
        this.peso3 = peso3;
        
        this.media = ((this.nota1 * this.peso1) + (this.nota2 * this.peso2) + (this.nota3 * this.peso3)) / (this.peso1 + this.peso2 + this.peso3);
        
        return this.media;
    
    }

   
}
