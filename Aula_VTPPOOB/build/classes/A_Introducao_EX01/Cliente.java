
package A_Introducao_EX01;

//import javax.swing.JOptionPane;

public class Cliente {
    private String nome, rg;
    
    
    
    public String Mostrar (String nome, String rg){
        this.nome = nome; //this mostra o atributo da classe, já o sem o this o vale para o método
        this.rg = rg;
       return "O nome informado foi: " + this.nome + 
               "\nO RG informado foi: " + this.rg;
    
    
    }
    
    
}  
    
    
    
    
    
    
    
    
    
//    public void Mostrar (String nome, String rg){
//        this.nome = nome; //this mostra o atributo da classe, já o sem o this o vale para o método
//        this.rg = rg;
//        JOptionPane.showMessageDialog(null, "O nome informado foi: " + this.nome + "\nO RG informado foi: " + this.rg);
//        
////        System.out.println("O nome informado foi: " +  
////                this.nome + " O RG informado foi: " + this.rg);
//    } //Fecha o método Mostrar
//    
//    
//    public void mostrarNome(String nome){
//        this.nome = nome;
//        JOptionPane.showMessageDialog(null, "O nome informado foi: "+ this.nome);
//        
////        System.out.println("O nome informado foi: " + this.nome);
//    }//Fecha o método mostrarNome
    
    
//}//Fecha a classe Cliente
