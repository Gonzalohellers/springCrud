package com.example.demo.Controllers;

import com.example.demo.Models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Dao.usuarioDaoImp;
import com.example.demo.Dao.usuarioDao;
import java.util.List;
import java.util.ArrayList;

@CrossOrigin(origins = "http://localhost:4321")
@RestController
public class usuarioController implements usuarioDao{
    @Autowired
    usuarioDaoImp usuariodao;

    @RequestMapping(value="usuario")
    public Usuario getUsuario(){
        Usuario usuario=new Usuario(1,"root", "root1");
        return usuario;
    }

    @RequestMapping(value = "get-usuarios")
    @Override
    public List<Usuario> getUsuarios() {
        return usuariodao.getUsuarios();
    }
}
