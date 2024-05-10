package com.example.demo.Controllers;

import com.example.demo.Models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.Dao.usuarioDaoImp;
import com.example.demo.Dao.usuarioDao;
import java.util.List;
import java.util.ArrayList;

@CrossOrigin(origins = "http://localhost:4321")
@RestController
public class usuarioController implements usuarioDao{
    @Autowired
    usuarioDaoImp usuariodao;

    @RequestMapping(value="usuario/{id}")
    public Usuario getUsuario(@PathVariable int id){
        return usuariodao.getUsuario(id);
    }

    @RequestMapping(value = "get-usuarios")
    @Override
    public List<Usuario> getUsuarios() {
        return usuariodao.getUsuarios();
    }

    @RequestMapping(value="get-usuario/{id}", method = RequestMethod.DELETE)
    public void deleteUsuario(@PathVariable int id){
        usuariodao.deleteUsuario(id);
    }

    @PostMapping(value = "usuario")
    public void insertUsuario(@RequestBody Usuario usuario){
        usuariodao.insertUsuario(usuario);
    }
}
