
package F_Encapsulamento_Ex07;

public class NumerosDAO {
    
    private String resultado;
    
    public String Calculo(NumerosDTO numerosDTO){
      
       
        
        if((numerosDTO.getNum4() < numerosDTO.getNum1())){
            this.resultado = numerosDTO.getNum3() + "  " +numerosDTO.getNum2() + "  " + numerosDTO.getNum1() + "  " + numerosDTO.getNum4();
        } else if((numerosDTO.getNum4()> numerosDTO.getNum1()) && (numerosDTO.getNum4() <= numerosDTO.getNum2())){
            this.resultado = numerosDTO.getNum3() + "  " +numerosDTO.getNum2() + "  " +numerosDTO.getNum4() + "  " + numerosDTO.getNum1();
        } else if((numerosDTO.getNum4() > numerosDTO.getNum2()) && (numerosDTO.getNum4() <= numerosDTO.getNum3())){
            this.resultado = numerosDTO.getNum3() + "  " +numerosDTO.getNum4() + "  " +numerosDTO.getNum2() + "  " +numerosDTO.getNum1();
        } else if((numerosDTO.getNum4() >= numerosDTO.getNum3())){
            this.resultado = numerosDTO.getNum4()+ "  " + numerosDTO.getNum3() + "  " + numerosDTO.getNum2() + "  " +numerosDTO.getNum1();
        }else{
            this.resultado = "Inválido";
        }
          
       return this.resultado;
    }
}
