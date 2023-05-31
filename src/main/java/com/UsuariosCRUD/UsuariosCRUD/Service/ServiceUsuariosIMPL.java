package com.UsuariosCRUD.UsuariosCRUD.Service;


import com.UsuariosCRUD.UsuariosCRUD.Entity.Usuarios;
import com.UsuariosCRUD.UsuariosCRUD.Repository.RepositoryUusuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceUsuariosIMPL  implements ServiceUusuarios{

    @Autowired
    private RepositoryUusuarios repositoryUsuarios;


    @Override
    public List<Usuarios> listarTodosLosUsuarios() {
        return repositoryUsuarios.findAll();
    }

    @Override
    public Usuarios guardarUsuarios(Usuarios usuarios) {
        return repositoryUsuarios.save(usuarios);
    }

    @Override
    public Usuarios obtenerUsuarios(Long id) {
        return repositoryUsuarios.findById(id).get();
    }

    @Override
    public Usuarios actualizarUsuarios(Usuarios usuarios) {
        return repositoryUsuarios.save(usuarios);
    }


    @Override
    public void eliminarUsuarios(Long id) {

        repositoryUsuarios.deleteById(id);

    }

}
