package com.example.todolistapp;

import android.content.Context;

import java.util.ArrayList;
import java.util.UUID;

public class TodoModel
{
    private static TodoModel sTodoModel;

    private ArrayList<TaskList> mTodoList;

    public static TodoModel get(Context context)
    {
        if (sTodoModel == null)
        {
            sTodoModel = new TodoModel(context);
        }
        return sTodoModel;
    }

    private TodoModel(Context context)
    {
        mTodoList = new ArrayList<>();

        // refactor to pattern for data plugins
        // simulate some data for testing

        for (int i = 0; i < 3; i++)
        {
            TaskList todo = new TaskList();
            todo.setTitle("Todo title " + i);
            todo.setDetail("Detail for task " + todo.getId().toString());
            todo.setComplete(false);

            mTodoList.add(todo);
        }
    }

    public TaskList getTodo(UUID todoId)
    {
        for (TaskList todo : mTodoList)
        {
            if (todo.getId().equals(todoId))
            {
                return todo;
            }
        }

        return null;
    }

    public ArrayList<TaskList> getTodos()
    {
        return mTodoList;
    }

    public void addTodo(TaskList todo)
    {
        mTodoList.add(todo);
    }
}