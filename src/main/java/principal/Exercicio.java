package principal;
import javax.swing.JOptionPane;
import java.util.*;

public class Exercicio {

    public static void main(String[] args) {

        int quantidadeDeCliente = 0;
        Set<Cliente> clientes = new HashSet<Cliente>();


        System.out.println("******************** Início ************************");
        System.out.println("Sistema de cadastro de clientes");

        String quantidade = JOptionPane.showInputDialog("Por favor, digite a quantidade de clientes que deseja cadastrar:");
        quantidadeDeCliente = Integer.parseInt(quantidade);

            for(int x = 0; x < quantidadeDeCliente; x++){

                Cliente cliente = new Cliente();


                cliente.setNome(JOptionPane.showInputDialog("Favor digitar o primeiro nome do cliente: "));
                cliente.setSexo(JOptionPane.showInputDialog("Favor digitar M para sexo masculino e F para sexo feminino: "));

                clientes.add(cliente);

        }

        List<Cliente> clientesSexoMasculinos = new ArrayList<Cliente>();
        List<Cliente> clientesSexoFemininos = new ArrayList<Cliente>();

        for(Cliente cliente : clientes){
            if (cliente.getSexo().equals("M")) {
                clientesSexoMasculinos.add(cliente);
            } else if (cliente.getSexo().equals("F")){
                clientesSexoFemininos.add(cliente);
            }
        }

        System.out.println("Foram cadastrados: " + clientes.size() + " clientes.");
        System.out.println("Abaixo lista de clientes do sexo masculino: ");
        System.out.println(clientesSexoMasculinos);
        System.out.println("Abaixo lista de clientes do sexo feminino: ");
        System.out.println(clientesSexoFemininos);
    }
}
