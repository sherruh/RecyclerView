package com.example.recyclerview.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.recyclerview.R;
import com.example.recyclerview.viewholders.TaskViewHolder;

public class TaskAdapter extends RecyclerView.Adapter<TaskViewHolder> {

    @NonNull
    @Override
    public TaskViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v= LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.view_holder_task,viewGroup,false);
        TaskViewHolder vh=new TaskViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull TaskViewHolder taskViewHolder, int i) {
        taskViewHolder.onBind("DEFAULT TEXT");
    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
