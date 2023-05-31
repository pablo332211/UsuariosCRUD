package com.UsuariosCRUD.UsuariosCRUD.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "edad", nullable = false)
    private long edad;

    @Column(name = "correo", nullable = false, length = 50,unique = true)
    private String correo;


    public Usuarios() {
    }

    public Usuarios(Long id) {
        this.id = id;
    }

    public Usuarios(Long id, String nombre, long edad, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getEdad() {
        return edad;
    }

    public void setEdad(long edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }


}
