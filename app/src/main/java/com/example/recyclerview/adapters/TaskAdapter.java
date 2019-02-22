package com.example.recyclerview.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;

import com.example.recyclerview.R;
import com.example.recyclerview.interfaces.IOnClickListener;
import com.example.recyclerview.models.Task;
import com.example.recyclerview.viewholders.TaskViewHolder;

import java.util.List;

public class TaskAdapter extends RecyclerView.Adapter<TaskViewHolder> {

    private List<Task> tasks;
    private IOnClickListener miOnClickListener;



    public TaskAdapter(List<Task> list,IOnClickListener iOnClickListener){
        tasks=list;
        miOnClickListener=iOnClickListener;
    }


    @NonNull
    @Override
    public TaskViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v= LayoutInflater.from(viewGroup.getContext()).
                inflate(R.layout.view_holder_task,viewGroup,false);
        TaskViewHolder vh=new TaskViewHolder(v,miOnClickListener);

        Log.d("ololo","created "+i);

        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull TaskViewHolder taskViewHolder, int i) {
        taskViewHolder.onBind(tasks.get(i%tasks.size()));
        Log.d("ololo","onBind "+i);
    }

    @Override
    public int getItemCount() {
        return tasks.size()*99999;
    }
}
