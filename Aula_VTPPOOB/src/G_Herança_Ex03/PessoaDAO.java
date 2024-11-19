
package G_Herança_Ex03;


public class PessoaDAO {
    public String MostraDadosPessoa(PessoaDTO pessoaDTO){
        return  "O nome é: " + pessoaDTO.getNome() + 
                "\n o endereço é: " + pessoaDTO.getEndereco() + 
                "\n o telefone é: " + pessoaDTO.getTelefone() +
                "\n a idade é: " + pessoaDTO.getIdade();
    }
}
