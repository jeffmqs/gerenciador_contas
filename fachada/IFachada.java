
package fachada;

import java.util.ArrayList;

import modelo.Conta;

public interface IFachada {
	
	public void inserirConta(Conta c);
	public void alterarConta(Conta c);
	public void removerConta(int numero);
	public Conta buscarConta(int numero);
	public ArrayList<Conta> buscarTodas();

}