package servico;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Cumprimento extends Remote {
  String cumprimentar() throws RemoteException;
}
