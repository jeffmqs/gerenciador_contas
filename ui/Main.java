package ui;

import modelo.Conta;
import repositorio.RepositorioContaArrayList;
import fachada.Fachada;
import fachada.IFachada;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Crie o repositório e a fachada
        IFachada fachada = new Fachada(new RepositorioContaArrayList());

        // Vamos criar e inserir algumas contas como exemplo
        Conta novaConta1 = new Conta(1);
        Conta novaConta2 = new Conta(2);
        
        fachada.inserirConta(novaConta1);
        fachada.inserirConta(novaConta2);
        
        // Buscar e imprimir uma conta
        Conta conta = fachada.buscarConta(1);
        if (conta != null) {
            System.out.println("Conta encontrada: " + conta);
        } else {
            System.out.println("Conta não encontrada.");
        }
        
        // Buscar e imprimir todas as contas
        ArrayList<Conta> todasContas = fachada.buscarTodas();
        System.out.println("Todas as contas:");
        for (Conta c : todasContas) {
            System.out.println(c);
        }
        
        // Alterar conta
        conta.depositar(500); // Supondo que este método exista na classe Conta
        fachada.alterarConta(conta);
        
        // Remover conta
        fachada.removerConta(2);
        
        // Verificar novamente todas as contas após remoção
        todasContas = fachada.buscarTodas();
        System.out.println("Todas as contas após remoção:");
        for (Conta c : todasContas) {
            System.out.println(c);
        }
    }
}
