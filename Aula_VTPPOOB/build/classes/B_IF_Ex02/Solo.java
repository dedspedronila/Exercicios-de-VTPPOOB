
package B_IF_Ex02;


public class Solo {
    private double quantidade;
    private String resposta;
    
    public String Calculo(double quantidade){
        this.quantidade = quantidade;
        
        if(quantidade <=10){
            this.resposta = "a amostra é rochosa!";
        }else if((quantidade > 10) &&(quantidade <= 40)){
            this.resposta = "a amostra é firme!";
        } else if((quantidade > 40) && (quantidade <= 80)){
            this.resposta = "a amostra é pantanosa!";        
        }else {
            this.resposta = "quantidade de água inválida!";
        }
    
        return this.resposta;
    }
    
}
