
package F_Encapsulamento_Ex08;



public class Tres_numerosDAO {
    private String resultado;
    
    public String Calculo(Tres_numerosDTO tres_numerosDTO){
        if((tres_numerosDTO.getNum1() <= tres_numerosDTO.getNum2() ) && (tres_numerosDTO.getNum1() <= tres_numerosDTO.getNum3())){
            if(tres_numerosDTO.getNum2()< tres_numerosDTO.getNum3()){
            this.resultado = tres_numerosDTO.getNum1() + "  " + tres_numerosDTO.getNum2() + "  " + tres_numerosDTO.getNum3();
            }
            else{
            this.resultado = tres_numerosDTO.getNum1() + "  " + tres_numerosDTO.getNum3() + "  " + tres_numerosDTO.getNum2();
            }
        }
        else if((tres_numerosDTO.getNum2() <= tres_numerosDTO.getNum1())&& (tres_numerosDTO.getNum2() <= tres_numerosDTO.getNum3())){
            if(tres_numerosDTO.getNum1() < tres_numerosDTO.getNum3()){
            this.resultado = tres_numerosDTO.getNum2() + "  " + tres_numerosDTO.getNum1() + "  " + tres_numerosDTO.getNum3();
            }
            else{
            this.resultado = tres_numerosDTO.getNum2() + "  " + tres_numerosDTO.getNum3() + "  " + tres_numerosDTO.getNum1();
            }
            
            
        }
        else if((tres_numerosDTO.getNum3() <= tres_numerosDTO.getNum1())&& (tres_numerosDTO.getNum3() <= tres_numerosDTO.getNum2())){
            if(tres_numerosDTO.getNum1() < tres_numerosDTO.getNum2()){
            this.resultado = tres_numerosDTO.getNum3() + "  " + tres_numerosDTO.getNum1() + "  " + tres_numerosDTO.getNum2();
        }
            else{
                this.resultado = tres_numerosDTO.getNum3() + "  " + tres_numerosDTO.getNum2() + "  " + tres_numerosDTO.getNum1();
                
            }}
        return this.resultado;
    }
}
