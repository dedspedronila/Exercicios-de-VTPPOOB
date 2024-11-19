
package G_Herança_Ex01;


public class MotoDAO extends VeiculoDAO {
    public String imprimiDadosMoto(MotoDTO motoDTO){
        return imprimiDadosVeiculo(motoDTO) +
                "\nA cilindrada é: " + motoDTO.getCilindrada() +
                "\nO tipo do motor é: " + motoDTO.getTipo_motor();
    }
    
}
