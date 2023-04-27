package br.com.giulianabezerra.httpinterfaces;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.service.annotation.HttpExchange;

@SpringBootApplication
public class HttpInterfacesApplication {

	public static void main(String[] args) {
		SpringApplication.run(HttpInterfacesApplication.class, args);
	}

	@HttpExchange("/posts")
	interface PostClient {

		List<Post> list();

		Post get(Long id);

		Post create(Post post);

	}

	record Post(Long id, String title) {

	}

}
