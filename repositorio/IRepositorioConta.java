package repositorio;

import modelo.Conta;

public interface IRepositorioConta {
    void inserirConta(Conta c);
    void alterarConta(Conta c);
    void removerConta(int numero);
    Conta buscarConta(int numero);
    boolean verificarExistenciaConta(int numero);
    Conta[] buscarTodos();
}
