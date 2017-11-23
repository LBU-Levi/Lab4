package com.example.todolistapp;

import android.content.Context;

import java.util.ArrayList;
import java.util.UUID;

public class TodoModel {

    private static TodoModel sTodoModel;

    private ArrayList<Todo> mTodoList;

    public static TodoModel get(Context context) {
        if (sTodoModel == null) {
            sTodoModel = new TodoModel(context);
        }
        return sTodoModel;
    }

    private TodoModel(Context context){
        mTodoList = new ArrayList<>();

        // refactor to pattern for data plugins
        // simulate some data for testing

        for (int i=0; i < 3; i++){
            Todo todo = new Todo();
            todo.setTitle("Todo title " + i);
            todo.setDetail("Detail for task " + todo.getId().toString());
            todo.setComplete(false);

            mTodoList.add(todo);
        }

    }

    public Todo getTodo(UUID todoId) {

        for (Todo todo : mTodoList) {
            if (todo.getId().equals(todoId)){
                return todo;
            }
        }

        return null;
    }

    public ArrayList<Todo> getTodos() {

        return mTodoList;

    }

    public void addTodo(Todo todo){

        mTodoList.add(todo);

    }

}