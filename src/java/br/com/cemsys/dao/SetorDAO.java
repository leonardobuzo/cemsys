/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.cemsys.dao;

import br.com.cemsys.modelo.Setor;
import br.com.cemsys.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Leonardo
 */
public class SetorDAO implements GenericDAO{
    
    private Connection conn;
    private PreparedStatement stmt;
    private ResultSet rs;

    public SetorDAO() {   
        try{
            this.conn = ConnectionFactory.conectar();
        }catch(Exception e){
            System.out.println("Erro ao conectar ao BD " + e.getMessage());
        }
    }
 
    @Override
    public Boolean cadastrar(Object object) throws Exception {
        Boolean retorno = true;
        
        try{
            String sql = "insert into cliente (nome, email, senha, telefone) values (?,?,?,?);";
            Setor setor = (Setor) object;
            stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, setor.getNome().toUpperCase());

            
            stmt.execute();
            
        }catch (Exception e){
            retorno = false;
            System.out.println("Erro ao cadastrar clienteDAO " + e.getMessage());
        }finally{
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }
        return retorno;
    }

    @Override
    public List<Object> listar() throws Exception {
        List<Object> lista = new ArrayList<>();
        
        try{
            String sql = "select * from setor order by descricaoSetor;";
            stmt = this.conn.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Setor setor = new Setor();
                setor.setId(rs.getInt("id"));
                setor.setDescricao(rs.getString("descricao"));
                
                lista.add(setor);
            }
            
        }catch (Exception e){
            System.out.println("Erro ao listar setorDAO " + e.getMessage());
        }finally{
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }
        return lista;
    }

    @Override
    public Object carregar(Integer id) throws Exception {
        Setor setor = new Setor();
        
        try{
            String sql = "select * from setor where id=?";
            stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, id);
            
            rs = stmt.executeQuery();
            rs.next();
            
            setor.setId(rs.getInt("id"));
            setor.setDescricao(rs.getString("descricao"));

            
        }catch(Exception e){
            System.out.println("Erro ao carregar setorDAO " + e.getMessage());
        }finally{
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }
        return setor;
    }

    @Override
    public Boolean alterar(Object object) throws Exception {
        Boolean retorno = true;
        
        try{
            String sql = "update setor set descricaoSetor = ? "
                        + "where id = ?;";
            Setor setor = (Setor) object;
            stmt = this.conn.prepareStatement(sql);
            
            stmt.setString(1, setor.getDescricao().toUpperCase());
            stmt.setInt(5, setor.getId());
           
            stmt.execute();
            
        }catch(Exception e){
            System.out.println("Erro ao alterar setorDAO " + e.getMessage());
        }finally{
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }
        return retorno;
    }

    @Override
    public Boolean excluir(Integer id) throws Exception {
        Boolean retorno = true;
        
        try{
            String sql = "delete from setor where id = ?";
            stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1,id);
            stmt.execute();
            
        }catch (Exception e){
            retorno = false;
            System.out.println("Erro ao excluir setorDAO " + e.getMessage());
        }finally{
            ConnectionFactory.fecharConexao(conn, stmt,rs);
        }
        return retorno;
    }
    
    public List<Object> listarPorNome(String pesquisa) throws Exception {
        List<Object> lista = new ArrayList<>();
        
        try{
            String sql = "select * from setor where nome like ? order by descricaoSetor;";
            stmt = this.conn.prepareStatement(sql);
            stmt.setString(1, "%" + pesquisa.toUpperCase() + "%");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Setor cliente = new Setor();
                setor.setId(rs.getInt("id"));
                setor.setDescricao(rs.getString("descricao"));

                
                lista.add(setor);
            }
            
        }catch (Exception e){
            System.out.println("Erro ao listarPorNome setorDAO " + e.getMessage());
        }finally{
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }
        return lista;
    }
    
    public List<Object> listarPorCodigo(Integer pesquisa) throws Exception {
        List<Object> lista = new ArrayList<>();
        
        try{
            String sql = "select * from setor where id = ?;";
            stmt = this.conn.prepareStatement(sql);
            stmt.setInt(1, pesquisa);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                Setor setor = new Setor();
                setor.setId(rs.getInt("id"));
                setor.setDescricao(rs.getString("descricao"));
                
                lista.add(setor);
            }
            
        }catch (Exception e){
            System.out.println("Erro ao listarPorCodigo setorDAO " + e.getMessage());
        }finally{
            ConnectionFactory.fecharConexao(conn, stmt, rs);
        }
        return lista;
        
    }
}

