package com.example.recyclerview.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.recyclerview.R;
import com.example.recyclerview.models.Task;
import com.example.recyclerview.viewholders.TaskViewHolder;

import java.util.List;

public class TaskAdapter extends RecyclerView.Adapter<TaskViewHolder> {

    private List<Task> tasks;

    public TaskAdapter(List<Task> list){
        tasks=list;
    }

    @NonNull
    @Override
    public TaskViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v= LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.view_holder_task,viewGroup,false);
        TaskViewHolder vh=new TaskViewHolder(v);

        Log.d("ololo","created "+i);

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull TaskViewHolder taskViewHolder, int i) {
        if(i==tasks.size()-1){
            i=0;
        }

        taskViewHolder.onBind(tasks.get(i));
        Log.d("ololo","onBind "+i);
    }

    @Override
    public int getItemCount() {
        return tasks.size();
    }
}
