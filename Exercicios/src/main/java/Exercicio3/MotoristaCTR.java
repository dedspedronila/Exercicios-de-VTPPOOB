
package Exercicio3;


public class MotoristaCTR {
    MotoristaDAO motoristaDAO = new MotoristaDAO();
    
        public String mostraIdade(MotoristaDTO motoristaDTO){
            return motoristaDAO.mostraIdade(motoristaDTO);
        }

}
