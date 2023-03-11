/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 * 
 */

// Write your code here
package com.example.todo;

import org.springframework.web.bind.annotation.*;
import java.util.*;

import com.example.todo.Todo;
import com.example.todo.TodoService;

@RestController
public class TodoController {
    TodoService todoService = new TodoService();

    @GetMapping("/todos")
    public ArrayList<Todo> getTodos() {
        return todoService.getTodos();
    }

    @PostMapping("/todos")
    public Todo addTodo(@RequestBody Todo todo) {
        return todoService.addTodo(todo);
    }

    @GetMapping("/todos/{todoId}")
    public Todo getTodoById(@PathVariable int todoId) {
        return todoService.getTodoById(todoId);
    }

    @PutMapping("/todos/{todoId}")
    public Todo updateTodo(@PathVariable int todoId, @RequestBody Todo todo) {
        return todoService.updateTodo(todoId, todo);
    }

    @DeleteMapping("/todos/{todoId}")
    public void deleteTodo(@PathVariable int todoId) {
         todoService.deleteTodo(todoId);
    }
}