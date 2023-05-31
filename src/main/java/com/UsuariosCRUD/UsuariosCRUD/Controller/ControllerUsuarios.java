package com.UsuariosCRUD.UsuariosCRUD.Controller;


import com.UsuariosCRUD.UsuariosCRUD.Entity.Usuarios;
import com.UsuariosCRUD.UsuariosCRUD.Service.ServiceUusuarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControllerUsuarios {

    @Autowired
    ServiceUusuarios serviceUsuarios;

    //para mostrar lista de estudiante
    @GetMapping({"/usuarios", "/"})
    public String listarUsuarios(Model model){
        model.addAttribute("usuarios", serviceUsuarios.listarTodosLosUsuarios());
        return "usuarios";
    }

    //metodo mostrar el formulario para rellenar
    @GetMapping("/usuarios/nuevo")
    public String mostrarFormularioregistro(Model model){
        Usuarios usuarios = new Usuarios();
        model.addAttribute("usuarios", usuarios);
        return "crear_usuarios";
    }

    //metodo crear estudiante
    @PostMapping("/usuarios")
    public String guardarUsuarios(@ModelAttribute("usuarios") Usuarios usuarios){
        serviceUsuarios.guardarUsuarios(usuarios);
        return "redirect:/usuarios";
    }

    //metodo para mostrar formulario con datos estudiantes
    @GetMapping("/usuarios/editar/{id}")
    public String mostrarFormulario(@PathVariable Long id, Model model){
        model.addAttribute("usuarios", serviceUsuarios.obtenerUsuarios(id));
        return "editar_usuarios";

    }

    //metodo para actualizar datos del usuario
    @PostMapping("/usuarios/{id}")
    public String actualizarUsuarios(@PathVariable Long id, @ModelAttribute("usuarios") Usuarios usuarios, Model model){
        Usuarios usuariosExistente = serviceUsuarios.obtenerUsuarios(id);
        usuariosExistente.setNombre(usuarios.getNombre());
        usuariosExistente.setEdad(usuarios.getEdad());
        usuariosExistente.setCorreo(usuarios.getCorreo());
        serviceUsuarios.actualizarUsuarios(usuariosExistente);
        return "redirect:/usuarios";

    }

    //metodo para eliminar usuario
    @GetMapping("usuarios/{id}")
    public String eliminarUsuarios(@PathVariable Long id){
        serviceUsuarios.eliminarUsuarios(id);

        return "redirect:/usuarios";

    }



}
