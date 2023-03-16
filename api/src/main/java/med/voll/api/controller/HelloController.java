package med.voll.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    /**
     * Este método retorna a mensagem "Hello World!".
     *
     * @return A mensagem "Hello World!" como uma String.
     */
    @GetMapping
    public String helloWString() {
        return "Hello World! GUILHERME";
    }
}

// Este é um código simples escrito em Java usando o framework Spring Boot. O código define um controlador REST que expõe um único endpoint HTTP GET no caminho "/hello". Quando alguém acessa este endpoint, a mensagem "Hello World!" será retornada como resposta. Vamos analisar o código em detalhes:

// package med.voll.api.controller;: Define o pacote onde a classe HelloController está localizada.

// Importações:

// import org.springframework.web.bind.annotation.GetMapping;: Importa a anotação @GetMapping do Spring Framework, que é usada para mapear solicitações HTTP GET em métodos específicos.
// import org.springframework.web.bind.annotation.RequestMapping;: Importa a anotação @RequestMapping do Spring Framework, que é usada para mapear um caminho de URL específico em uma classe ou método.
// import org.springframework.web.bind.annotation.RestController;: Importa a anotação @RestController do Spring Framework, que indica que a classe é um controlador REST e que suas respostas devem ser serializadas diretamente no corpo da resposta.
// @RestController: Anotação que marca a classe HelloController como um controlador REST.

// @RequestMapping("/hello"): Anotação que mapeia todas as solicitações para este controlador com o caminho "/hello". Isso significa que todos os métodos dentro desta classe terão esse caminho como prefixo.

// public class HelloController { ... }: Define a classe HelloController.

// @GetMapping: Anotação que mapeia o método helloWString() para lidar com solicitações HTTP GET. Como não há um caminho específico fornecido, ele usará o caminho mapeado na classe ("/hello").

// public String helloWString() { ... }: Método helloWString(), que retorna uma string "Hello World!".

// Quando o aplicativo Spring Boot é iniciado, ele cria automaticamente um endpoint HTTP GET em "/hello" que, quando acessado, retornará a mensagem "Hello World!".
