
package G_Herança_Ex02;

public class FisicoDAO extends ClienteDAO{
    public String MostraDadosFisico(FisicoDTO fisicoDTO){
        return MostraDadosCliente(fisicoDTO) + 
                "\nO CPF é: " + fisicoDTO.getCpf() + 
               "\no RG é: " + fisicoDTO.getRg();
    }
}
