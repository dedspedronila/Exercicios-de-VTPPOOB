
package D_While_DoWhile_Ex02;


public class Metodos_Ex02 {
    private String letra;
    private int qtd_a, qtd_e, qtd_i, qtd_o, qtd_u, qtd_c;
    
    public void Verificar(String letra){
        this.letra = letra;
        if(this.letra.equalsIgnoreCase("a")){
           this.qtd_a++;
       }
        else if(this.letra.equalsIgnoreCase("e")){
            this.qtd_e++;
        }else if(this.letra.equalsIgnoreCase("i")){
            this.qtd_i++;
        }else if(this.letra.equalsIgnoreCase("o")){
            this.qtd_o++;
        }else if(this.letra.equalsIgnoreCase("u")){
            this.qtd_u++;
        }
        else{
            if(!this.letra.equalsIgnoreCase("0"))
            this.qtd_c++;
        }
        
       
    
    }
    public String retornar(){
          return "O número de Vogal A é " + this.qtd_a
          +"\n O número de Vogal E é " + this.qtd_e
          +"\n O número de Vogal I é " + this.qtd_i
          +"\n O número de Vogal O é " + this.qtd_o
          +"\n O número de Vogal U é " + this.qtd_u
          +"\n O número de Consoantes é " + this.qtd_c;        
       }
    
}
