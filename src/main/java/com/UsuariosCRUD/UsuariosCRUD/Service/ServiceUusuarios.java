package com.UsuariosCRUD.UsuariosCRUD.Service;

import com.UsuariosCRUD.UsuariosCRUD.Entity.Usuarios;

import java.util.List;

public interface ServiceUusuarios {

    public List<Usuarios> listarTodosLosUsuarios();

    public  Usuarios guardarUsuarios(Usuarios usuarios);

    public Usuarios obtenerUsuarios(Long id);

    public Usuarios actualizarUsuarios(Usuarios usuarios);

    public  void  eliminarUsuarios(Long id);
}
