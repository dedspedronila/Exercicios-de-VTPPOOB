
package B_IF_Ex04;
import javax.swing.JOptionPane;
public class Exibe_Medidas {
        
    public static void main(String[] args){
        Classificacao classificacao = new Classificacao();
        
        JOptionPane.showMessageDialog(null, "Esse programa é responsável por avaliar sua classifcação com base em altura e peso\n"
                + "Para isso, é necessário que informe sua altura em metros(ex:1.20) e seu peso em KG(ex:68)");
    
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura em metro: "));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso em KG: "));
    
        JOptionPane.showMessageDialog(null, classificacao.Calculo(altura, peso));
    
    }
}
