package com.example.demo.Dao;

import com.example.demo.Models.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class usuarioDaoImp implements usuarioDao{
    @PersistenceContext
    private EntityManager entityManager;


  @Override
    public List<Usuario> getUsuarios() {
      String query="SELECT u FROM Usuario u";
        return entityManager.createQuery(query).getResultList();
    }
    public Usuario getUsuario(int id) {
       String query="select * from usuario where id="+id;
       return (Usuario) entityManager.createQuery(query).getSingleResult();

  }
}
