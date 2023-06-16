package persistence;

import java.util.List;

import boundary.BProfessor;

public interface IProfessorDao {
	
	void inserir(BProfessor p);
	void alterar (String nome, String email, String tel, BProfessor p);
	void excluir(BProfessor p);
	List<BProfessor> pesquisarPorNum (String nome);

}