package loja.santanderpoints;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring Boot gerado via Spring Initializr.
 * Módulos utilizados:
 * - Spring Web (facilita a criação de aplicações web robustas e escaláveis);
 * - Spring Data JPA (simplifica a implementação de repositórios, oferece abstrações de alto nível);
 * - H2 (banco de dados relacional em memória, leve e rápido);
 * - OpenFeign (biblioteca que facilita a criação de clientes HTTP).
 *
 * @author iggonicollas
 * * <a href="https://github.com/iggonicollas">GitHub</a>
 *
 */

@SpringBootApplication
@EnableFeignClients
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
