
package F_Encapsulamento_Ex10;

public class LancheDAO {
    private String resultado;
    
    public void Soma(LancheDTO lancheDTO){
        if(lancheDTO.getCodigo() == 1){
            lancheDTO.setNumero_h(lancheDTO.getNumero_h() + 1) ;
            lancheDTO.setValor_total(lancheDTO.getValor_total() + 1.50);
        }
        else if(lancheDTO.getCodigo() == 2){
            lancheDTO.setNumero_c(lancheDTO.getNumero_c() + 1);
            lancheDTO.setValor_total(lancheDTO.getValor_total() + 1.80);
        
        }
        else if(lancheDTO.getCodigo() == 3){
            lancheDTO.setNumero_m(lancheDTO.getNumero_m() + 1);
            lancheDTO.setValor_total(lancheDTO.getValor_total() + 1.20);
        }
        else if(lancheDTO.getCodigo() == 4){
            lancheDTO.setNumero_a(lancheDTO.getNumero_a() + 1);
            lancheDTO.setValor_total(lancheDTO.getValor_total() + 2.00);
        }
        else if(lancheDTO.getCodigo() == 5){
            lancheDTO.setNumero_q(lancheDTO.getNumero_q() + 1);
            lancheDTO.setValor_total(lancheDTO.getValor_total() + 1.00);
        }
        
    }
    
    public String Exibir(LancheDTO lancheDTO){
        
        if(lancheDTO.getNumero_h() > 0) {
            this.resultado += "Hamburguer " + lancheDTO.getNumero_h() +  " " + lancheDTO.getNumero_h() * 1.50 + "\n";
        }
        else if(lancheDTO.getNumero_c() > 0){
            this.resultado += "Cheeseburguer " + lancheDTO.getNumero_c() +  " " + lancheDTO.getNumero_c() * 1.80 + "\n";

        }
        else if(lancheDTO.getNumero_m() > 0){
            this.resultado += "Misto Quente " + lancheDTO.getNumero_m() +  " " + lancheDTO.getNumero_m() * 1.20 + "\n";

        }
        else if(lancheDTO.getNumero_a() > 0){
           this.resultado += "Americano " + lancheDTO.getNumero_a() +  " " + lancheDTO.getNumero_a() * 2.00 + "\n";

        }
        else if(lancheDTO.getNumero_q() > 0){
            this.resultado += "Queijo Prato " + lancheDTO.getNumero_q() +  " " + lancheDTO.getNumero_q() * 1.00 + "\n";

        }
        
        this.resultado += "\nTotal: " + lancheDTO.getValor_total();
        
        return this.resultado;
    }
    
}
