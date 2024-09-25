
package A_Introducao_Ex04;


public class Salario {
   private double sal, vendas, comissao, sal_f;
   
   public String Calculo(double sal, double vendas){
       this.sal = sal;
       this.vendas = vendas;
       this.comissao = this.vendas * 0.04;
       this.sal_f = this.sal + this.comissao;
   
   return "O seu salario final é: " + this.sal_f + " A sua comissão é : " + this.comissao;
   
   }
}
