package servico;

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.util.Random;

public class GeradorAleatorioImpl extends UnicastRemoteObject implements GeradorAleatorio {

    public GeradorAleatorioImpl() throws RemoteException {
        super();
    }

    @Override
    public int gerarNumero() throws RemoteException {
        Random gerador = new Random();
        
        int numeroSorteado = gerador.nextInt(101) + 50;
        
        System.out.println("Foi solicitado um número. A enviar: " + numeroSorteado);
        
        return numeroSorteado;
    }
}
