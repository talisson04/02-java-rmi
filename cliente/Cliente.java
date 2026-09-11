package cliente;

import java.io.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import servico.Cumprimento;

public class Client {
  public static void main(String[] args) {
    String host = (args.length < 1) ? null : args[0];
    
    try {
      Registry registry = LocateRegistry.getRegistry(host);
      Cumprimento stub = (Cumprimento) registry.lookup("ServiçoDeCumprimentoRemoto");

      String resposta = stub.cumprimentar();
      
      System.out.println("Resposta do servidor: " + resposta);
      //InputStreamReader in = new InputStreamReader(System.in);
      //in.read();
    } catch (Exception e) {
      System.err.println("Erro no cliente: " + e.toString());
      e.printStackTrace();
    }
  }
}
