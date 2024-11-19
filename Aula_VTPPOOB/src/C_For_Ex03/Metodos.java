
package C_For_Ex03;


public class Metodos {
    private int soma_num, num1;
    
    public void Soma(int num1){
       this.num1 = num1;
       
       this.soma_num += this.num1;
    }
    
    public int Exibir(){
        return this.soma_num;
}
}
