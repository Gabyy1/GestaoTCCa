package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import entity.Aluno;



public class AlunoDAO {
    
    private Connection connection;
    
    public AlunoDAO() {
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            String DATABASE_URL = "jdbc:derby://localhost:1527/MyDB";
            String usuario = "root";
            String senha = "alunofatec";
            this.connection = DriverManager.getConnection(DATABASE_URL, usuario, senha);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Aluno> listar() {
        String sql = "SELECT * FROM Alunos";
        List<Aluno> retorno = new ArrayList<>();
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet resultado = stmt.executeQuery();
            while (resultado.next()) {
                Aluno aluno = new Aluno();
                aluno.setRA(resultado.getString("RA"));
                aluno.setCurso(resultado.getString("Curso"));
                aluno.setNome(resultado.getString("Nome"));
                aluno.setCpf(resultado.getString("Cpf"));
                aluno.setTel(resultado.getString("Contato"));
                retorno.add(aluno);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }

    public boolean inserir(Aluno Aluno) {
        String sql = "INSERT INTO Alunos(nome, cpf, telefone) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, Aluno.getNome());
            stmt.setString(2, Aluno.getCpf());
            stmt.setString(3, Aluno.getTel());
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean alterar(Aluno Aluno) {
        String sql = "UPDATE Alunos SET nome=?, cpf=?, telefone=? WHERE id=?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, Aluno.getNome());
            stmt.setString(2, Aluno.getCpf());
            stmt.setString(3, Aluno.getTel());
            stmt.setString(4, Aluno.getRA());
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean remover(Integer id) {
        String sql = "DELETE FROM Alunos WHERE id=?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AlunoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
}