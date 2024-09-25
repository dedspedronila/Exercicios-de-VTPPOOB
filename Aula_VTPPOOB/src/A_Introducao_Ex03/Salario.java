
package A_Introducao_Ex03;


public class Salario {
    
    private double sal, porcentagem, sal_f, soma;
    
    public double Calculo (double sal, double porcentagem)
    {
        this.sal = sal;
        this.porcentagem = porcentagem;
        
        this.soma = 1 + this.porcentagem;
        
        this.sal_f = (this.sal * this.soma);
        
        return this.sal_f;
    
    
    
    }
    
}
