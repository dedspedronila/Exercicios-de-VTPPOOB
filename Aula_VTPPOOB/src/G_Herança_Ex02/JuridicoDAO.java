
package G_Herança_Ex02;


public class JuridicoDAO extends ClienteDAO{
    public String MostraDadosJuridico(JuridicoDTO juridicoDTO){
        return  MostraDadosCliente(juridicoDTO) +
                "\nO CNPJ é: " + juridicoDTO.getCnpj() +
                "\n A IE é: " + juridicoDTO.getIe();
    }
}
