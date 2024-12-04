package controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;

import model.Aluno;
import model.Conexao;

import java.sql.ResultSet;

public class AlunoDao {

	Connection conn = null;
	PreparedStatement ps;
	Statement st;
	String sql = "";

	public void inserir(Aluno aluno) {
		sql = "INSERT INTO aluno(nome,cpf,email) VALUES(?,?,?)";

		try {
			conn = Conexao.getConn();
			ps = conn.prepareStatement(sql);
			ps.setString(1, aluno.getNome());
			ps.setString(2, aluno.getCpf());
			ps.setString(3, aluno.getEmail());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			System.out.println("Erro ao inserir");
		}
	}

	public ArrayList<Aluno> getLista() {
		ArrayList<Aluno> listar = new ArrayList<Aluno>();

		sql = "SELECT * FROM aluno";

		try {
			conn = Conexao.getConn();
			ResultSet resultado = conn.createStatement().executeQuery(sql);

			while (resultado.next()) {
				Aluno aluno = new Aluno();
				aluno.setId(resultado.getInt("id"));
				aluno.setNome(resultado.getString("nome"));
				aluno.setCpf(resultado.getString("cpf"));
				aluno.setEmail(resultado.getString("email"));
				listar.add(aluno);
			}
		} catch (SQLException e) {
			System.out.println("Erro ao listar");
		}
		return listar;
	}

	public void atualizar(Aluno aluno) {
		sql = "UPDATE aluno SET nome=?,cpf=?,email=? WHERE id=?";

		try {
			conn = Conexao.getConn();
			ps = conn.prepareStatement(sql);
			ps.setString(1, aluno.getNome());
			ps.setString(2, aluno.getCpf());
			ps.setString(3, aluno.getEmail());
			ps.setInt(4, aluno.getId());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			System.out.println("Erro ao atualizar");
		}
	}

	public void deletar(int valor) {
		sql="DELETE FROM aluno WHERE id="+valor;
		
		try {
			conn = Conexao.getConn();
			st = conn.createStatement();
			st.execute(sql);
			st.close();
		}catch(SQLException e) {
			System.out.println("erro ao deletar");
		}
	}
}
