
package I_Interface_Ex02;


public class CasaDAO implements ICasaDAO{
    private String mensagem;
    
    public String publicarDados(CasaDTO casaDTO){
        this.mensagem  = "O endereço é : " + casaDTO.getEndereco() +
                "\nO número da casa é: " + casaDTO.getNumero() + 
                "\nO bairro é: " + casaDTO.getBairro() + 
                "\nA cidade é: " + casaDTO.getCidade() + 
                "\n O proprietário do Imóvel é: " + casaDTO.getProprietario() +
                "\n O número de quartos da residência é: " + casaDTO.getN_quartos() + 
                "\n O número de banheiros da residência é: " + casaDTO.getN_banheiros();
                
       
        return this.mensagem;
    }
}
