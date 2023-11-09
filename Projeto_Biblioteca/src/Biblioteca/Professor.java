package Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa {
	private int numeroRegistro;

	//CONSTRUTOR
	public Professor(String nome, int idade, String endereco, int numeroRegistro) {
		super(nome, idade, endereco);
		this.numeroRegistro = numeroRegistro;
		this.livrosEmprestados = new ArrayList<>();
	}

	//METODOS
	@Override
	public String getTipo() {
		// TODO Auto-generated method stub
		return "Professor";
	}

	//GETS E SETS
	public int getNumeroRegistro() {
		return numeroRegistro;
	}

	public void setNumeroRegistro(int numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}
}