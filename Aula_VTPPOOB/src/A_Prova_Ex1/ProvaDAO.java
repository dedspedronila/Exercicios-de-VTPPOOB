package A_Prova_Ex1;

public class ProvaDAO {
   
   public String Calculo(ProvaDTO provaDTO){
      provaDTO.setValor_hora_trab((1/8) *  1.412);
      provaDTO.setValor_hora_ex((1/4) * 1.412);
      provaDTO.setSal_bruto(provaDTO.getHora_trab() * provaDTO.getValor_hora_trab());
      provaDTO.setTotal_hora_ex(provaDTO.getHora_ex() * provaDTO.getValor_hora_ex());
      provaDTO.setSal_final(provaDTO.getSal_bruto() + provaDTO.getTotal_hora_ex());
      
      return  "O valor de cada hora trabalhada é de: " + provaDTO.getValor_hora_trab() + "\n"
             + "O valor de cada hora extra é de: " + provaDTO.getValor_hora_ex() + "\n"
             + "O Valor do Salário Bruto é de: " + provaDTO.getSal_bruto() + "\n"
             + "O valor total a receber pelas horas extras é de: " + provaDTO.getTotal_hora_ex() + "\n"
             + "O valor do salário final é de: " + provaDTO.getSal_final();
   }
}