package com.example.recyclerview.activities;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

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
        Log.d("LifyCycleOfActivity","Created");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifyCycleOfActivity","Started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifyCycleOfActivity","Resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifyCycleOfActivity","Paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifyCycleOfActivity","Stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifyCycleOfActivity","Destroyed");
    }

    List<Task> setTasks(){
        List<Task> tasks=new ArrayList<>();
        tasks.add(new Task("Task 1","Text of this task","1"));
        tasks.add(new Task("Task 2","Text of this task","2"));
        tasks.add(new Task("Task 3","Text of this task","3"));
        tasks.add(new Task("Task 4","Text of this task","4"));
        tasks.add(new Task("Task 5","Text of this task","5"));
        tasks.add(new Task("Task 6","Text of this task","6"));
        tasks.add(new Task("Task 7","Text of this task","7"));
        tasks.add(new Task("Task 8","Text of this task","8"));
        tasks.add(new Task("Task 9","Text of this task","9"));
        tasks.add(new Task("Task 10","Text of this task","10"));
        tasks.add(new Task("Task 11","Text of this task","11"));
        tasks.add(new Task("Task 12","Text of this task","12"));
        tasks.add(new Task("Task 13","Text of this task","13"));
        tasks.add(new Task("Task 14","Text of this task","14"));
        tasks.add(new Task("Task 15","Text of this task","15"));
        tasks.add(new Task("Task 16","Text of this task","16"));
        tasks.add(new Task("Task 17","Text of this task","17"));
        tasks.add(new Task("Task 18","Text of this task","18"));
        tasks.add(new Task("Task 19","Text of this task","19"));
        tasks.add(new Task("Task 20","Text of this task","20"));
        tasks.add(new Task("Task 21","Text of this task","21"));
        tasks.add(new Task("Task 22","Text of this task","22"));
        tasks.add(new Task("Task 23","Text of this task","23"));
        return tasks;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==RESULT_OK){
            Task task=(Task)data.getSerializableExtra(Activity2.TASK_KEY);
            tasks.add(task);
        }
    }

    void initRecycler(List<Task> tasks){
        layoutManager=new LinearLayoutManager(this);
        taskAdapter=new TaskAdapter(tasks);
        tasksList=findViewById(R.id.tasksRecyler);
        tasksList.setAdapter(taskAdapter);
        tasksList.setLayoutManager(layoutManager);
    }

    public void onAddNewTask(View v){
        Intent intent=new Intent(this,Activity2.class);
        startActivityForResult(intent,1);
    }
}
