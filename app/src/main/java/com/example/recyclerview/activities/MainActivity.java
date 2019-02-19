package com.example.recyclerview.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.recyclerview.R;
import com.example.recyclerview.adapters.TaskAdapter;

public class MainActivity extends AppCompatActivity {

    RecyclerView tasksList;
    TaskAdapter taskAdapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layoutManager=new LinearLayoutManager(this);
        taskAdapter=new TaskAdapter();
        tasksList=findViewById(R.id.tasksRecyler);
        tasksList.setAdapter(taskAdapter);
        tasksList.setLayoutManager(layoutManager);
    }
}
