
package F_Encapsulamento_Ex01;

//A ordem de criação das classes é : DTO, DAO, CTR, VIEW

public class ClienteDTO {
    private String nome, rg;
    private int idade;

    public String getNome() { //O getNome, é usado para exibir o nome
        return nome;
    }

    public void setNome(String nome) { // O setNome, é usado para pedir o nome
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
} //Fecha a classe ClienteDTO
