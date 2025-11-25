package dev.java10x.CadastroDeNinjas.Missoes;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissaoController {

    @GetMapping("/missoes/boasVindas")
    public String boasVindas() {
        return "Seja muito bem vindo ao cadastro de missões!";
    }

    @GetMapping("/listar")
    public String listarMissao(){
        return "Missão listadas com sucesso!";
    }

    @PostMapping("/criar")
    public String criarMissao(){
        return "Missão criada com sucesso!";
    }

    @PutMapping("/alterarID")
    public String alterarMissao(){
        return "Missao alterada com sucesso!";
    }

    @DeleteMapping("/deletarID")
    public String deletarMissao(){
        return "Missao deletada com sucesso!";
    }
}
