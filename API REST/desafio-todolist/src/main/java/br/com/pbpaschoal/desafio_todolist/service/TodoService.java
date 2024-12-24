package br.com.pbpaschoal.desafio_todolist.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.pbpaschoal.desafio_todolist.entity.Todo;
import br.com.pbpaschoal.desafio_todolist.repository.TodoRepository;

@Service
public class TodoService {
    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> create(Todo todo) { 
        todoRepository.save(todo);
        return list();
    }

    public List<Todo> list() { 
        Sort sort = Sort.by("prioridade").descending().and(Sort.by("nome").ascending());
        return todoRepository.findAll(sort);
    }

    public List<Todo> update(Todo todo) { 
        todoRepository.save(todo);
        return list();
    }

    public List<Todo> delete(Long id) { 
        todoRepository.deleteById(id);
        return list();
    }
}
