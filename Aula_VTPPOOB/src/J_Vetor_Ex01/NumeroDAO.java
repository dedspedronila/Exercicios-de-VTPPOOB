
package J_Vetor_Ex01;


public class NumeroDAO {
    private String resposta = "";
    
    public String verificarPosicao(NumeroDTO numeroDTO){
        int n[] = numeroDTO.getN();
        for(int cont = 0; cont < n.length; cont++){
            if(cont % 2 == 0){
                this.resposta += n[cont] + "\n";
            }
        }
        return this.resposta;
    }
}
