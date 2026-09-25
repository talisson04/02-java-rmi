package cliente;

import servico.GeradorAleatorio;
import java.rmi.Naming;

public class Cliente {
    public static void main(String[] args) {
        try {
            System.out.println("A procurar o serviço no servidor...");
            
            GeradorAleatorio servico = (GeradorAleatorio) Naming.lookup("rmi://localhost:1099/ServicoAleatorio");
            
            int resultado = servico.gerarNumero();
            
            System.out.println("Sucesso! Número aleatório recebido do servidor: " + resultado);
            
        } catch (Exception e) {
            System.out.println("Ocorreu um erro no cliente: " + e.getMessage());
        }
    }
}
