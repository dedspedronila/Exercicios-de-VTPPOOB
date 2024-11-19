
package G_Herança_Ex02;


public class ClienteDAO {
    public String MostraDadosCliente(ClienteDTO clienteDTO){
        return "O nome é: " + clienteDTO.getNome() + 
                "\n o endereço é: " + clienteDTO.getEndereco() + 
                "\n a cidade é: " + clienteDTO.getCidade() +
                "\n o estado é: " + clienteDTO.getEndereco() +
                "\n o número é: " + clienteDTO.getNumero();
    }
}
