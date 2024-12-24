package br.com.pbpaschoal.desafio_todolist;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest
class DesafioTodolistApplicationTests {
	@Autowired
	private WebTestClient webTestClient;

	@Test
	void testCreateTodoSuccess() {
		var todo = new Todo("todo 1", "desc todo 1", false, 1);

		webTestClient
			.post()
			.uri("/todos")
			.bodyValue(todo)
			.exchange()
			.expectStatus().isOk()
			.expectBody()
			.jsonPath("$").isArray()
			.jsonPath("$.length()").isEqualTo(1)
			.jsonPath("$[0].nome").isEqualTo(todo.getNome())
			.jsonPath("$[0].nome").isEqualTo(todo.getDescricao())
			.jsonPath("$[0].nome").isEqualTo(todo.isRealizado())
			.jsonPath("$[0].nome").isEqualTo(todo.getPrioridade());
	}

	@Test
	void testCreateTodoFailure() {

	}
}
