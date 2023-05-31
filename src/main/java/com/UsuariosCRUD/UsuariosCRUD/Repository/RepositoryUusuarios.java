package com.UsuariosCRUD.UsuariosCRUD.Repository;

import com.UsuariosCRUD.UsuariosCRUD.Entity.Usuarios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryUusuarios extends JpaRepository<Usuarios, Long> {



}