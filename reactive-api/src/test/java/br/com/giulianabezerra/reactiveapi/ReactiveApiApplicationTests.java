package br.com.giulianabezerra.reactiveapi;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class ReactiveApiApplicationTests {

	@Autowired
	private WebTestClient webClient;

	@Test
	void test() {
		User user = new User(null, "user", "123456", "user@email.com");

	}

}
