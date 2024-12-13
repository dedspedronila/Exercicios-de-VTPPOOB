
package K_Matriz_Ex02;


public class MatrizDAO {
private String resposta ="";

public String exibeMatriz(MatrizDTO matrizDTO){
    int n[][] = matrizDTO.getN();
    for(int linha = 0; linha < 3 ; linha++){
        for(int coluna = 0; coluna < 3; coluna++){
           this.resposta += n[linha][coluna] + "  ";

        }
        this.resposta += "\n";
    }
    return this.resposta;
}
public String exibeDiagonal(MatrizDTO matrizDTO){
    this.resposta = ""; 
    int n[][] = matrizDTO.getN();
    for(int linha = 0; linha < 3 ; linha++){
        for(int coluna = 0; coluna < 3; coluna++){
            if(linha == coluna){
           this.resposta += n[linha][coluna] + "  ";

        }
            else{
                this.resposta += " ";
            }
        }
        this.resposta += "\n";
    }
    return this.resposta;
}
}
