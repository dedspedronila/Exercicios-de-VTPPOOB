
package I_Interface_Ex02;

public class CasaDTO extends ImovelDTO implements ICasaDTO{
    private int n_quartos, n_banheiros;

    public int getN_quartos() {
        return n_quartos;
    }

    public void setN_quartos(int n_quartos) {
        this.n_quartos = n_quartos;
    }

    public int getN_banheiros() {
        return n_banheiros;
    }

    public void setN_banheiros(int n_banheiros) {
        this.n_banheiros = n_banheiros;
    }
    
}
