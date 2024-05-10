package com.example.demo.Dao;

import java.util.List;
import com.example.demo.Models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;

public interface usuarioDao {
    List<Usuario> getUsuarios();
    void deleteUsuario(@PathVariable int id);
    void insertUsuario(Usuario usuario);
}
