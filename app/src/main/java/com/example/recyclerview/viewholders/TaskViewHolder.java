package com.example.recyclerview.viewholders;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.recyclerview.R;
import com.example.recyclerview.interfaces.IOnClickListener;
import com.example.recyclerview.models.Task;
import com.squareup.picasso.Picasso;

public class TaskViewHolder extends RecyclerView.ViewHolder {

    private TextView title;
    private ImageView imageView;
    private TextView textOfTask;
    private IOnClickListener miOnClickListener;
    private int taskId;


    public TaskViewHolder(@NonNull View itemView,IOnClickListener iOnClickListener) {
        super(itemView);
        title=itemView.findViewById(R.id.vh_task_Title);
        imageView=itemView.findViewById(R.id.imageView);
        textOfTask=itemView.findViewById(R.id.textOfTask);
        miOnClickListener=iOnClickListener;

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                miOnClickListener.clickOn(taskId);
            }
        });
    }

    public void onBind(Task task){
        textOfTask.setText(task.getTextOfTask());
        title.setText(task.getTitle());
        Picasso.get().load("http://i.imgur.com/"+task.getImageURI()+".jpg").resize(150, 150)
                .centerCrop().into(imageView);
        taskId= Integer.getInteger(task.getImageURI());

    }
}
