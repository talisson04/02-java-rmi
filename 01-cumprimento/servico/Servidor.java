package servidor;

import servico.GeradorAleatorioImpl;
import java.rmi.Naming;

public class Servidor {
    public static void main(String[] args) {
        try {
            GeradorAleatorioImpl servico = new GeradorAleatorioImpl();
            
            Naming.rebind("rmi://localhost:1099/ServicoAleatorio", servico);
            
            System.out.println("Servidor RMI pronto e a aguardar conexões...");
            
        } catch (Exception e) {
            System.out.println("Ocorreu um erro no servidor: " + e.getMessage());
        }
    }
}
