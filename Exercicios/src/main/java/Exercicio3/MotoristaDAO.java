
package Exercicio3;

public class MotoristaDAO {
    private String resultado;
    public String mostraIdade(MotoristaDTO motoristaDTO){
        if(motoristaDTO.getIdade() >= 18){
            this.resultado = "Você pode dirigir!" ;
        }
        else{
            this.resultado = "Você não pode dirigir!";
        }
        
        return this.resultado;
    }
}
