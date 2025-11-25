package dev.java10x.CadastroDeNinjas.Ninjas;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @GetMapping("/boasVindas")
    public String boasVindas(){
        return "Bem vindo ao cadastro de ninjas";
    }

    // Adicionar ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja criado com sucesso!";
    }

    // Mostrar todos os ninjas (READ)
    @GetMapping("/listar")
    public String mostrarTodosNinjas(){
        return "Mostrando todos os ninjas";
    }

    // Mostrar ninja por id (READ)
    @GetMapping("/ninjas/listarID")
    public String mostrarTodosNinjasPorId(){
        return "Mostrando ninja por id";
    }

    // Alterar dados dos ninjas (UPDATE)
    @PutMapping("/ninjas/alterarID")
    public String alterarNinjaPorId(){
        return "Alterar ninja por id";
    }

    // Deletar ninja por id (DELETE)
    @DeleteMapping("/ninjas/deletarID")
    public String deletarNinjaPorId(){
        return "Deletar ninja por id";
    }
}
