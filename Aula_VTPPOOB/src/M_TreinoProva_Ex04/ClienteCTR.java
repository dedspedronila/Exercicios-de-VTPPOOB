
package M_TreinoProva_Ex04;


public class ClienteCTR {
    ClienteDAO clienteDAO = new ClienteDAO();
    
    public String Cadastro(ClienteDTO clienteDTO){
        return clienteDAO.Cadastro(clienteDTO);
    }
}
