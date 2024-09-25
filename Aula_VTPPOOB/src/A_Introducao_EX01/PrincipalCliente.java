package A_Introducao_EX01;

import javax.swing.JOptionPane;

public class PrincipalCliente {
    
    public static void main(String[] args){
        
        
        Cliente cliente = new Cliente();
        
        System.out.println("==== Chamando os métodos do objeito ====\n");
        
//        JOptionPane.showMessageDialog(null,cliente.Mostrar(JOptionPane.showInputDialog("Informe o nome: "), 
//                                                           JOptionPane.showInputDialog("Informe o RG: ")));
        
        // ou dessa forma:
         String nome = JOptionPane.showInputDialog("Informe o nome: ");
         String rg =   JOptionPane.showInputDialog("Informe o RG: ");
         JOptionPane.showMessageDialog(null,cliente.Mostrar(nome,rg));
        
        
     //   cliente.mostrarNome("Prof. André Gobbi");
       
        
        System.out.println("==== Fim da chamada aos métodos do objeto ====\n");
        
    }//Fecha main   
}//Fecha classe
