// Write your code here
package com.example.todo;

import com.example.todo.Todo;
import java.util.*;

public interface TodoRepository {
    ArrayList<Todo> getTodos();
    Todo addTodo(Todo todo);
    Todo getTodoById(int todoId);
    Todo updateTodo(int todoId, Todo todo);
    void deleteTodo(int todoId);
}