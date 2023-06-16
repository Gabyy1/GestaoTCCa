package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.Professor;

public class ProfessorDao {
	 private Connection connection;
	 
	 public void inserir(Professor p) {
			String sql = "Insert Into professor"
					+ "(numProfessor"
					+ "Values (" + p.getNumProfessor()+ ")";
			
			try {
				PreparedStatement ps = con.prepareStatement(sql);
				ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
					
		}
		
		public List<Professor> pesquisarPorNum(String numProfessor) {
			List<Professor> lista = new ArrayList<>();
			String sql = "SELECT * FROM professor WHERE num LIKE '%" + numProfessor + "%'";
			try {
				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				while(rs.next()) {
					Professor p = new Professor();
					p.setNumProfessor(rs.getString("num"));
					p.setNome(rs.getString("nome"));
					p.setEmail(rs.getString("email"));
					p.setTel(rs.getString("tel"));
					
					lista.add(p);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return lista;
		}

		
		public void excluir(Professor p) {
			String sql = "DELETE FROM professor "
					+ " WHERE num = " + p.getNumProfessor();
			try {
				PreparedStatement ps = con.prepareStatement(sql);
				ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		public void alterar (String nome, Professor p) {
			String sql = "UPDATE professor "
					+ "SET numProfessor = " + p.getNumProfessor() + ", nome = '" + p.getNome() + 
					"', tel = '" + p.getTel() + "', email = " + p.getEmail() 
					+ "WHERE nome = '" + nome + "'";
			try {
				PreparedStatement ps = con.prepareStatement(sql);
				ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
