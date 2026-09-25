package servico;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GeradorAleatorio extends Remote {
    
    int gerarNumero() throws RemoteException;
    
}
