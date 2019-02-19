package com.example.recyclerview.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.recyclerview.R;
import com.example.recyclerview.adapters.TaskAdapter;
import com.example.recyclerview.models.Task;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView tasksList;
    TaskAdapter taskAdapter;
    RecyclerView.LayoutManager layoutManager;

    List<Task> tasks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tasks=setTasks();
        initRecycler(tasks);
    }

    List<Task> setTasks(){
        List<Task> tasks=new ArrayList<>();
        tasks.add(new Task("Task 1"));
        tasks.add(new Task("Task 2"));
        tasks.add(new Task("Task 3"));
        tasks.add(new Task("Task 4"));
        tasks.add(new Task("Task 5"));
        tasks.add(new Task("Task 6"));
        tasks.add(new Task("Task 7"));
        tasks.add(new Task("Task 8"));
        tasks.add(new Task("Task 9"));
        tasks.add(new Task("Task 10"));
        tasks.add(new Task("Task 11"));
        tasks.add(new Task("Task 12"));
        tasks.add(new Task("Task 13"));
        tasks.add(new Task("Task 14"));
        tasks.add(new Task("Task 15"));
        tasks.add(new Task("Task 16"));
        tasks.add(new Task("Task 17"));
        return tasks;
    }

    void initRecycler(List<Task> tasks){
        layoutManager=new LinearLayoutManager(this);
        taskAdapter=new TaskAdapter(tasks);
        tasksList=findViewById(R.id.tasksRecyler);
        tasksList.setAdapter(taskAdapter);
        tasksList.setLayoutManager(layoutManager);
    }
}
