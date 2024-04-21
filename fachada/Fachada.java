package fachada;

import modelo.Conta;
import repositorio.IRepositorioConta;
import java.util.ArrayList;

public class Fachada implements IFachada {
    private final IRepositorioConta repositorio;

    public Fachada(IRepositorioConta repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public void inserirConta(Conta c) {
        repositorio.inserirConta(c);
    }

    @Override
    public void alterarConta(Conta c) {
        repositorio.alterarConta(c);
    }

    @Override
    public void removerConta(int numero) {
        repositorio.removerConta(numero);
    }

    @Override
    public Conta buscarConta(int numero) {
        return repositorio.buscarConta(numero);
    }

    @Override
    public ArrayList<Conta> buscarTodas() {
        Conta[] contas = repositorio.buscarTodos();
        ArrayList<Conta> listaDeContas = new ArrayList<>();
        for (Conta conta : contas) {
            if (conta != null) { // Verificar para garantir que não estamos adicionando nulls à lista.
                listaDeContas.add(conta);
            }
        }
        return listaDeContas;
    }
}
