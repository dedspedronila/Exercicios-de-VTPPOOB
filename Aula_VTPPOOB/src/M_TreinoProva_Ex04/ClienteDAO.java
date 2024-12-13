
package M_TreinoProva_Ex04;


public class ClienteDAO {
   private String resultado = "";
   
   public String Cadastro(ClienteDTO clienteDTO){
       this.resultado = "O nome do cliente é : " + clienteDTO.getNome() +
                 "\n" +  "A sua idade é: " + clienteDTO.getIdade() +
                 "\n" + "O seu RG é : " + clienteDTO.getRg() +
                "\n" + "O seu CPF é: " + clienteDTO.getCpf() +
                "\n" + "O seu telefone é: " + clienteDTO.getTelefone() + 
                "\n" + "O endereço é: " + clienteDTO.getEndereço() ;
      
               return this.resultado;
    }
}
