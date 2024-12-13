
package K_Matriz_Ex02;


public class MatrizCTR {

    MatrizDAO matrizDAO = new MatrizDAO();
    
    public String exibeMatriz(MatrizDTO matrizDTO){
        return matrizDAO.exibeMatriz(matrizDTO);
    }
    public String exibeDiagonal(MatrizDTO matrizDTO){
        return matrizDAO.exibeDiagonal(matrizDTO);
    }
}
