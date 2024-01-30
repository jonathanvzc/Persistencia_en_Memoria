package org.jonathanzepeda.PersistenciaMemoria;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("/users")
    public String getUsers(Model model) {
        // Simulamos una lista de usuarios
        List<User> users = new ArrayList<>();
        users.add(new User(1, "John", "Doe", "john.doe@example.com"));
        users.add(new User(2, "Jane", "Smith", "jane.smith@example.com"));

        model.addAttribute("users", users);
        return "users";
    }
}