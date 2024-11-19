
package H_Polimorfismo_Ex01;


public class ClienteCTR {
    ClienteDAO clienteDAO = new ClienteDAO();
    public String mostrarInformações(ClienteDTO clienteDTO){
        return clienteDAO.mostrarInformações(clienteDTO);
    }
}
